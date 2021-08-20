public class Punto3{
 public static void main(String[] args){
    double perimetro;
    int radio = Integer.valueOf(args[0]);
    perimetro = 2*Math.PI*radio;
    System.out.println ("Perimetro: " + perimetro);
}
}
