public class CrearFiguras{
    public static void main(String[] args){
        Punto unPunto=new Punto( 3 , 3 );
        Rectangulo unRectangulo=new Rectangulo(unPunto, 5, 4);      
        Cuadrado unCuadrado=new Cuadrado(unPunto, 4, 4, 4);
        unRectangulo.caracteristicas();
        unCuadrado.caracteristicas();
    }
}