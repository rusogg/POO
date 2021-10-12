import java.util.Random;
public class CrearFigura{
    public static void main(String[] args){
        Punto unPunto=new Punto( 0 , 0 );      
               
        Random unNumero = new Random();
        double aleatorio = unNumero.nextDouble() * 100.0;
        
        Circulo unCirculo=new Circulo(aleatorio , unPunto);
        unCirculo.desplazar(-240 , -230);
        unCirculo.caracteristicas();
        
        Punto unPunto2=new Punto( 5.2 , 0.5 );   
        
        Random unNumero2 = new Random();
        double aleatorio2 = unNumero2.nextDouble() * 100.0;
        
        Circulo unCirculo2=new Circulo(aleatorio2 , unPunto2);
        unCirculo2.caracteristicas();
        
        System.out.println("\n" + "-------------------------El circulo mayor-------------------------");
        System.out.println("\n");
        unCirculo.elMayor( unCirculo2 ).caracteristicas();
        System.out.println("\n");
        System.out.println("-------------------------El circulo mayor-------------------------");
        
        System.out.println("\n" + "-------------------------Distancia-------------------------");
        System.out.println("\n " + "La distancia entre los dos circulos es: " + unCirculo.distanciaA(unCirculo2));
        System.out.println("\n " + "------------------------Distancia-------------------------" + "\n ");
        
        Punto unPunto4=new Punto( 0.0 , 0.0 );
        
        Rectangulo unRectangulo=new Rectangulo(unPunto4, aleatorio, aleatorio2);
        unRectangulo.desplazar(40 , -20);
        unRectangulo.caracteristicas();
        
        Random unNumero3 = new Random();
        double aleatorio3 = unNumero3.nextDouble() * 100.0;
        
        Random unNumero4 = new Random();
        double aleatorio4 = unNumero4.nextDouble() * 100.0;
        
        
        
        Punto unPunto3=new Punto( 7.4 , 4.5 );
        Rectangulo unRectangulo2=new Rectangulo(unPunto3, aleatorio3, aleatorio4);
        unRectangulo2.caracteristicas();
        
        System.out.println("\n" + "-------------------------El rectangulo mayor-------------------------");
        System.out.println("\n");
        unRectangulo.elMayor( unRectangulo2 ).caracteristicas();
        System.out.println("\n");
        System.out.println("-------------------------El rectangulo mayor-------------------------");
        
        System.out.println("\n" + "-------------------------Distancia-------------------------");
        System.out.println("\n " + "La distancia entre los dos rectangulos es: " + unRectangulo.distanciaA(unRectangulo2));
        System.out.println("\n " + "------------------------Distancia-------------------------" + "\n ");
    }
    }
