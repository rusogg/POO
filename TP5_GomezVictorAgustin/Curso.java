import java.util.*;
/**
 * Permite crear cursos
 * 
 * @author Gomez Victor Agustin
 * @version 1.0
 */
public class Curso{
     
    
    // Atributos //
    
    
    private String nombre;
    private HashMap<Integer,Alumno> alumnos;
    
    
    // Constructores //
    
    
    public Curso(String p_nombre){
        this.setNombre(p_nombre);
        this.setAlumnos(new HashMap<>());
    }
    
    public Curso(String p_nombre, HashMap p_alumno){
        this.setNombre(p_nombre);
        this.setAlumnos(p_alumno);
    }
    
    
    // Setters y getters //
    
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    public void setAlumnos(HashMap<Integer,Alumno> p_alumnos) {
        this.alumnos = p_alumnos;
    }
    public HashMap<Integer,Alumno> getAlumnos() {
        return this.alumnos;
    }
    
    
    // Metodos //
    
    /**Permite agregar un objeto al hashmap
     @param Alumno p_alumno
     @return No devuelve nada
     @throws No dispara ninguna excepción **/
    public void inscribirAlumno(Alumno p_alumno){
        if ( this.estaInscripto(p_alumno) ) {
           System.out.println ( "El alumno ya se encuentra inscipto" );
        }
        else {
            this.getAlumnos().put(p_alumno.getLu(),p_alumno); 
        }
    }
    
    /**Permite quitar un objeto al hashmap
     @param int p_lu
     @return Devuelve una variable de tipo Alumno
     @throws No dispara ninguna excepción **/
    public Alumno quitarAlumno(int p_lu){
        if ( this.estaInscripto(p_lu) ) {
            Alumno aux = this.getAlumnos().get(p_lu);
            this.getAlumnos().remove(p_lu);
            return aux;
        }
        else {
            return null;
        }
    }
    
    /**Devuelve el tamanio del HashMap
     @param No recibe nada
     @return Devuelve una variable de tipo Int
     @throws No dispara ninguna excepción **/
    public int cantidadDeAlumnos(){
        return this.getAlumnos().size();
    }
    
    /**Controla si el objeto existe en el HashMap
     @param Alumno p_alumno
     @return Devuelve una variable de tipo Boolean
     @throws No dispara ninguna excepción **/
    public boolean estaInscripto(Alumno p_alumno){
        return this.getAlumnos().containsKey(p_alumno.getLu());
    }
    
    /**Controla si el objeto existe en el HashMap mediante el numero de key
     @param int p_lu
     @return Devuelve una variable de tipo Boolean
     @throws No dispara ninguna excepción **/
    public boolean estaInscripto(int p_lu){
        return this.getAlumnos().containsKey(p_lu);
    }
    
    /**Busca el objeto en el HashMap mediante el numero de key, y lo devuelve
     @param int p_lu
     @return Devuelve una variable de tipo Alumno
     @throws No dispara ninguna excepción **/
    public Alumno buscarAlumno(int p_lu){
        if ( this.estaInscripto(p_lu) ){
            return this.getAlumnos().get(p_lu);
        }
        else {
            return null;
        }
    }
    
    /**Busca el objeto en el HashMap mediante el numero de key, e imprime el promedio
     @param int p_lu
     @return No devuelve nada
     @throws No dispara ninguna excepción **/
    public void imprimirPromedioDelAlumno(int p_lu){
        if ( this.estaInscripto(p_lu) ){
            System.out.println( "Promedio: " + this.getAlumnos().get(p_lu).promedio() );
        }
        else {
            System.out.println ( "No existe el alumno" );
        }
    }
    
    /**Muestra todos los objetos del HashMap
     @param No recibe ningun parametro
     @return No devuelve nada
     @throws No dispara ninguna excepción **/
    public void mostrarInscriptos(){
        Iterator iterador = this.getAlumnos().entrySet().iterator();
        Map.Entry alumno;
        while (iterador.hasNext()) {
            alumno = (Map.Entry) iterador.next();
            Alumno alumnoAux = (Alumno)alumno.getValue();
            System.out.println(alumno.getKey() + " " + alumnoAux.nomYApe() );
        }
    }
}