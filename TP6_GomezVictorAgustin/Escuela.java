import java.util.*;
public class Escuela{
    public static void main(String[] args){
        Calendar fechaHoy= Calendar.getInstance();
        Alumno unAlumno=new Alumno(40047803, "Victor", "Gomez" ,fechaHoy, 52487);      
        unAlumno.setNota1(10);
        unAlumno.setNota2(10);
        unAlumno.mostrar();
        Persona unaPersona=new Persona(123456, "Pedro", "Gimenez", fechaHoy);
        unaPersona.mostrar();
    }
}