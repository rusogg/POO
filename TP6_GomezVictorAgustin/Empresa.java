import java.util.*;
public class Empresa{
    public static void main(String[] args){
        Calendar fechaHoy= Calendar.getInstance();
        Empleado unEmpleado=new Empleado(40047803, "Victor", "Gomez" ,fechaHoy, 156156489489L, 50000, fechaHoy);      
        Persona unaPersona=new Persona(123456, "Pedro", "Gimenez", fechaHoy);
        unEmpleado.mostrar();
        unaPersona.mostrar();
    }
}