/**
 * Permite instanciar un docente
 * 
 * @author Gomez Victor Agustin
 * @version 1.0
 */
public class Docente{
    // Atributos //
    
    
    private String nombre;
    private String grado;
    private double sueldoBasico;
    private double asignacionFamiliar;

    
    // Constructores //

    
    public Docente (String p_nombre, String p_grado, double p_sueldoBasico, double p_asignacionFamiliar){
        this.setNombre(p_nombre);
        this.setGrado(p_grado);
        this.setSueldoBasico(p_sueldoBasico);
        this.setAsignacionFamiliar(p_asignacionFamiliar);
    }
    
    
    // Setters y getters //


    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    private void setGrado(String p_grado){
        this.grado = p_grado;
    }
    public String getGrado(){
        return this.grado;
    }
    
    private void setSueldoBasico(double p_sueldoBasico){
        this.sueldoBasico = p_sueldoBasico;
    }
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    
    private void setAsignacionFamiliar(double p_asignacionFamiliar){
        this.asignacionFamiliar= p_asignacionFamiliar;
    }
    public double getAsignacionFamiliar(){
        return this.asignacionFamiliar;
    }
    
    
    // Metodos //
    
    
    public double calcularSueldo(){
        return this.getSueldoBasico() + this.getAsignacionFamiliar() ;
    }
    
    
}