import java.util.*;
import java.time.*;
import java.time.format.TextStyle;
import java.time.format.TextStyle;
/**
 * Permite crear pedidos
 * 
 * @author Gomez Victor Agustin
 * @version 1.0
 */
public class Pedido{
     
    
    // Atributos //
    
    
    private Calendar fecha;
    private ArrayList<Producto> productos;
    private Cliente cliente;
    
    
    // Constructores //
    
    
    public Pedido(Calendar p_fecha, Cliente p_cliente, Producto p_producto){
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(new ArrayList() {{ add(p_producto); }} );
    }
    
    public Pedido(Calendar p_fecha, Cliente p_cliente, ArrayList p_productos){
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos( p_productos );
    }
    
    
    // Setters y getters //
    
    
    private void setFecha(Calendar p_fecha){
        this.fecha = p_fecha;
    }
    public Calendar getFecha(){
        return this.fecha;
    }
    
    private void setCliente(Cliente p_cliente){
        this.cliente = p_cliente;
    }
    public Cliente getCliente(){
        return this.cliente;
    }
    
    public void setProductos(ArrayList<Producto> p_productos) {
        this.productos = p_productos;
    }
    public ArrayList<Producto> getProductos() {
        return this.productos;
    }
    
    
    // Metodos //
    
    /**Permite agregar un objeto a lista
     @param Producto p_producto
     @return Devuelve una variable de tipo Boolean
     @throws No dispara ninguna excepción **/
    public boolean agregarProducto(Producto p_producto){
        return this.getProductos().add(p_producto);
    }
    
    /**Permite quitar un objeto a lista
     @param Producto p_producto
     @return Devuelve una variable de tipo Boolean
     @throws No dispara ninguna excepción **/
    public boolean quitarProducto(Producto p_producto){
        return this.getProductos().remove(p_producto);
    }

    /**Recorre la lista para sumar el total de los precios al contado
     @param No recibe parametros
     @return Devuelve una variable de tipo Double
     @throws No dispara ninguna excepción **/
    public double totalAlContado(){
        double total = 0.0;
        for(Producto productos: this.getProductos()){
        total = productos.precioContado() + total;
        }
        total = Math.round(total*100.0)/100.0;
        return total;
    }
    
    /**Recorre la lista para sumar el total de los precios de lista
     @param No recibe parametros
     @return Devuelve una variable de tipo Double
     @throws No dispara ninguna excepción **/
    public double totalFinanciado(){
        double total = 0.0;
        for(Producto productos: this.getProductos()){
        total = productos.precioLista() + total;
        }
        total = Math.round(total*100.0)/100.0;
        return total;
    }
    
    /**Recorre la lista para mostrar todos los pedidos y totales
     @param No recibe parametros
     @return No devuelve nada
     @throws No dispara ninguna excepción **/
    public void mostrar(){
        int mesdeTermino = this.getFecha().get(Calendar.MONTH) + 1 ;
        Locale locale = new Locale("es", "ES");
        Month mMonth=Month.of(mesdeTermino);
        String nombre=mMonth.getDisplayName(TextStyle.FULL,locale); 

        System.out.println ("**************Detalle del pedido************** Fecha: " + this.getFecha().get(Calendar.DATE) + " de " + 
        nombre +  " de " + this.getFecha().get(Calendar.YEAR) ) ;
        System.out.println ("Producto" + "\t" + "Precio Lista" + "\t" + "Precio Contado");
        System.out.println ("-----------------------------------------------------");
        for(Producto productos: this.getProductos()){
        System.out.println ( productos.mostrarLinea());
        }
        System.out.println ("**** Total -------------" + totalFinanciado() + "\t" + totalAlContado() );
    }
}