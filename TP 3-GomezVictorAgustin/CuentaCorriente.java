import java.util.*;
/**
 * Permite instanciar una cuenta corriente
 * 
 * @author Gomez Victor Agustin
 * @version 1.0
 */
public class CuentaCorriente{
    // Atributos //
    
    
    private int nroCuenta;
    private double saldo;
    private double limiteDescubierto;
    private Persona titular;

    
    // Constructores //

    
    public CuentaCorriente (int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0.0);
        this.setLimiteDescubierto(500);
    }
    
    public CuentaCorriente (int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
        this.setLimiteDescubierto(500);
    }
    
    
    // Setters y getters //


    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    public double getSaldo(){
        return this.saldo;
    }
    
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    public Persona getTitular(){
        return this.titular;
    }
    
    private void setLimiteDescubierto(double p_limiteDescubierto){
        this.limiteDescubierto = p_limiteDescubierto;
    }
    public double getLimiteDescubierto(){
        return this.limiteDescubierto;
    }
    
    
    // Metodos //
    
    /**Retorna si puede extraer o no, segun si todavia tiene limite de descubierto
     @param double p_importe
     @return Devuelve una variable de tipo Boolean
     @throws No dispara ninguna excepción **/
    private Boolean puedeExtraer(double p_importe){
        return p_importe <= ( this.getLimiteDescubierto() + this.getSaldo() );
    }
    
    public double depositar(double p_importe){
        this.setSaldo(p_importe + this.getSaldo());
        return this.getSaldo();
    }
    
    /**Si esta habilitado a extraer, manda mensaje a extraccion, sino no tiene mas limite de descubierto
     @param double p_importe
     @return No devuelve nada
     @throws No dispara ninguna excepción **/
    public void extraer(double p_importe){
        if (puedeExtraer(p_importe)){
            this.extraccion(p_importe) ;
        }else {   
        System.out.println("El importe de extraccion sobrepasa el límite de descubierto!");   
        }
    }
    
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
        System.out.println("Extraccion realizada de " + p_importe + " pesos");
    }
    
    public void mostrar(){
        System.out.println ( "\n" +"-Cuenta corriente-" + "\n" + "Nro de cuenta: " + this.getNroCuenta() + " Saldo: " + this.getSaldo() + "\n" + "Titular: " + 
        this.getTitular().nomYApe() +  "\n" + "Limite de descubierto: " + this.getLimiteDescubierto() + "\n");
    }
    

}