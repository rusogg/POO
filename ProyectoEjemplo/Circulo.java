
public class Circulo {
    private Punto centro;
    private int radio;
 Circulo (Punto p_centro, int p_radio){
     setCentro(p_centro);
     setRadio(p_radio);
 }
 public int getRadio() {
     return radio;
 }
 public Punto getCentro() {
     return centro;
 }
 private void setRadio(int p_radio) {
     radio = p_radio;
 }
 private void setCentro(Punto p_centro) {
     centro = p_centro;
 }
 public double superficie(){
     double sup = 3.14 * radio * radio;
     return sup;
 }
 public int suma(){
     int todo =  radio + radio;
     return todo;
 }
    }