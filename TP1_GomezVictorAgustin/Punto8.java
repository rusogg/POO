import java.util.Scanner;
import java.util.*;
public class Punto8{
 public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    int[] alumnos = new int[6];
    int sumaNotas = 0;
    double promedio = 0;
    int mayorNota= Integer.MIN_VALUE;
    
    System.out.println ("Ingrese la nota de los alumnos");
    for(int i= 1; i< alumnos.length; i++){
    System.out.print ("Alumno" + i + "->");
    alumnos[i] = teclado.nextInt();
    sumaNotas = sumaNotas + alumnos[i];
    if (alumnos[i] > mayorNota){
    mayorNota = alumnos[i];
                    }
        }
        
        
    promedio = (double)sumaNotas/(double)(alumnos.length-1);
        
    for(int i= 1; i< alumnos.length; i++){
    System.out.print("Elemento" + i + "->" + alumnos[i] + " " );
        }
    System.out.println ("");
    System.out.println("El promedio de notas es:" + " " + promedio);
    System.out.println("La mayor nota es:" + " " + mayorNota);  
    }
    }