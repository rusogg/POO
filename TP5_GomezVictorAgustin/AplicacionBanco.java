import java.util.*;
/**
 * Permite administrar banco
 * 
 * @author Gomez Victor Agustin
 * @version 1.0
 */
public class AplicacionBanco{
    public static void main(String[] args){
        Calendar fechaHoy= Calendar.getInstance();
        Localidad unaLocalidad=new Localidad("Capital","Corrientes");
        Empleado unEmpleado=new Empleado(27267504235L, "Perez", "Lorena", 1212, fechaHoy);      
        Empleado unEmpleado2=new Empleado(20159462638L, "Dominguez", "Pedro", 1212, fechaHoy);
        Empleado unEmpleado3=new Empleado(20159461234L, "Gomez", "Victor", 1212, fechaHoy);
        Banco miBanco = new Banco ( "Rio" , unaLocalidad, 3, unEmpleado);
        miBanco.listarSueldos();
        System.out.println ("\n");
        miBanco.agregarEmpleado(unEmpleado2);
        miBanco.agregarEmpleado(unEmpleado3);
        miBanco.listarSueldos();
        System.out.println ("\n");
        miBanco.quitarEmpleado(unEmpleado3);
        miBanco.listarSueldos();
        
        Persona unaPersona=new Persona(40047803, "Victor", "Gomez", 1996);
        CuentaBancaria unaCuenta=new CuentaBancaria(321322, unaPersona);
        Persona unaPersona2=new Persona(40047802, "Hector", "Gomez", 1996);
        CuentaBancaria unaCuenta2=new CuentaBancaria(321324, unaPersona2);
        Persona unaPersona3=new Persona(40047801, "Malena", "Garcia", 1996);
        CuentaBancaria unaCuenta3=new CuentaBancaria(321321, unaPersona3);
        Persona unaPersona4=new Persona(40047808, "Ramon", "Jimenez", 1996);
        CuentaBancaria unaCuenta4=new CuentaBancaria(321325, unaPersona4);
        
        miBanco.agregarCuentaBancaria(unaCuenta);
        miBanco.agregarCuentaBancaria(unaCuenta2);
        miBanco.agregarCuentaBancaria(unaCuenta3);
        miBanco.agregarCuentaBancaria(unaCuenta4);
        
        unaCuenta.depositar(500);
        unaCuenta2.depositar(1000);
        
        miBanco.mostrarResumen();
    }
}