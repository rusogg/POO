import java.util.*;
/**
 * Permite instanciar un empleado con o sin jefe
 * 
 * @author Gomez Victor Agustin
 * @version 1.0
 */
public class EmpleadoConJefe{
    // Atributos //
    
    
    private long cuil;
    private String nombre;
    private String apellido;
    private double sueldoBasico;
    private Calendar fechaIngreso;
    private EmpleadoConJefe jefe;

    
    // Constructores //

    
    public EmpleadoConJefe (long p_cuil,String p_nombre,String p_apellido, double p_importe, int p_anioingreso){
        this.setCuil(p_cuil);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anioingreso);
        this.setJefe(null);
    }
    
    public EmpleadoConJefe (long p_cuil,String p_nombre,String p_apellido, double p_importe, Calendar p_fechaIngreso){
        this.setCuil(p_cuil);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fechaIngreso);
        this.setJefe(null);
    }
    
    public EmpleadoConJefe (long p_cuil,String p_nombre,String p_apellido, double p_importe, Calendar p_fechaIngreso, EmpleadoConJefe p_empleadoConJefe){
        this.setCuil(p_cuil);
        this.setNombre(p_nombre);   
        this.setApellido(p_apellido);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fechaIngreso);
        this.setJefe(p_empleadoConJefe);
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
    
    /**Crea un objeto calendar anio, y le asigna el int de anioIngreso al anio de ese objeto y una fecha establecida
     @param int p_anioIngreso
     @return No devuelve nada
     @throws No dispara ninguna excepci??n **/
    private void setAnioIngreso(int p_anioIngreso){
        Calendar anio = new GregorianCalendar(p_anioIngreso, Calendar.FEBRUARY, 22, 23, 11, 44);
        
        this.fechaIngreso = anio;
    }
    /**Crea una variable anio, tomando el anio de la variable de instancia FechaIngreso
     @param No recibe parametros
     @return Devuelve una variable de tipo int
     @throws No dispara ninguna excepci??n **/
    public int getAnioIngreso(){
        int anio = this.getFechaIngreso().get(Calendar.YEAR);
        return anio;
    }
    
    public void setFechaIngreso(Calendar p_fechaIngreso){
        this.fechaIngreso = p_fechaIngreso;
    }
    public Calendar getFechaIngreso(){
        return this.fechaIngreso;
    }
    
    public void setJefe(EmpleadoConJefe p_jefe){
        this.jefe = p_jefe;
    }
    public EmpleadoConJefe getJefe(){
        return this.jefe;
    }
    
    
    // Metodos //
    
    
    /**Al a??o actual le resta el a??o de ingreso y devuelve la antiguedad
     @param No recibe parametros
     @return Devuelve una variable de tipo int
     @throws No dispara ninguna excepci??n **/
    public int antiguedad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        
        return anioHoy - this.getAnioIngreso();
    }

    /**Obtiene el 2% del sueldo basico, a eso le suma 12 de seguro de vida y devuelve el descuento
     @param No recibe parametros
     @return Devuelve una variable de tipo double
     @throws No dispara ninguna excepci??n **/
    private double descuento(){
        double obraSocial = (2 * this.getSueldoBasico()) / 100;
        double seguroDeVida = 12;
        return obraSocial + seguroDeVida;
    }
    
    /**Si la antiguedad es menor a 2 devuelve adicional del 2% del sueldo basico, si tiene entre 2 a 9 devuelve adicional del 4%, sino devuelve del 6%
     @param No recibe parametros
     @return Devuelve una variable de tipo double
     @throws No dispara ninguna excepci??n **/
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
     @throws No dispara ninguna excepci??n **/
    public double sueldoNeto(){
        return (this.getSueldoBasico() + this.adicional()) - this.descuento();
    }
    
    /**Devuelve nombre y apellido
     @param No recibe parametros 
     @return Devuelve una variable de tipo String
     @throws No dispara ninguna excepci??n **/
     public String nomYApe(){
        return this.getNombre()+ " " + this.getApellido();
    }
    
    /**Devuelve apellido y nombre
     @param No recibe parametros 
     @return Devuelve una variable de tipo String
     @throws No dispara ninguna excepci??n **/
    public String apeYNom(){
        return this.getApellido() + ", " + this.getNombre();
    }  
    
    public void mostrar(){
        System.out.println ("Nombre y Apellido: " + this.nomYApe() + "\n" + "CUIL: " + this.getCuil() + "  Antig??edad: " + this.antiguedad() + " a??os de servicio" +
        "\n" + "Sueldo Neto: $"+ this.sueldoNeto());
        if ( getJefe() == null ){
            System.out.println ( "Gerente-General" );
        } else {
            System.out.println ( "Responde a: " + this.getJefe().apeYNom() );
        }
        
    }
    
    /**Devuelve cadena con el cuil, nombre y sueldo neto
     @param No recibe parametros
     @return Devuelve una variable de tipo String
     @throws No dispara ninguna excepci??n **/
    public String mostrarLinea(){
        return  this.getCuil() + " " + this.apeYNom() + " ............$" + this.sueldoNeto();
    }
    
    /**Compara anio, mes y dia entre el objeto y la fecha de hoy, para verificar si es el aniversario o no
     @param No recibe parametros 
     @return Devuelve una variable de tipo boolean
     @throws No dispara ninguna excepci??n **/
    public boolean esAniversario(){
        Calendar fechaHoy= Calendar.getInstance();
        return fechaHoy.get(Calendar.YEAR) == this.getFechaIngreso().get(Calendar.YEAR) && 
                fechaHoy.get(Calendar.MONTH) == this.getFechaIngreso().get(Calendar.MONTH) &&
                    fechaHoy.get(Calendar.DATE) == this.getFechaIngreso().get(Calendar.DATE);
    }
}