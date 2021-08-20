public class Punto1{
 public static void main (String [] args){
    int a = 8;
    int b = 3;
    int suma, resta;
    double division, resto;
    
    suma = a + b;
    resta = a - b;
    division = a/b;
    resto = a - (division*b);
    
    System.out.println("Suma: " +suma);
    System.out.println("Resta: " +resta);
    System.out.println("Division: " +division);
    System.out.println("Resto: " +resto);
    }
    }