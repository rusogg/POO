import java.util.*;
/**
 * Permite instanciar un punto
 * 
 * @author Gomez Victor Agustin
 * @version 1.0
 */
public class Punto{
    // Atributos //
    
    
    private double x;
    private double y;

    
    // Constructores //

    
    public Punto (double p_x, double p_y){
        this.setX(p_x);
        this.setY(p_y);
    }
    
    
    // Setters y getters //


    private void setX(double p_x){
        this.x = p_x;
    }
    public double getX(){
        return this.x;
    }
    
    private void setY(double p_y){
        this.y= p_y;
    }
    public double getY(){
        return this.y;
    }
    
    
    // Metodos //
    
    /**Calcula distancia, del objeto actual, hacia otro recibido por parametro
     @param Punto p_ptoDistante
     @return Devuelve una variable de tipo double
     @throws No dispara ninguna excepción **/
    public double distanciaA(Punto p_ptoDistante){
        return Math.sqrt(  ( Math.pow( ( p_ptoDistante.getX() - this.getX() ) , 2 ) ) + ( Math.pow( ( p_ptoDistante.getY() - this.getY() ) , 2 ) ) ) ;
    }
    
    /**Suma a la coordenada X el valor de dx para desplazar, y tambien a la coordenada Y le suma dy para desplazar
     @param double dx, double dy
     @return No devuelve nada
     @throws No dispara ninguna excepción **/
    public void desplazar(double dx, double dy){
        this.setX(this.getX() + dx);
        this.setY(this.getY() + dy);
    }

    /**Devuelve las coordenadas X e Y
     @param No recibe parametros
     @return Devuelve una variable de tipo String
     @throws No dispara ninguna excepción **/
    public String coordenadas(){
        return "(" + this.getX() + ", " +  this.getY() + ")";
    }
    
 
    
    public void mostrar(){
        System.out.println ("Punto. X:" + this.getX() + ", " + "Y:" + this.getY() );
        
    }
}