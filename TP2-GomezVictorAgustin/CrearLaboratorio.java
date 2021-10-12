
public class CrearLaboratorio{
    public static void main(String[] args){
        Laboratorio unLaboratorio=new Laboratorio("Colgate SA","Junin 5204",": 54-11-4239-8447");      
        System.out.println (unLaboratorio.mostrar());
        unLaboratorio.nuevaCompraMinima(500);
        unLaboratorio.nuevoDiaDeEntrega(23);
    }
}