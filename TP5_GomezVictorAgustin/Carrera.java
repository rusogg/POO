import java.util.*;
/**
 * Permite administrar carreras
 * 
 * @author Gomez Victor Agustin
 * @version 1.0
 */
public class Carrera{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opcionElegida = 0;
        Curso unCurso = null;
        
         while (opcionElegida != 7) {
        System.out.println("               Menu de opciones              ");
        System.out.println("*********************************************");
        System.out.println("Introduce el numero de la opción que quieras:");
        System.out.println("1.- Crear Curso");
        System.out.println("2.- Inscribir Alumno");
        System.out.println("3.- Quitar Alumno");
        System.out.println("4.- Mostrar Alumnos");
        System.out.println("5.- Buscar Alumno");
        System.out.println("6.- Mostrar Promedio de un Alumno");
        System.out.println("7.- Salir");
        System.out.println("*********************************************");
        opcionElegida = sc.nextInt();
        
        switch (opcionElegida) {
            
            case 1:
                System.out.println("\f");
                System.out.println("Introduce el nombre del curso");
                String nombreCurso = sc.next();
                unCurso=new Curso(nombreCurso);
                System.out.println("\f");
                System.out.println("---------------------------------------------");
                System.out.println("Curso (" + unCurso.getNombre() + ") creado satisfactoriamente!");
                System.out.println("---------------------------------------------");
                System.out.println("Escriba algo para continuar");
                String aux1 = sc.next();
                System.out.println("\f");
                
                break;
            case 2:
                if ( unCurso != null) {
                    System.out.println("\f");
                    System.out.println("Introduce el LU");
                    int lu = sc.nextInt();
                    System.out.println("Introduce el Nombre");
                    String nombreAlumno = sc.next();
                    System.out.println("Introduce el Apellido");
                    String apellido = sc.next();
                    System.out.println("Introduce la nota del Primer Parcial");
                    double nota1 = sc.nextDouble();
                    System.out.println("Introduce la nota del Segundo Parcial");
                    double nota2 = sc.nextDouble();
                    Alumno unAlumno=new Alumno(lu, nombreAlumno, apellido);
                    unAlumno.setNota1(nota1);
                    unAlumno.setNota2(nota2);
                    if (!unCurso.estaInscripto(unAlumno)){
                    unCurso.inscribirAlumno(unAlumno);
                    System.out.println("\f");
                    System.out.println("--------------------------------------------------------------------------------------------------");
                    System.out.println("****-- " + unAlumno.nomYApe() + " fue inscripto satisfactoriamente en el curso " + unCurso.getNombre() + " --****");
                    System.out.println("--------------------------------------------------------------------------------------------------");
                    System.out.println("Escriba algo para continuar");
                    String aux = sc.next();
                    System.out.println("\f");
                    }else{
                        System.out.println("\f");
                    System.out.println("--------------------------------------------------------------------------------------------------");
                    System.out.println("****-- " + unAlumno.nomYApe() + " ya esta inscripto a un curso, no puede volver a inscribirse " + " --****");
                    System.out.println("--------------------------------------------------------------------------------------------------");
                    System.out.println("Escriba algo para continuar");
                    String aux = sc.next();
                    System.out.println("\f");
                    }
                }else{
                    System.out.println("\f");
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Debes crear primero un curso para inscribir a los alumnos!");
                    System.out.println("----------------------------------------------------------");
                    System.out.println("Escriba algo para continuar");
                    String aux = sc.next();
                    System.out.println("\f");
                }
                
                break;
            case 3:
                if ( unCurso != null) {
                   System.out.println("\f");
                   System.out.println("---------------------------------------------");
                   unCurso.mostrarInscriptos();
                   System.out.println("---------------------------------------------");
                   System.out.println("Escriba el LU del alumno que desea quitar");
                   int eliminado = sc.nextInt();
                   if (unCurso.buscarAlumno(eliminado) != null) {
                       System.out.println("\f");
                       System.out.println("------------------------------------------------------------------------");
                       System.out.println("****-- Se da de baja a " + unCurso.buscarAlumno(eliminado).getNombre() + " porque abandona el curso --****");
                       System.out.println("Esta" + unCurso.quitarAlumno(eliminado).nomYApe() + " inscripto??--> " + unCurso.estaInscripto(eliminado) );
                       System.out.println("------------------------------------------------------------------------");
                       System.out.println("Escriba algo para continuar");
                       String aux = sc.next();
                       System.out.println("\f");
                   } else{
                       System.out.println("\f");
                       System.out.println("---------------------------------------");
                       System.out.println("El alumno no existe o ya fue eliminado");
                       System.out.println("---------------------------------------");
                       System.out.println("Escriba algo para continuar");
                       String aux = sc.next();
                       System.out.println("\f");
                   }
                }else{
                   System.out.println("\f");
                   System.out.println("------------------------------");
                   System.out.println("Debes crear primero un curso!");
                   System.out.println("------------------------------");
                   System.out.println("Escriba algo para continuar");
                   String aux = sc.next();
                   System.out.println("\f");
                }
                
                break;
            case 4:
                if ( unCurso != null) {
                   System.out.println("\f");
                   System.out.println("---------------------------------------------");
                   System.out.println("****-- Cantidad de inscriptos: " + unCurso.cantidadDeAlumnos() );
                   unCurso.mostrarInscriptos();
                   System.out.println("---------------------------------------------");
                   System.out.println("Escriba algo para continuar");
                   String aux = sc.next();
                   System.out.println("\f");
                }else{
                   System.out.println("\f");
                   System.out.println("------------------------------");
                   System.out.println("Debes crear primero un curso!");
                   System.out.println("------------------------------");
                   System.out.println("Escriba algo para continuar");
                   String aux = sc.next();
                   System.out.println("\f");
                }
                break;
            case 5:
                if ( unCurso != null) {
                   System.out.println("\f");
                   System.out.println("Escriba el LU del alumno que desea buscar");
                   int buscado = sc.nextInt();
                   System.out.println("\f");
                   if ( unCurso.estaInscripto( buscado ) ) {
                      System.out.println("---------------------------------------------");
                      System.out.println("****-- - Busca y muestra el alumno con numero de libreta: " + buscado + "--****" );
                      unCurso.buscarAlumno(buscado).mostrar();
                      System.out.println("---------------------------------------------");
                      System.out.println("Escriba algo para continuar");
                      String aux = sc.next();
                      System.out.println("\f"); 
                   }else{
                       System.out.println("-----------------------------");
                       System.out.println("No existe alumno con ese LU");
                       System.out.println("-----------------------------");
                       System.out.println("Escriba algo para continuar");
                       String aux = sc.next();
                       System.out.println("\f");
                   }
                   
                }else{
                    System.out.println("\f");
                    System.out.println("------------------------------");
                    System.out.println("Debes crear primero un curso!");
                    System.out.println("------------------------------");
                    System.out.println("Escriba algo para continuar");
                    String aux = sc.next();
                    System.out.println("\f");
                }
                break;
            case 6:
                if ( unCurso != null) {
                   System.out.println("\f");
                   unCurso.mostrarInscriptos();
                   System.out.println("Escriba el LU del alumno que desea saber el promedio");
                   int buscado = sc.nextInt();
                   System.out.println("\f");
                   if ( unCurso.estaInscripto( buscado ) ) {
                      System.out.println("---------------------------------------------");
                      System.out.println("****-- - Mostrar promedio del alumno: " + buscado + "--****" );
                      unCurso.imprimirPromedioDelAlumno(buscado);
                      System.out.println("---------------------------------------------");
                      System.out.println("Escriba algo para continuar");
                      String aux = sc.next();
                      System.out.println("\f"); 
                   }else{
                       System.out.println("-----------------------------");
                       System.out.println("No existe alumno con ese LU");
                       System.out.println("-----------------------------");
                       System.out.println("Escriba algo para continuar");
                       String aux = sc.next();
                       System.out.println("\f");
                   }
                   
                }else{
                    System.out.println("\f");
                    System.out.println("------------------------------");
                    System.out.println("Debes crear primero un curso!");
                    System.out.println("------------------------------");
                    System.out.println("Escriba algo para continuar");
                    String aux = sc.next();
                    System.out.println("\f");
                }
                break;
            case 7:
                System.out.println("\f");
                System.out.println("------------------");
                System.out.println("Hasta la proxima!");
                System.out.println("------------------");
                System.exit(0);
            default:
                System.out.println("Tienes que introducir una opción valida");
        }
        
    }
}
}