import java.util.Scanner;
import java.util.*;
public class Punto9{
 public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    double[] dobles = new double[10];
    double menor= Integer.MAX_VALUE;
    
    System.out.println ("Ingrese los datos para ordenar");
    for(int i= 0; i< 4; i++){
    System.out.print ("Numero" + "->");
    dobles[i] = teclado.nextDouble();
    if (dobles[i] < menor){
    menor = dobles[i];
                    }
        }
        
    for(int i= 0; i< 4; i++){
        for (int j= 0; j< 3 - i ; j++)
        {
            if ( dobles[j] > dobles[j+1] ){
                double temp = dobles[j];
                dobles[j] = dobles[j+1];
                dobles[j+1] = temp;
            }
        }
        }
    
    System.out.print("Lista ordenada de menor a mayor:");    
        
    for(int i= 0; i< 4; i++){
        System.out.print("|" + " " + dobles[i] + " " + "|");
        }
   
    System.out.println("");    
    System.out.println("El menor numero es:" + " " + menor);  
    }
    }   