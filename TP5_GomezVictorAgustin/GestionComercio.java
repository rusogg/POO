import java.util.*;
/**
 * Permite administrar comercio
 * 
 * @author Gomez Victor Agustin
 * @version 1.0
 */
public class GestionComercio{
    public static void main(String[] args){
        Calendar fechaHoy= Calendar.getInstance();
        Localidad unaLocalidad=new Localidad("Capital","Corrientes");
        Empleado unEmpleado=new Empleado(27267504235L, "Perez", "Lorena", 1212, fechaHoy);      
        Empleado unEmpleado2=new Empleado(20159462638L, "Dominguez", "Pedro", 1500, fechaHoy);
        Empleado unEmpleado3=new Empleado(20159461234L, "Gomez", "Victor", 2000, fechaHoy);
        Comercio unComercio=new Comercio("Quiosco");
        
        unComercio.nomina();
        System.out.println("Cantidad de empleados: " + unComercio.cantidadDeEmpleados() );
        unComercio.altaEmpleado(unEmpleado);
        unComercio.altaEmpleado(unEmpleado2);
        
        unComercio.nomina();
        System.out.println("Cantidad de empleados: " + unComercio.cantidadDeEmpleados() );
        unComercio.altaEmpleado(unEmpleado3);
        
        unComercio.nomina();
        System.out.println("Cantidad de empleados: " + unComercio.cantidadDeEmpleados() );
        unComercio.altaEmpleado(unEmpleado);
        unComercio.buscarEmpleado(27267504235L);
        unComercio.sueldoNeto(27267504235L);
        unComercio.bajaEmpleado(27267504235L);
        
        unComercio.nomina();
        System.out.println("Cantidad de empleados: " + unComercio.cantidadDeEmpleados() );
        
    }
}