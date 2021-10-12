import java.util.*;
/**
 * Permite instanciar un circulo
 * 
 * @author Gomez Victor Agustin
 * @version 1.0
 */
public class Circulo{
    // Atributos //
    
    
    private double radio;
    private Punto centro;

    
    // Constructores //

    
    public Circulo (double p_radio, Punto p_centro){
        this.setRadio(p_radio);
        this.setCentro(p_centro);
    }
    
    public Circulo (){
        this.setRadio(0.0);
        this.setCentro(new Punto(0.0, 0.0));
    }
    
    
    // Setters y getters //


    private void setRadio(double p_radio){
        this.radio = p_radio;
    }
    public double getRadio(){
        return this.radio;
    }
    
    private void setCentro(Punto p_centro){
        this.centro = p_centro;
    }
    public Punto getCentro(){
        return this.centro;
    }
    
    
    // Metodos //
    
    
    /**Manda un mensaje desplazar a la clase Punto del objeto instanciado en ese momento
     @param double dx, double dy
     @return No devuelve nada
     @throws No dispara ninguna excepción **/
    public void desplazar(double dx, double dy){
        this.getCentro().desplazar(dx, dy) ;
    }

    public void caracteristicas(){
        System.out.println("*********Circulo*********");
        System.out.println("Centro: " + this.getCentro().coordenadas() + "\t" +"-Radio: " + this.getRadio() + "\n" + "Superficie: " + superficie() + "\t" +
        "-Perimetro: " + perimetro());
    }
    
    
    public double perimetro(){
        return 2 * Math.PI * this.getRadio();
    }
    
    public double superficie(){
        return Math.PI * Math.pow ( ( this.getRadio() ), 2);
    }
    
    /**Manda un mensaje DistanciaA a la clase Punto del objeto instanciado en ese momento, con el parametro del centro de otro circulo
     @param Circulo otroCirculo
     @return Devuelve una variable de tipo double
     @throws No dispara ninguna excepción **/
    public double distanciaA(Circulo otroCirculo){
        return this.getCentro().distanciaA(otroCirculo.getCentro());
    }
    
    /**Compara la superficie del objeto actual, con otro recibido como parametro
     @param Circulo otroCirculo
     @return Devuelve una variable de tipo Circulo
     @throws No dispara ninguna excepción **/
    public Circulo elMayor(Circulo otroCirculo){
        if ( this.superficie() > otroCirculo.superficie() ){
            return this;
        } else {
            return otroCirculo;
    }
       }
}