
public class GestionStock{
    public static void main(String[] args){
        Laboratorio unLaboratorio=new Laboratorio("Colgate SA","Junin 5204",": 54-11-4239-8447");      
        Producto unProducto=new Producto(1,"Perfumeria","Jabon Deluxe",5.25,unLaboratorio);
        unProducto.mostrar();
        unProducto.ajuste(500);
        unProducto.mostrar();
        unProducto.ajuste(-200);
        unProducto.mostrar();
        System.out.println ( unProducto.mostrarLinea() );
    }
}