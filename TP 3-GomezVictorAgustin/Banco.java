import java.util.*;
public class Banco{
    public static void main(String[] args){
        Persona unaPersona=new Persona(123456, "Juan", "Perez", 1996);
        Calendar fechaHoy= Calendar.getInstance();
        Persona unaPersona2=new Persona(123456, "Gomez", "Victor", fechaHoy);
        
        CajaDeAhorro unaCaja=new CajaDeAhorro(2135, unaPersona);
        CuentaCorriente unaCuenta=new CuentaCorriente(1735, unaPersona);
        
        unaCaja.depositar(5000);
        unaCaja.mostrar();
        unaCaja.extraer(6000);
        unaCaja.extraer(100);
        unaCaja.extraer(100);
        unaCaja.extraer(100);
        unaCaja.extraer(100);
        unaCaja.extraer(100);
        unaCaja.extraer(100);
        unaCaja.extraer(100);
        unaCaja.extraer(100);
        unaCaja.extraer(100);
        unaCaja.extraer(100);
        unaCaja.extraer(100);
        unaCaja.mostrar();
        
        unaCuenta.depositar(5000);
        unaCuenta.mostrar();
        unaCuenta.extraer(6000);
        unaCuenta.extraer(5400);
        unaCuenta.mostrar();
        
        if ( unaPersona2.esCumpleanios() ){
            System.out.println( "Feliz cumpleaños, " + unaPersona2.nomYApe() + ", te deseamos un hermoso dia");
        }
    }
}