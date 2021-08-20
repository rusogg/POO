
public class Punto6{
 public static void main(String[] args){
    double h, cateto1, cateto2;
    h = Double.valueOf(args[0]);
    cateto1 = Double.valueOf(args[1]);
    cateto2 = Double.valueOf(args[2]);
    double catetos = Math.pow (cateto1,2) + Math.pow (cateto2,2) ;
    if ( catetos   == Math.pow ( h,2 )  ) {
        System.out.println ("Es un triangulo rectangulo");
    }
    else {
        System.out.println ("No es un triangulo rectangulo");
    }
    }
    }
