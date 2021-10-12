import java.util.*;
/**
 * Permite crear comercios
 * 
 * @author Gomez Victor Agustin
 * @version 1.0
 */
public class Comercio{
     
    
    // Atributos //
    
    
    private String nombre;
    private HashMap<Long,Empleado> empleados;
    
    
    // Constructores //
    
    
    public Comercio(String p_nombre){
        this.setNombre(p_nombre);
        this.setEmpleados(new HashMap<>());
    }
    
    public Comercio(String p_nombre, HashMap p_empleado){
        this.setNombre(p_nombre);
        this.setEmpleados(p_empleado);
    }
    
    
    // Setters y getters //
    
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    public void setEmpleados(HashMap<Long,Empleado> p_empleados) {
        this.empleados = p_empleados;
    }
    public HashMap<Long,Empleado> getEmpleados() {
        return this.empleados;
    }
    
    
    // Metodos //
    
    /**Permite agregar un objeto al hashmap
     @param Empleado p_empleado
     @return No devuelve nada
     @throws No dispara ninguna excepción **/
    public void altaEmpleado(Empleado p_empleado){
        if ( this.esEmpleado(p_empleado.getCuil() ) ) {
           System.out.println ( "El empleado ya fue dado de alta anteriormente" );
        }
        else {
            this.getEmpleados().put(p_empleado.getCuil(),p_empleado); 
        }
    }
    
    /**Permite quitar un objeto al hashmap
     @param long p_cuil
     @return Devuelve una variable de tipo Alumno
     @throws No dispara ninguna excepción **/
    public Empleado bajaEmpleado(long p_cuil){
        if ( this.esEmpleado(p_cuil) ) {
            Empleado aux = this.getEmpleados().get(p_cuil);
            this.getEmpleados().remove(p_cuil);
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
    public int cantidadDeEmpleados(){
        return this.getEmpleados().size();
    }
    
    /**Controla si el objeto existe en el HashMap mediante el key
     @param long p_cuil
     @return Devuelve una variable de tipo Boolean
     @throws No dispara ninguna excepción **/
    public boolean esEmpleado(long p_cuil){
        return this.getEmpleados().containsKey(p_cuil);
    }
    
    /**Busca el objeto en el HashMap mediante el numero de key, y lo devuelve
     @param long p_cuil
     @return Devuelve una variable de tipo Empleado
     @throws No dispara ninguna excepción **/
    public Empleado buscarEmpleado(long p_cuil){
        if ( this.esEmpleado(p_cuil) ){
            return this.getEmpleados().get(p_cuil);
        }
        else {
            return null;
        }
    }
    
    /**Busca el objeto en el HashMap mediante el numero de key, e imprime el sueldo neto
     @param long p_cuil
     @return No devuelve nada
     @throws No dispara ninguna excepción **/
    public void sueldoNeto(long p_cuil){
        if ( this.esEmpleado(p_cuil ) ){
            System.out.println( "Sueldo neto: " + this.getEmpleados().get(p_cuil).sueldoNeto() );
        }
        else {
            System.out.println ( "No existe el empleado" );
        }
    }
    
    /**Muestra todos los objetos del HashMap
     @param No recibe ningun parametro
     @return No devuelve nada
     @throws No dispara ninguna excepción **/
    public void nomina(){
        Iterator iterador = this.getEmpleados().entrySet().iterator();
        Map.Entry empleado;
        System.out.println("**** Nomina de empleados de " + this.getNombre() + " ****");
        while (iterador.hasNext()) {
            empleado = (Map.Entry) iterador.next();
            Empleado empleadoAux = (Empleado)empleado.getValue();
            System.out.println(empleado.getKey() + " " + empleadoAux.apeYNom() + "----------------------$" + empleadoAux.sueldoNeto());
        }
    }
}