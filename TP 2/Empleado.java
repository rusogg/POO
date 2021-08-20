import java.util.*;
public class Empleado{
    // Atributos //
    
    
    private long cuil;
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private int anioIngreso;

    
    // Constructores //

    
    public Empleado (long p_cuil,String p_nombre,String p_apellido, double p_importe, int p_anioingreso){
        this.setCuil(p_cuil);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anioingreso);
    }
    
    
    // Setters y getters //

    
    private void setCuil(long p_cuil){
        this.cuil = p_cuil;
    }
    public long getCuil(){
        return this.cuil;
    }

    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    public String getApellido(){
        return this.apellido;
    }   
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setSueldoBasico(double p_importe){
        this.sueldoBasico = p_importe;
    }
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    
    public void setAnioIngreso(int p_anioIngreso){
        this.anioIngreso = p_anioIngreso;
    }
    public int getAnioIngreso(){
        return this.anioIngreso;
    }
    
    
    // Metodos //
    
    
    /**Al año actual le resta el año de ingreso y devuelve la antiguedad
     @param No recibe parametros
     @return Devuelve una variable de tipo int
     @throws No dispara ninguna excepción **/
    public int antiguedad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        
        return anioHoy - this.getAnioIngreso();
    }

    /**Obtiene el 2% del sueldo basico, a eso le suma 12 de seguro de vida y devuelve el descuento
     @param No recibe parametros
     @return Devuelve una variable de tipo double
     @throws No dispara ninguna excepción **/
    private double descuento(){
        double obraSocial = (2 * this.getSueldoBasico()) / 100;
        double seguroDeVida = 12;
        return obraSocial + seguroDeVida;
    }
    
    /**Si la antiguedad es menor a 2 devuelve adicional del 2% del sueldo basico, si tiene entre 2 a 9 devuelve adicional del 4%, sino devuelve del 6%
     @param No recibe parametros
     @return Devuelve una variable de tipo double
     @throws No dispara ninguna excepción **/
    private double adicional(){
        double adicional;
        if (this.antiguedad() < 2){
            adicional = (2 * this.getSueldoBasico()) / 100;
        }
        else if( this.antiguedad() >= 2 && antiguedad()< 10 ){
            adicional = (4 * this.getSueldoBasico()) / 100;
        }
        else {
            adicional = (6 * this.getSueldoBasico()) / 100;
        }
        return adicional;
    }
    
    /**Suma el sueldo basico, mas el adicional y resta los descuentos
     @param No recibe parametros
     @return Devuelve una variable de tipo double
     @throws No dispara ninguna excepción **/
    public double sueldoNeto(){
        return (this.getSueldoBasico() + this.adicional()) - this.descuento();
    }
    
    /**Devuelve nombre y apellido
     @param No recibe parametros 
     @return Devuelve una variable de tipo String
     @throws No dispara ninguna excepción **/
     public String nomYApe(){
        return this.getNombre()+ " " + this.getApellido();
    }
    
    /**Devuelve apellido y nombre
     @param No recibe parametros 
     @return Devuelve una variable de tipo String
     @throws No dispara ninguna excepción **/
    public String apeYNom(){
        return this.getApellido() + " " + this.getNombre();
    }  
    
    public void mostrar(){
        System.out.println ("Nombre y Apellido: " + this.nomYApe() + "\n" + "CUIL: " + this.getCuil() + "  Antigüedad: " + this.antiguedad() + " años de servicio" +
        "\n" + "Sueldo Neto: $"+ this.sueldoNeto());
        
    }
    
    /**Devuelve cadena con el cuil, nombre y sueldo neto
     @param No recibe parametros
     @return Devuelve una variable de tipo String
     @throws No dispara ninguna excepción **/
    public String mostrarLinea(){
        return  this.getCuil() + " " + this.apeYNom() + " ............$" + this.sueldoNeto();
    }
}
    