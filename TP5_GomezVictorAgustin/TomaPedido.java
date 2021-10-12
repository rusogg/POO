import java.util.*;
/**
 * Permite tomar pedidos
 * 
 * @author Gomez Victor Agustin
 * @version 1.0
 */
public class TomaPedido{
    public static void main(String[] args){
        Calendar fechaHoy= Calendar.getInstance();
        Cliente unCliente=new Cliente(40047803,"Gomez","Victor",500);  
        Laboratorio unLaboratorio=new Laboratorio("Colgate SA","Junin 5204",": 54-11-4239-8447");      
        Producto unProducto=new Producto(1,"Perfumeria","Jabon Deluxe",5.25,unLaboratorio);
        Producto unProducto2=new Producto(2,"Perfumeria","Shampoo",10,unLaboratorio);
        Producto unProducto3=new Producto(1,"Drogueria","AspirinasX10",15,unLaboratorio);
        Pedido miPedido = new Pedido (fechaHoy, unCliente, unProducto);
        miPedido.mostrar();
        miPedido.agregarProducto(unProducto2);
        miPedido.agregarProducto(unProducto3);
        miPedido.mostrar();
        miPedido.quitarProducto(unProducto3);
        miPedido.mostrar();
    }
}