
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
public class CrearPunto{
    public static void main(String[] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Por favor ingrese las coordenadas del punto 1");
        System.out.println("X:");
        String xX = br.readLine();
        System.out.println("Y:");
        String yX= br.readLine();

        
        double x = Double.parseDouble(xX);
        double y = Double.parseDouble(yX);
        
        Punto unPunto=new Punto(x,y);
        
        
        System.out.println("Por favor ingrese las coordenadas del punto 2");
        System.out.println("X:");
        String xX2 = br.readLine();
        System.out.println("Y:");
        String yX2= br.readLine();

        
        double x2 = Double.parseDouble(xX2);
        double y2 = Double.parseDouble(yX2);
        
        
        
        Punto unPunto2=new Punto(x2,y2);
        
        System.out.println("La distancia del primer punto ingresado al segundo es: " + unPunto.distanciaA(unPunto2) );
    }
}