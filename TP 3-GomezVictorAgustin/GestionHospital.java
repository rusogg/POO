public class GestionHospital{
    public static void main(String[] args){
        Localidad unaLocalidadNacido=new Localidad("Capital","Corrientes");
        Localidad unaLocalidadVive=new Localidad("Monte Caseros","Corrientes");
        Paciente unPaciente=new Paciente(578669,"Juan Manuel Ortigoza","Bulevar 3 de abril",unaLocalidadNacido,unaLocalidadVive);
        Hospital unHospital=new Hospital("Garrahan","Leonardo Ruiz");
        System.out.println ( unPaciente.cadenaDeDatos() + "\n" );
        unPaciente.mostrarDatosPantalla();
        unHospital.consultarDatosFiliatorios(unPaciente);
        System.out.println ( "Localidad de procedencia del paciente" );
        System.out.println ( "--------------------------------------" );
        System.out.println ( unPaciente.getLocalidadNacido().mostrar() );
    }
}