public class Punto4{
 public static void main(String[] args){
    double a, b, c;
    a = Double.valueOf(args[0]);
    b = Double.valueOf(args[1]);
    c = Double.valueOf(args[2]);
    double semiperimetro = ( (a+b+c) /2 );
    double area = Math.sqrt( semiperimetro*(semiperimetro-a)*(semiperimetro-b)*(semiperimetro-c) );
    System.out.println ("Semiperimetro: " + semiperimetro);
    System.out.println ("Area: " + area);
    }
}