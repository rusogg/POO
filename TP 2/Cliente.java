import java.util.*;
public class Cliente{
    // Atributos //
    
    
    private int nroDNI;
    private String apellido;
    private String nombre;
    private double saldo;
    

    // Constructores //
    

    public Cliente (int p_nroDNI,String p_apellido,String p_nombre,double p_importe){
        this.setNroDNI(p_nroDNI);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSaldo(p_importe);
    }
    
    
    // Setters y getters //

    
    private void setNroDNI(int p_nroDNI){
        this.nroDNI = p_nroDNI;
    }
    public int getNroDNI(){
        return this.nroDNI;
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

    private void setSaldo(double p_importe){
        this.saldo = p_importe;
    }
    public double getSaldo(){
        return this.saldo;
    }
    
    
    // Metodos //
    
    
    /**Reemplaza saldo por otro valor recibido
     @param double p_importe
     @return Devuelve una variable de tipo double
     @throws No dispara ninguna excepción **/
    public double nuevoSaldo(double p_importe){
        this.setSaldo(p_importe);
        return this.getSaldo();
    }

    /**Suma a saldo otro valor recibido y devuelve el total
     @param double p_importe
     @return Devuelve una variable de tipo double
     @throws No dispara ninguna excepción **/
    public double agregaSaldo(double p_importe){
        this.setSaldo(p_importe + this.getSaldo());
        return this.getSaldo();
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
        System.out.println ("-Cliente-" + "\n" + "Nombre y Apellido: " + this.nomYApe() + "(" + this.getNroDNI() + ")" + "\n" + "Saldo: $" + this.getSaldo()  );
    }
    
}