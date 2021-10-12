import java.util.*;
/**
 * Permite crear un array de puntos
 * 
 * @author Gomez Victor Agustin
 * @version 1.0
 */
public class ArrayDePuntos{
    public static void main(String[] args){
        double x;
        double y;
        Scanner teclado = new Scanner(System.in);
        Punto Puntos[] = new Punto[7];
        for (int i=0;i<Puntos.length;i++){
            System.out.println ("Ingrese datos para crear un punto: ");
            System.out.println ("X: ");
            x = teclado.nextDouble();
            System.out.println ("Y: ");
            y = teclado.nextDouble();
            Punto unPunto=new Punto(x,y);
            Puntos[i] = unPunto;
            System.out.println("\f");
        }
        
        for (int i=0;i<Puntos.length;i++){
            System.out.println ( "Punto " + (i+1) + Puntos[i].coordenadas() );
        }
        
        for (int i=0;i<Puntos.length-1;i++){
            double aux = Puntos[i].distanciaA(Puntos[i +1]);;
            System.out.println ("Distancia del punto " + (i+1) + " al punto " + (i+2) + " es " + aux);
            
        }
    }
}