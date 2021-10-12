import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
public class CrearEmpleado{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Por favor ingrese datos");
        System.out.println("CUIL:");
        String cuilX = br.readLine();
        System.out.println("Nombre:");
        String nombre= br.readLine();
        System.out.println("Apellido:");
        String apellido= br.readLine();
        System.out.println("Sueldo Basico:");
        String sueldoBasicoX= br.readLine();
        System.out.println("Año de ingreso:");
        String anioIngresoX= br.readLine();
        
        int anioIngreso = Integer.parseInt(anioIngresoX);
        double sueldoBasico = Double.parseDouble(sueldoBasicoX);
        long cuil = Long.parseLong(cuilX);
        
        Empleado unEmpleado=new Empleado(cuil,nombre,apellido,sueldoBasico,anioIngreso);      
        unEmpleado.mostrar();
        System.out.println (unEmpleado.mostrarLinea());
    }
}