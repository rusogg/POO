/**
 * Permite instanciar un paciente
 * 
 * @author Gomez Victor Agustin
 * @version 1.0
 */
public class Paciente{
    // Atributos //
    
    
    private int historiaClinica;
    private String nombre;
    private String domicilio;
    private Localidad localidadNacido;
    private Localidad localidadVive;

    
    // Constructores //

    
    public Paciente (int p_historiaClinica, String p_nombre, String p_domicilio, Localidad p_localidadNacido, Localidad p_localidadVive){
        this.setHistoriaClinica(p_historiaClinica);
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setLocalidadNacido(p_localidadNacido);
        this.setLocalidadVive(p_localidadVive);
    }
    
    
    // Setters y getters //


    private void setHistoriaClinica(int p_historiaClinica){
        this.historiaClinica = p_historiaClinica;
    }
    public int getHistoriaClinica(){
        return this.historiaClinica;
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    public String getDomicilio(){
        return this.domicilio;
    }
    
    private void setLocalidadNacido(Localidad p_localidadNacido){
        this.localidadNacido = p_localidadNacido;
    }
    public Localidad getLocalidadNacido(){
        return this.localidadNacido;
    }
    
    private void setLocalidadVive(Localidad p_localidadVive){
        this.localidadVive = p_localidadVive;
    }
    public Localidad getLocalidadVive(){
        return this.localidadVive;
    }
    
    
    // Metodos //
 
    
    /**Muestra datos, algunos utilizando metodos de otra clase, por conocimiento de variable de instancia
     @param No recibe parametros
     @return No devuelve nada
     @throws No dispara ninguna excepción **/
    public void mostrarDatosPantalla(){
        System.out.println ("Paciente:" + this.getNombre() + "\t" + "Historia clinica: " + this.getHistoriaClinica() + "\t" + "Domicilio: " + 
        this.getDomicilio()+ "\n" + this.getLocalidadVive().mostrar() + "\n" );
    }
    
    /**Muestra datos, algunos utilizando metodos de otra clase, por conocimiento de variable de instancia
     @param No recibe parametros
     @return No devuelve nada
     @throws No dispara ninguna excepción **/
    public String cadenaDeDatos(){
        return this.getNombre() + "............." + this.getHistoriaClinica() + "............." + this.getDomicilio() + "-" +
        this.getLocalidadVive().getNombre() + "-" + this.getLocalidadVive().getProvincia();
    }
}