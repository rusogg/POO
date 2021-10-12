import javax.swing.JOptionPane;
public class CreaCirculo{
 public static void main (String [] args){
     Punto unPunto = new Punto(2,5);
     Circulo unCirculo = new Circulo(unPunto, 4);
     double sup = unCirculo.superficie(); // envío de mensaje “superficie”
     JOptionPane.showMessageDialog(null,"La superficie es: " + sup, "alla nio", JOptionPane.WARNING_MESSAGE);
     int suma = unCirculo.suma();
     JOptionPane.showMessageDialog(null,"La suma de 2 radios es: " + suma, "alla nio", JOptionPane.WARNING_MESSAGE);
 }
}