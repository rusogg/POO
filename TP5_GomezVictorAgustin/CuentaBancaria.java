import java.util.*;
/**
 * Permite instanciar una cuenta bancaria
 * 
 * @author Gomez Victor Agustin
 * @version 1.0
 */
public class CuentaBancaria{
    // Atributos //
    
    
    private int nroCuenta;
    private double saldo;
    private Persona titular;

    
    // Constructores //

    
    public CuentaBancaria (int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0.0);
    }
    
    public CuentaBancaria (int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
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
    
    
    // Metodos //
    
    public double depositar(double p_importe){
        this.setSaldo(p_importe + this.getSaldo());
        return this.getSaldo();
    }
    
    public double extraer(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
        return this.getSaldo();
    }
    
    /**Muestra datos, algunos utilizando metodos de otra clase, por conocimiento de variable de instancia
     @param No recibe parametros
     @return No devuelve nada
     @throws No dispara ninguna excepción **/
    public void mostrar(){
        System.out.println ("-Cuenta bancaria-" + "\n" + "Titular: " + this.getTitular().nomYApe() + " (" + this.getTitular().edad() + " años)" +
        "\n" + "Saldo: " + this.getSaldo() );
    }
    
    /**Muestra datos, algunos utilizando metodos de otra clase, por conocimiento de variable de instancia
     @param No recibe parametros
     @return No devuelve nada
     @throws No dispara ninguna excepción **/
    public String toString(){
        return this.getNroCuenta() + "\t" + this.getTitular().nomYApe();
    }
}