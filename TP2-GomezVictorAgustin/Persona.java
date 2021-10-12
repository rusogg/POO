import java.util.*;
public class Persona{
    // Atributos //
    
    
    private int nroDni;
    private String nombre;
    private String apellido;
    private int anioNacimiento;
    
    
    // Constructores //


    public Persona (int p_nroDni,String p_nombre,String p_apellido,int p_anioNacimiento){
        this.setNroDni(p_nroDni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anioNacimiento);
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

    private void setAnioNacimiento(int p_anioNacimiento){
        this.anioNacimiento = p_anioNacimiento;
    }
    public int getAnioNacimiento(){
        return this.anioNacimiento;
    }

    
    // Metodos //
    
    
    /**Al año actual le resta el año de nacimiento y devuelve la edad
     @param No recibe parametros
     @return Devuelve una variable de tipo int
     @throws No dispara ninguna excepción **/
    public int edad(){
        Calendar fechaHoy = new GregorianCalendar();
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
    
}
    