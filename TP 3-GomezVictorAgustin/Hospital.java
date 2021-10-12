public class Hospital{
    // Atributos //
    
    
    private String nombreHospital;
    private String nombreDirector;

    
    // Constructores //

    
    public Hospital (String p_nombreHospital, String p_nombreDirector){
        this.setNombreHospital(p_nombreHospital);
        this.setNombreDirector(p_nombreDirector);
    }
    
    
    // Setters y getters //


    private void setNombreHospital(String p_nombreHospital){
        this.nombreHospital = p_nombreHospital;
    }
    public String getNombreHospital(){
        return this.nombreHospital;
    }
    
    private void setNombreDirector(String p_nombreDirector){
        this.nombreDirector= p_nombreDirector;
    }
    public String getNombreDirector(){
        return this.nombreDirector;
    }
    
    
    // Metodos //
 
    
    public void consultarDatosFiliatorios(Paciente p_paciente){
        System.out.println ("Hospital:" + this.getNombreHospital() + "\t" + "Director: " + this.getNombreDirector() + "\n" +
        "-----------------------------------------------------------------------------------------" );
        p_paciente.mostrarDatosPantalla();
    }
}