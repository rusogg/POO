import java.util.*;
/**
 * Permite instanciar una caja de ahorro
 * 
 * @author Gomez Victor Agustin
 * @version 1.0
 */
public class CajaDeAhorro{
    // Atributos //
    
    
    private int nroCuenta;
    private double saldo;
    private int extraccionesPosibles;
    private Persona titular;

    
    // Constructores //

    
    public CajaDeAhorro (int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0.0);
        this.setExtraccionesPosibles(10);
    }
    
    public CajaDeAhorro (int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
        this.setExtraccionesPosibles(10);
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
    
    private void setExtraccionesPosibles(int p_extraccionesPosibles){
        this.extraccionesPosibles = p_extraccionesPosibles;
    }
    public int getExtraccionesPosibles(){
        return this.extraccionesPosibles;
    }
    
    
    // Metodos //
    
    
    /**Retorna si puede extraer o no, segun si todavia tiene extracciones disponibles
     @param double p_importe
     @return Devuelve una variable de tipo Boolean
     @throws No dispara ninguna excepción **/
    private Boolean puedeExtraer(double p_importe){
        return this.getExtraccionesPosibles() > 0 && p_importe <= this.getSaldo();
    }
    
    public double depositar(double p_importe){
        this.setSaldo(p_importe + this.getSaldo());
        return this.getSaldo();
    }
    
    /**Si esta habilitado a extraer, manda mensaje a extraccion, si no tiene extracciones posibles muestra leyenda, y si no significa que no hay saldo
     @param double p_importe
     @return No devuelve nada
     @throws No dispara ninguna excepción **/
    public void extraer(double p_importe){
        if (puedeExtraer(p_importe)){
            this.extraccion(p_importe) ;
        }
        else {
            if (this.getExtraccionesPosibles() < 1 ){
                System.out.println("No tiene habilitadas mas extracciones!");
            } else {
                System.out.println("No puede extraer mas que el saldo!");
            }
        }
    }
    
    /**Realiza la extraccion, resta el numero de extracciones posibles y muestra leyenda
     @param double p_importe
     @return No devuelve nada
     @throws No dispara ninguna excepción **/
    private void extraccion(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
        this.setExtraccionesPosibles(this.getExtraccionesPosibles() - 1);
        System.out.println("Extraccion realizada de " + p_importe + " pesos");
    }
    
    public void mostrar(){
        System.out.println ("\n" + "-Caja de ahorro-" + "\n" + "Nro de cuenta: " + this.getNroCuenta() + " Saldo: " + this.getSaldo() + "\n" + "Titular: " + 
        this.getTitular().nomYApe() +  "\n" + "Extracciones posibles: " + this.getExtraccionesPosibles() + "\n" );
    }
    

}