import java.util.*;
/**
 * Permite crear bancos
 * 
 * @author Gomez Victor Agustin
 * @version 1.0
 */
public class Banco{
     
    
    // Atributos //
    
    
    private String nombre;
    private int nroSucursal;
    private ArrayList<Empleado> empleados;
    private Localidad localidad;
    private ArrayList<CuentaBancaria> cuentasBancarias;
    
    
    // Constructores //
    
    
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, Empleado p_empleado){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(new ArrayList() {{ add(p_empleado); }} );
        this.setCuentasBancarias(new ArrayList());
    }
    
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList p_empleado){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleado);
        this.setCuentasBancarias(new ArrayList());
    }
    
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList p_empleado, ArrayList p_cuentaBancaria){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleado);
        this.setCuentasBancarias(p_cuentaBancaria);
    }
    
    
    // Setters y getters //
    
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    
    private void setLocalidad(Localidad p_localidad){
        this.localidad = p_localidad;
    }
    public Localidad getLocalidad(){
        return this.localidad;
    }
    
    private void setNroSucursal(int p_nroSucursal){
        this.nroSucursal = p_nroSucursal;
    }
    public int getNroSucursal(){
        return this.nroSucursal;
    }
    
    public void setEmpleados(ArrayList<Empleado> p_empleados) {
        this.empleados = p_empleados;
    }
    public ArrayList<Empleado> getEmpleados() {
        return this.empleados;
    }
    
    public void setCuentasBancarias(ArrayList<CuentaBancaria> p_cuentasBancarias) {
        this.cuentasBancarias = p_cuentasBancarias;
    }
    public ArrayList<CuentaBancaria> getCuentasBancarias() {
        return this.cuentasBancarias;
    }
    
    
    // Metodos //
    
    /**Permite agregar un objeto a lista
     @param Empleado p_empleado
     @return Devuelve una variable de tipo Boolean
     @throws No dispara ninguna excepción **/
    public boolean agregarEmpleado(Empleado p_empleado){
        return this.getEmpleados().add(p_empleado);
    }
    
    /**Permite quitar un objeto a lista
     @param Empleado p_empleado
     @return Devuelve una variable de tipo Boolean
     @throws No dispara ninguna excepción **/
    public boolean quitarEmpleado(Empleado p_empleado){ //apela a la identidad del objeto
       return this.getEmpleados().remove(p_empleado);
    }
    
    /**Permite agregar un objeto a lista
     @param CuentaBancaria p_cuentaBancaria
     @return Devuelve una variable de tipo Boolean
     @throws No dispara ninguna excepción **/
    public boolean agregarCuentaBancaria(CuentaBancaria p_cuentaBancaria){
        return this.getCuentasBancarias().add(p_cuentaBancaria);
    }
    
    /**Permite quitar un objeto a lista
     @param Empleado CuentaBancaria p_cuentaBancaria
     @return Devuelve una variable de tipo Boolean
     @throws No dispara ninguna excepción **/
    public boolean quitarCuentaBancaria(CuentaBancaria p_cuentaBancaria){
        return this.getCuentasBancarias().remove(p_cuentaBancaria);
    }
    
    /**Recorre la lista para mostrar los sueldos
     @param No recibe parametros
     @return No devuelve nada
     @throws No dispara ninguna excepción **/
    public void listarSueldos(){
        this.mostrar();
          for(Empleado empleados: this.getEmpleados()){
        double temp = Math.round(empleados.sueldoNeto()*100.0)/100.0;
        System.out.println ( empleados.getCuil() + " " + empleados.nomYApe() + "------------------------------------------$" + temp );
        }
        System.out.println ("\n" + "Total a pagar-----------------------------------------------------$" + this.sueldosAPagar() );
    }
    
    /**Recorre la lista para sumar el total de sueldos a pagar
     @param No recibe parametros
     @return Devuelve una variable de tipo Double
     @throws No dispara ninguna excepción **/
    public double sueldosAPagar(){
        double total = 0.0;
        for(Empleado empleados: this.getEmpleados()){
        total = empleados.sueldoNeto() + total;
        }
        total = Math.round(total*100.0)/100.0;
        return total;
    }
    
    /**Muestra los datos del banco
     @param No recibe parametros
     @return No devuelve nada
     @throws No dispara ninguna excepción **/
    public void mostrar(){
        System.out.println ( "Banco:" + this.getNombre() + "\t" + "Sucursal:" + this.getNroSucursal() + "\n" + "Localidad:" + 
        this.getLocalidad().getNombre() + "\t" + "Provincia:" + this.getLocalidad().getProvincia() + "\n" );
    }
    
    /**Recorre la lista para mostrar solo las cuentas con saldo cero
     @param No recibe parametros
     @return No devuelve nada
     @throws No dispara ninguna excepción **/
    private void mostrarSaldoCero(){
        for(CuentaBancaria cuentas: this.getCuentasBancarias()){
        if ( cuentas.getSaldo() == 0.0 ){
            System.out.println ( cuentas.toString() );
        }
        }
    }
    
    /**Recorre la lista para devolver la cantidad de cuentas activas
     @param No recibe parametros
     @return Devuelve una variable de tipo Int
     @throws No dispara ninguna excepción **/
    private int cuentasSaldoActivo(){
        int contador = 0;
        for(CuentaBancaria cuentas: this.getCuentasBancarias()){
        if ( cuentas.getSaldo() > 0.0 ){
            contador++;
        }
        } return contador;
    }
    
    /**Recorre la lista mostrar el resumen de cuenta
     @param No recibe parametros
     @return No devuelve nada
     @throws No dispara ninguna excepción **/
    public void mostrarResumen(){
        int contador = 0;
        for(CuentaBancaria cuentas: this.getCuentasBancarias()){
        if ( cuentas.getSaldo() == 0.0 ){
          contador++;
            }
        }
        int total = this.cuentasSaldoActivo() + contador;
        this.mostrar();
        System.out.println ("******************************************************************");
        System.out.println ("                    RESUMEN DE CUENTAS BANCARIAS");
        System.out.println ("******************************************************************");
        System.out.println ("Numero total de Cuentas Bancarias: " + total);
        System.out.println ("Cuentas Activas: " + this.cuentasSaldoActivo());
        System.out.println ("Cuentas Saldo Cero: " + contador);
        System.out.println ("------------------------------------------------------------------");
        System.out.println ("                 Titulares con Cuenta en Saldo Cero               ");
        System.out.println ("------------------------------------------------------------------");
        this.mostrarSaldoCero();
        System.out.println ("------------------------------------------------------------------");
    }
}