
public class Punto {
     private int x; //inicializa el x
     private int y; //inicializa el y
 public Punto ( int a , int b ) {
     setX(a); //llama a la variable setx y le pasa como parametro a
     setY(b); //llama a la variable sety y le pasa como parametro b
 } // funcion del objeto llamado punto, recibe como parametro a y b
 public int getX() { // sin modificador. Acceso de paquete
     return x;
 } // funcion que devuelve el valor x del punto
 public int getY() { // público. Acceso irrestricto
     return y;
 } // funcion que devuelve el valor y del punto
 private void setX(int a) { // público. Acceso irrestricto
     x = a;
 } // funcion que asigna el parametro a, al parametro x
 private void setY(int b) { // publico
     y = b;
 } // funcion que asigna el parametro b, al parametro y
}