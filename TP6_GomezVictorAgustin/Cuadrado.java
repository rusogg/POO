/**
 * Permite instanciar un cuadrado
 * 
 * @author Gomez Victor Agustin
 * @version 2.0
 */
public class Cuadrado extends Rectangulo{
    // Atributos //
    
    
    private double lado;
    
    
    // Constructores //

    
    public Cuadrado (Punto p_origen, double p_ancho, double p_alto, double p_lado){
        super(p_origen, p_ancho, p_alto);
        this.setLado(p_lado);
    }
    
    private void setLado(double p_lado){
        this.lado = p_lado;
    }
    public double getLado(){
        return this.lado;
    }
    
    
    // Metodos //
    
    
    protected String nombreFigura(){
        return super.nombreFigura() + "\n" + "****** Cuadrado ******" ;
    }
    
    protected void caracteristicas(){
        System.out.println( this.nombreFigura() );
        System.out.println("Origen: " + super.getOrigen().coordenadas() + " - Lado: " + this.getLado() + "\n" +
        "Superficie: " + super.superficie() + " - Perimetro: " + super.perimetro());
    }
}