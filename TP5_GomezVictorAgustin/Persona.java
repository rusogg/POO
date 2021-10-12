import java.util.*;
/**
 * Permite instanciar una persona
 * 
 * @author Gomez Victor Agustin
 * @version 2.0
 */
public class Persona{
    // Atributos //
    
    
    private int nroDni;
    private String nombre;
    private String apellido;
    private Calendar fechaNacimiento;
    
    
    // Constructores //


    public Persona (int p_nroDni,String p_nombre,String p_apellido,int p_anioNacimiento){
        this.setNroDni(p_nroDni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anioNacimiento);
    }
    
    public Persona (int p_nroDni,String p_nombre,String p_apellido,Calendar p_fecha){
        this.setNroDni(p_nroDni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setFechaNacimiento(p_fecha);
    }
    
    // Setters y getters //

    
    private void setNroDni(int p_nroDni){
        this.nroDni = p_nroDni;
    }
    public int getNroDni(){
        return this.nroDni;
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    public String getApellido(){
        return this.apellido;
    }
    
    /**Crea un objeto calendar anio, y le asigna el int de anionacimiento al anio de ese objeto y una fecha establecida
     @param int p_anioNacimiento
     @return No devuelve nada
     @throws No dispara ninguna excepción **/
    private void setAnioNacimiento(int p_anioNacimiento){
        Calendar anio = new GregorianCalendar(p_anioNacimiento, Calendar.FEBRUARY, 22, 23, 11, 44);
        
        this.setFechaNacimiento (anio);
    }
    /**Crea una variable anio, tomando el anio de la variable de instancia fechaNacimiento
     @param No recibe parametros
     @return Devuelve una variable de tipo int
     @throws No dispara ninguna excepción **/
    public int getAnioNacimiento(){
        int anio = this.getFechaNacimiento().get(Calendar.YEAR);
        return anio;
    }

    private void setFechaNacimiento(Calendar p_fecha){
        this.fechaNacimiento = p_fecha;
    }
    public Calendar getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    
    
    // Metodos //
    
    
    /**Al año actual le resta el año de nacimiento y devuelve la edad
     @param No recibe parametros
     @return Devuelve una variable de tipo int
     @throws No dispara ninguna excepción **/
    public int edad(){
        Calendar fechaHoy = new GregorianCalendar(); //conocimiento por variable temporal
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        
        
        return anioHoy - this.getAnioNacimiento();
    }

    /**Devuelve nombre y apellido
     @param No recibe parametros 
     @return Devuelve una variable de tipo String
     @throws No dispara ninguna excepción **/
    public String nomYApe(){
        return this.getNombre()+ " " + this.getApellido();
    }
    
    /**Dvuelve apellido y nombre
     @param No recibe parametros 
     @return Devuelve una variable de tipo String
     @throws No dispara ninguna excepción **/
    public String apeYNom(){
        return this.getApellido() + " " + this.getNombre();
    }
    
    public void mostrar(){
        System.out.println ("Nombre y apellido: " + this.nomYApe() + "\n" + "DNI: " + this.getNroDni() + "  Edad: " + edad() + " años");
    }
    
    /**Compara anio, mes y dia entre el objeto y la fecha de hoy, para verificar si es el cumpleanios o no
     @param No recibe parametros 
     @return Devuelve una variable de tipo boolean
     @throws No dispara ninguna excepción **/
    public boolean esCumpleanios(){
        Calendar fechaHoy= Calendar.getInstance();
        return  fechaHoy.get(Calendar.MONTH) == this.getFechaNacimiento().get(Calendar.MONTH) &&
                    fechaHoy.get(Calendar.DATE) == this.getFechaNacimiento().get(Calendar.DATE);
    }
}