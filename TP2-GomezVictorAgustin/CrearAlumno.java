
public class CrearAlumno{
    public static void main(String[] args){
        Alumno unAlumno=new Alumno(Integer.valueOf(args[0]),args[1],args[2]);      
        unAlumno.setNota1(6);
        unAlumno.setNota2(10);
        unAlumno.mostrar();
    }
}