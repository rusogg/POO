/**
 * Permite instanciar una localidad
 * 
 * @author Gomez Victor Agustin
 * @version 1.0
 */
public class Localidad{
    // Atributos //
    
    
    private String nombre;
    private String provincia;

    
    // Constructores //

    
    public Localidad (String p_nombre, String p_provincia){
        this.setNombre(p_nombre);
        this.setProvincia(p_provincia);
    }
    
    
    // Setters y getters //


    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    private void setProvincia(String p_provincia){
        this.provincia = p_provincia;
    }
    public String getProvincia(){
        return this.provincia;
    }
    
    
    // Metodos //
 
    
    public String mostrar(){
        return "Localidad: " + this.getNombre() + "\t" + "Provincia:" + this.getProvincia();
    }
}