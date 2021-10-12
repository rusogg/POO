import java.util.*;
public class nuevaCuenta{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int dni, anio, cuenta;
        String nombre, apellido;
        double deposito, extraccion;
        
        System.out.println ("Ingrese datos para crear un nuevo cliente: ");
        System.out.println ("DNI: ");
        dni = teclado.nextInt();
        teclado.nextLine();
        System.out.println ("Nombre: ");
        nombre = teclado.nextLine();
        System.out.println ("Apellido: ");
        apellido = teclado.nextLine();
        System.out.println ("Año de nacimiento: ");
        anio = teclado.nextInt();
        Persona unaPersona=new Persona(dni, nombre, apellido, anio);
        
        System.out.println("\f");
        
        System.out.println ("-------------------Cajero banelco-------------------");
        System.out.println ("Su cuenta ha sido creada satisfactoriamente!" + "\n");
        
        System.out.println ("Ingrese su numero de cuenta para depositar o extraer dinero: ");
        cuenta = teclado.nextInt();
        CuentaBancaria unaCuenta=new CuentaBancaria(cuenta, unaPersona);
        
        System.out.println("\f");
        
        System.out.println ("-------------------Cajero banelco-------------------");
        System.out.println ("Ingrese cuanto dinero desea depositar: ");
        deposito = teclado.nextDouble();
        unaCuenta.depositar(deposito);
        
        System.out.println("\f");
        
        System.out.println ("Dinero depositado!" + "\n");
        System.out.println ("---------------Nuevo saldo---------------" + "\n");
        unaCuenta.mostrar();
        System.out.println ("---------------Nuevo saldo---------------" + "\n");
        
        
        System.out.println ("\n" + "Ingrese cuanto dinero desea extraer: ");
        extraccion = teclado.nextDouble();
        unaCuenta.extraer(extraccion);
        
        System.out.println("\f");
        
        System.out.println ("Dinero extraido!" + "\n");
        System.out.println ("---------------Nuevo saldo---------------" + "\n"); 
        unaCuenta.mostrar();
        System.out.println ("---------------Nuevo saldo---------------" + "\n");
        
        System.out.println ("\n" + "----------Resumen----------" + "\n");
        System.out.println (unaCuenta.toString());
        System.out.println ("\n" + "----------Resumen----------");
    }
}