public class Punto2{
 public static void main (String [] args){
    int numero = 42;
    do {
        if (  ( ((numero/4) * 4) - numero ) == 0){
        System.out.println("Multiplos de 4: "+numero);
        }
        ++numero;
    } while(numero != 151);
    }
 }   
