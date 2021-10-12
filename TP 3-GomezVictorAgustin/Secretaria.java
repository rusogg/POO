public class Secretaria{
    public static void main(String[] args){
        Docente unDocente=new Docente(args[0], args[1], Double.valueOf(args[2]), Double.valueOf(args[3]));
        Escuela unaEscuela=new Escuela(args[4], args[5], args[6]);
        unaEscuela.imprimirRecibo(unDocente);
    }
}