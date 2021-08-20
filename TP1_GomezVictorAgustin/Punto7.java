import java.util.Scanner; 
public class Punto7{
 public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    int resp = 1;
    double perimetro;
    while (resp != 0) {
    System.out.println ("Ingrese el radio de su circunferencia");
    int radio = teclado.nextInt();
    perimetro = 2*3.14*radio;
    System.out.println ("Perimetro: " + perimetro);
    System.out.println ("Desea agregar otro? 1-SI 0-NO");
    resp = teclado.nextInt();
    }
    System.out.println ("HASTA LUEGO!");
    }
    }