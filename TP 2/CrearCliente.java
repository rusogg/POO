public class CrearCliente{
    public static void main(String[] args){
        Cliente unCliente=new Cliente(Integer.valueOf(args[0]),args[1],args[2], Double.valueOf(args[3]));      
        unCliente.mostrar();
        unCliente.nuevoSaldo(500);
        unCliente.mostrar();
        unCliente.agregaSaldo(500);
        unCliente.mostrar();
    }
}