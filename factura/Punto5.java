public class Punto5{
 public static void main(String[] args){
    double discriminante;
    
    double a = Double.valueOf(args[0]);
    double b = Double.valueOf(args[1]);
    double c = Double.valueOf(args[2]);
    
    discriminante = (Math.pow(b,2)) - 4 * a * c;
    
    if (discriminante < 0){
    System.out.println ("El resultado sera imaginario");
    }
    else if (discriminante == 0){
    
    }
}
}
