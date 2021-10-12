import java.util.*;
/**
 * Permite instanciar un Rectangulo
 * 
 * @author Gomez Victor Agustin
 * @version 1.0
 */
public class Rectangulo{
    // Atributos //
    
    
    private Punto origen;
    private double ancho;
    private double alto;

    
    // Constructores //

    
    public Rectangulo (Punto p_origen, double p_ancho, double p_alto){
        this.setOrigen(p_origen);
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
    
    public Rectangulo (double p_ancho, double p_alto){
        this.setOrigen(new Punto ( 0.0 , 0.0 ));
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
    
    
    // Setters y getters //


    private void setAncho(double p_ancho){
        this.ancho = p_ancho;
    }
    
    public double getAncho(){
        return this.ancho;
    }
    
    private void setAlto(double p_alto){
        this.alto = p_alto;
    }
    public double getAlto(){
        return this.alto;
    }
    
    private void setOrigen(Punto p_origen){
        this.origen = p_origen;
    }
    public Punto getOrigen(){
        return this.origen;
    }
    
    
    // Metodos //
    
    
    /**Manda un mensaje desplazar a la clase Punto del objeto instanciado en ese momento
     @param double dx, double dy
     @return No devuelve nada
     @throws No dispara ninguna excepción **/
    public void desplazar(double dx, double dy){
        this.getOrigen().desplazar(dx, dy) ;
    }

    public void caracteristicas(){
        System.out.println("*********Rectangulo*********");
        System.out.println("Origen: " + this.getOrigen().coordenadas() + " - Alto: " + this.getAlto() +  " - Ancho: " + this.getAncho() + "\n" +
        "Superficie: " + superficie() + " - Perimetro: " + perimetro());
    }
    
    
    public double perimetro(){
        return 2 * (this.getAncho() + this.getAlto());
    }
    
    public double superficie(){
        return this.getAncho() * this.getAlto();
    }
    
    /**Manda un mensaje DistanciaA a la clase Punto del objeto instanciado en ese momento, con el parametro del origen de otro rectangulo
     @param Rectangulo otroRectangulo
     @return Devuelve una variable de tipo double
     @throws No dispara ninguna excepción **/
    public double distanciaA(Rectangulo otroRectangulo){
        return this.getOrigen().distanciaA(otroRectangulo.getOrigen());
    }
    
    /**Compara la superficie del objeto actual, con otro recibido como parametro
     @param Rectangulo otroRectangulo
     @return Devuelve una variable de tipo Rectangulo
     @throws No dispara ninguna excepción **/
    public Rectangulo elMayor(Rectangulo otroRectangulo){
        if ( this.superficie() > otroRectangulo.superficie() ){
            return this;
        } else {
            return otroRectangulo;
    }
       }
}