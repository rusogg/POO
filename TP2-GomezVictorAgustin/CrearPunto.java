import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
public class CrearPunto{
    public static void main(String[] args)throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Por favor ingrese las coordenadas");
        System.out.println("X:");
        String xX = br.readLine();
        System.out.println("Y:");
        String yX= br.readLine();

        
        double x = Double.parseDouble(xX);
        double y = Double.parseDouble(yX);
        
        
        
        Punto unPunto=new Punto(x,y);      
        unPunto.mostrar();
        unPunto.desplazar(2.0,1.0);
        System.out.println ( unPunto.coordenadas() );
    }
}