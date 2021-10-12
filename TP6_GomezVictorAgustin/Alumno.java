import java.util.*;
public class Alumno extends Persona{
    // Atributos //
    
    
    private int lu;
    private double nota1;
    private double nota2;
    

    // Constructores //
    

    public Alumno (int p_nroDni, String p_nombre,String p_apellido, Calendar p_fecha, int p_lu){
        super(p_nroDni, p_nombre, p_apellido, p_fecha);
        this.setLu(p_lu);
        this.setNota1(0.0);
        this.setNota2(0.0);
    }
    
    
    // Setters y getters //

    
    private void setLu(int p_lu){
        this.lu = p_lu;
    }
    public int getLu(){
        return this.lu;
    }

    public void setNota1(double p_nota1){
        this.nota1 = p_nota1;
    }
    public double getNota1(){
        return this.nota1;
    }
    
    public void setNota2(double p_nota2){
        this.nota2 = p_nota2;
    }
    public double getNota2(){
        return this.nota2;
    }
    
    
    // Metodos //
    
    
    /**Si las 2 notas superan o son iguales a 6 y el promedio es mayor a 7 devulve true
     @param No recibe parametros
     @return Devuelve una variable de tipo boolean
     @throws No dispara ninguna excepción **/
    private boolean aprueba(){
        return this.getNota1() >= 6.0 && this.getNota2() >= 6.0 && this.promedio() > 7.0;
    }

    /**Si recibe true, devuelve aprobado, sino desaprobado
     @param No recibe parametros
     @return Devuelve una variable de tipo String
     @throws No dispara ninguna excepción **/
    private String leyendaAprueba(){
        if ( this.aprueba() == true ){
            return "APROBADO";}
        else{
            return "DESAPROBADO";
        }
    }
    
    /**Promedio de las dos notas
     @param No recibe parametros
     @return Devuelve una variable de tipo double
     @throws No dispara ninguna excepción **/
    public double promedio(){
        return ( this.getNota1() + this.getNota2() ) / 2;
    }
    
    /**Devuelve nombre y apellido
     @param No recibe parametros 
     @return Devuelve una variable de tipo String
     @throws No dispara ninguna excepción **/
     public String nomYApe(){
        return this.getNombre()+ " " + this.getApellido();
    }
    
    /**Devuelve apellido y nombre
     @param No recibe parametros 
     @return Devuelve una variable de tipo String
     @throws No dispara ninguna excepción **/
    public String apeYNom(){
        return this.getApellido() + " " + this.getNombre();
    }    
    
    protected void mostrar(){
        super.mostrar();
        System.out.println ("LU: " + this.getLu() + "  Notas: " + this.getNota1() + " - " + this.getNota2() 
        + "\n" + "Promedio: "+ this.promedio() + " - " + this.leyendaAprueba());
    }
    
}