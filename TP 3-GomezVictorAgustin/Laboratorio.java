import java.util.*;
/**
 * Permite instanciar un laboratorio
 * 
 * @author Gomez Victor Agustin
 * @version 1.0
 */
public class Laboratorio{
    // Atributos //
    
    
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaDeEntrega;

    
    // Constructores //

    
    public Laboratorio (String p_nombre,String p_domicilio,String p_telefono,int p_compraMinima, int p_diaDeEntrega){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(p_compraMinima);
        this.setDiaDeEntrega(p_diaDeEntrega);
    }
    
        public Laboratorio (String p_nombre,String p_domicilio,String p_telefono){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(0);
        this.setDiaDeEntrega(0);
    }
    
    
    // Setters y getters //

    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

     private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    public String getDomicilio(){
        return this.domicilio;
    }   
    
    private void setTelefono(String p_telefono){
        this.telefono = p_telefono;
    }
    public String getTelefono(){
        return this.telefono;
    }

    private void setCompraMinima(int p_compraMinima){
        this.compraMinima = p_compraMinima;
    }
    public int getCompraMinima(){
        return this.compraMinima;
    }

    private void setDiaDeEntrega(int p_diaDeEntrega){
        this.diaDeEntrega = p_diaDeEntrega;
    }
    public int getDiaDeEntrega(){
        return this.diaDeEntrega;
    }
    
    
    // Metodos //
    
    
    /**Reemplaza compraMinima por otro valor recibido
     @param int p_compraMinima
     @return No devuelve nada
     @throws No dispara ninguna excepción **/
    public void nuevaCompraMinima(int p_compraMinima){
        this.setCompraMinima(p_compraMinima);
        System.out.println ("Nueva compra minima: " + this.getCompraMinima() + " Pesos");
    }

    /**Reemplaza diaDeEntrega por otro valor recibido
     @param int p_diaDeEntrega
     @return No devuelve nada
     @throws No dispara ninguna excepción **/
    public void nuevoDiaDeEntrega(int p_diaDeEntrega){
        this.setDiaDeEntrega(p_diaDeEntrega);
        System.out.println ("Nuevo dia de entrega: " + this.getDiaDeEntrega());
    }
    
    public String mostrar(){
        return "Laboratorio: " + this.getNombre() + "\n" + "Domicilio: " + this.getDomicilio() + "  Telefono: " + this.getTelefono();
    }
    
}