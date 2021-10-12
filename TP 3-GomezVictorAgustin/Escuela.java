/**
 * Permite instanciar una escuela
 * 
 * @author Gomez Victor Agustin
 * @version 1.0
 */
public class Escuela{
    // Atributos //
    
    
    private String nombre;
    private String domicilio;
    private String director;

    
    // Constructores //

    
    public Escuela (String p_nombre, String p_domicilio, String p_director){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setDirector(p_director);
    }
    
    
    // Setters y getters //


    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    public String getDomicilio(){
        return this.domicilio;
    }
    
    private void setDirector(String p_director){
        this.director = p_director;
    }
    public String getDirector(){
        return this.director;
    }
    
    
    // Metodos //
    
    
    /**Muestra datos, algunos utilizando metodos de otra clase, por conocimiento de parametro con otro Docente
     @param Docente p_docente
     @return No devuelve nada
     @throws No dispara ninguna excepción **/
    public void imprimirRecibo(Docente p_docente){
        System.out.println("Escuela: " + this.getNombre() + "\t" + "Domicilio: " + this.getDomicilio() + "\t" + "Director: " + this.getDirector() + "\n"
        + "-----------------------------------------------------------------------------------------" + "\n" + "Docente: " + p_docente.getNombre() + "\n" +
        "Sueldo:........................ $" + p_docente.calcularSueldo() + "\n" + "Sueldo Basico.................. $" + p_docente.getSueldoBasico() + "\n"
        + "Asignacion familiar............ $"+ p_docente.getAsignacionFamiliar() );
    }
    
    
}