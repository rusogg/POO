import java.util.*;
/**
 * Permite instanciar un hombre
 * 
 * @author Gomez Victor Agustin
 * @version 1.0
 */
public class Hombre{
    // Atributos //
    
    
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Mujer esposa;

    
    // Constructores //

    
    public Hombre (String p_nombre, String p_apellido, int p_edad){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltero/a");
        this.setEsposa(null);
    }
    
    public Hombre (String p_nombre, String p_apellido, int p_edad, Mujer p_esposa){
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Casado/a");
        this.setEsposa(p_esposa);
    }
    
    
    // Setters y getters //


    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    public String getApellido(){
        return this.apellido;
    }
    
    private void setEdad(int p_edad){
        this.edad = p_edad;
    }
    public int getEdad(){
        return this.edad;
    }
    
    private void setEstadoCivil(String p_estadoCivil){
        this.estadoCivil = p_estadoCivil;
    }
    public String getEstadoCivil(){
        return this.estadoCivil;
    }
    
    private void setEsposa(Mujer p_esposa){
        this.esposa = p_esposa;
    }
    public Mujer getEsposa(){
        return this.esposa;
    }
    
    
    // Metodos //
    
    
    /**Hace las verificaciones necesarias para ver si se puede casar y lo hace, y se comunica con el otro objeto para hacer lo mismo, tambien 
     si no verifica muestra en pantalla porque no puede casarse
     @param Mujer p_mujer
     @return No devuelve nada
     @throws No dispara ninguna excepción **/
    public void casarseCon( Mujer p_mujer ){
        if ( ( (this.getEstadoCivil() == "Soltero/a" || this.getEstadoCivil() == "Divorciado/a") && (p_mujer.getEstadoCivil() == "Soltero/a" || 
        p_mujer.getEstadoCivil() == "Divorciado/a" ) ) || p_mujer.getEsposo() == this && ( this.getEstadoCivil() ==  "Soltero/a" || 
        this.getEstadoCivil() ==  "Divorciado/a" ) ) {
            this.setEstadoCivil("Casado/a");
            this.setEsposa(p_mujer);
            
            if ( p_mujer.getEstadoCivil() != "Casado/a" ){
                p_mujer.casarseCon(this); }
            
            System.out.println ( this.getNombre() + " se acaba de casar con " + this.getEsposa().getNombre() ) ;
            System.out.println ( " ------------------FELICIDADES------------------ " + "\n" ) ;
        } else if ( this.getEstadoCivil() == "Casado/a" && ( p_mujer.getEstadoCivil() == "Soltero/a" || p_mujer.getEstadoCivil() == "Divorciado/a" )) {
            System.out.println ( this.getNombre() + " ya se encuentra casado/a con " + this.getEsposa().getNombre() + "\n" ) ;
        } else if ( p_mujer.getEstadoCivil() == "Casado/a" && ( this.getEstadoCivil() == "Soltero/a" || this.getEstadoCivil() == "Divorciado/a" ) ) {
            System.out.println ( p_mujer.getNombre() + " ya se encuentra casado/a con " + p_mujer.getEsposo().getNombre() + "\n" ) ;
        } else if ( p_mujer.getEstadoCivil() == "Casado/a" && this.getEstadoCivil() == "Casado/a" ) {
            System.out.println ( "Ambos ya se encuentran casados!" + "\n" ) ;
            if ( p_mujer.getEsposo() == this &&  this.getEsposa() == p_mujer ) {
            System.out.println ( "Y ademas estan casados el uno con el otro!" + "\n" ) ;
        }
        
        } 
        
    }
    
    /**Hace las verificaciones necesarias para ver si se puede divorciar y lo hace, tambien hace lo mismo con el otro objeto, si no se puede,
     muestra en pantalla el motivo
     @param No recibe parametros
     @return No devuelve nada
     @throws No dispara ninguna excepción **/
    public void divorcio (){
        if ( this.getEstadoCivil() == "Casado/a" ) {
            Mujer aux = this.getEsposa();
            this.setEstadoCivil("Divorciado/a");
            this.setEsposa(null);
            
            if ( aux.getEstadoCivil() == "Casado/a" ){
                aux.divorcio(); }
            
            System.out.println ( this.getNombre() + " se acaba de divorciar " ) ;
            System.out.println ( " ------------------INFELICIDADES------------------ " + "\n" ) ;
        } else if ( this.getEstadoCivil() == "Soltero/a" ) {
            System.out.println ( this.getNombre() + " se encuentra Soltero/a" ) ;
        } else {
            System.out.println ( this.getNombre() + " ya se encuentra Divorciado/a" ) ;
        }
    }
       
    public void datos(){
        System.out.println (this.getNombre() + " de " + this.getEdad() + " años"+ "\n");
    }
    
    public void mostrarEstadoCivil(){
        System.out.println (this.getNombre() + " de " + this.getEdad() + " años" + " - " + this.getEstadoCivil() + "\n" );
    }
    
    /**Hace las verificaciones necesarias obteniendo el estado civil del objeto y muestra con quien esta casado, sino, muestra por pantalla el estado civil
     @param No recibe parametros
     @return No devuelve nada
     @throws No dispara ninguna excepción **/
    public void casadoCon(){
        if ( this.getEstadoCivil() == "Casado/a" ) {
        System.out.println (this.getNombre() + " de " + this.getEdad() + " años" + " esta casado con " + this.getEsposa().getNombre() + " de " + 
        this.getEsposa().getEdad() + " años" + "\n"); 
    }  else if ( this.getEstadoCivil() == "Soltero/a" ) {
            System.out.println ( this.getNombre() + " se encuentra Soltero/a" ) ;
        } else {
            System.out.println ( this.getNombre() + " se encuentra Divorciado/a" ) ;
        }
    }
}