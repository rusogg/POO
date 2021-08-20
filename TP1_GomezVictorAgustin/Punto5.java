public class Punto5{
 public static void main(String[] args){
    double discriminante;
    
    double a = Double.valueOf(args[0]);
    double b = Double.valueOf(args[1]);
    double c = Double.valueOf(args[2]);
    
    discriminante = (Math.pow(b,2)) - 4 * a * c;
    
    if (discriminante < 0){
    System.out.println ("El discriminante es menor que 0");
    System.out.println ("Por lo tanto el resultado sera imaginario");
    }
    else if (discriminante == 0){
    System.out.println ("El discriminante es igual a 0");
    System.out.println ("Por lo tanto tenemos una sola raiz");
    double raizReal = - b / ( 2 * a ) ;
    System.out.println ("Raiz: " + raizReal);
    }
    else {
    System.out.println ("El discriminante es mayor que 0");
    System.out.println ("Por lo tanto tenemos dos raices");
    double raizA = ( - b + Math.sqrt( (Math.pow(b,2)) - 4 * a * c)  ) / (2 * a);
    double raizB = ( - b - Math.sqrt( (Math.pow(b,2)) - 4 * a * c)  ) / (2 * a);
    System.out.println ("X1= " + raizA);
    System.out.println ("X2= " + raizB);
    }
}
}
