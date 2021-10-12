import java.util.*;
public class Empresa{
    public static void main(String[] args){
        Empleado unEmpleado=new Empleado(123456, "Juan", "Perez", 5000, 1996);
        

        Calendar aniversario = new GregorianCalendar(2010, Calendar.SEPTEMBER, 07, 23, 11, 44); //Colocar fecha de hoy
    
        Calendar fechaHoy= Calendar.getInstance();
        Empleado unEmpleado2=new Empleado(123455, "Gomez", "Victor", 6000, aniversario);
        unEmpleado2.mostrar();
        EmpleadoConJefe unJefe=new EmpleadoConJefe (123455, "Gomez", "Victor", 15000, fechaHoy) ;
        EmpleadoConJefe unEmpleadoConJefe2=new EmpleadoConJefe (123455, "Juan", "Perez", 5000, fechaHoy, unJefe ) ;
        
        
        if ( unEmpleado.esAniversario() && unEmpleado.antiguedad() > 0 ){
            System.out.println( "***************Certificado de salida***************" );
            System.out.println( "El empleado " + unEmpleado.nomYApe() + ", esta autorizado a salir");
            System.out.println( "***************************************************" );
        } else{
            System.out.println( "Hoy no es el aniversario del empleado " + unEmpleado.nomYApe());
        }
        
        if ( unEmpleado2.esAniversario() && unEmpleado.antiguedad() > 0 ){
            System.out.println( "***************Certificado de salida***************" );
            System.out.println( "El empleado " + unEmpleado2.nomYApe() + ", esta autorizado a salir");
            System.out.println( "***************************************************" );
        } else{
            System.out.println( "Hoy no es el aniversario del empleado " + unEmpleado2.nomYApe());
        }
        
        unJefe.mostrar();
        unEmpleadoConJefe2.mostrar();
        
        if ( unEmpleadoConJefe2.esAniversario() && unEmpleadoConJefe2.getJefe() == null && unEmpleadoConJefe2.antiguedad() > 0 ){
            System.out.println( "Hoy es el aniversario de " + unEmpleadoConJefe2.nomYApe() + ", sin embargo, es el gerente y no necesita autorizacion");
        } else if ( unEmpleadoConJefe2.esAniversario() && unEmpleadoConJefe2.getJefe() != null && unEmpleadoConJefe2.antiguedad() > 0 ) {
            System.out.println( "***************Certificado de salida***************" );
            System.out.println( "El empleado " + unEmpleadoConJefe2.nomYApe() + ", esta autorizado a salir");
            System.out.println( "Firma del superior: " + unEmpleadoConJefe2.getJefe().apeYNom() );
            System.out.println( "***************************************************" );
        } else {
            System.out.println( "Hoy no es el aniversario de " + unEmpleadoConJefe2.nomYApe());
        }
        
        
        if ( unJefe.esAniversario() && unJefe.getJefe() == null  && unJefe.antiguedad() > 0 ){
            System.out.println( "Hoy es el aniversario de " + unJefe.nomYApe() + ", sin embargo, es el gerente y no necesita autorizacion");
        } else if ( unJefe.esAniversario() && unJefe.getJefe() != null && unJefe.antiguedad() > 0 ) {
            System.out.println( "***************Certificado de salida***************" );
            System.out.println( "El empleado " + unJefe.nomYApe() + ", esta autorizado a salir");
            System.out.println( "Firma del superior: " + unJefe.getJefe().apeYNom() );
            System.out.println( "***************************************************" );
        } else {
            System.out.println( "Hoy no es el aniversario de " + unJefe.nomYApe());
        }
    }
}