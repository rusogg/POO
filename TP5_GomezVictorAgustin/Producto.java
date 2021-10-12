import java.util.*;
/**
 * Permite instanciar un producto
 * 
 * @author Gomez Victor Agustin
 * @version 1.0
 */
public class Producto{
    // Atributos //
    
    
    private int codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio laboratorio;

    
    // Constructores //

    
    public Producto (int p_codigo,String p_rubro,String p_descripcion,
    double p_costo, double p_porcPtoRepo, int p_existMinima,
    Laboratorio p_laboratorio){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_descripcion);
        this.setCosto(p_costo);
        this.setStock(0);
        this.setPorcPtoRepo(p_porcPtoRepo);
        this.setExistMinima(p_existMinima);
        this.setLaboratorio(p_laboratorio);
    }
    
    public Producto (int p_codigo,String p_rubro,String p_descripcion,
    double p_costo,Laboratorio p_laboratorio){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_descripcion);
        this.setCosto(p_costo);
        this.setStock(0);
        this.setPorcPtoRepo(0.0);
        this.setExistMinima(0);
        this.setLaboratorio(p_laboratorio);
    }
    
    
    // Setters y getters //

    
    private void setCodigo(int p_codigo){
        this.codigo = p_codigo;
    }
    public int getCodigo(){
        return this.codigo;
    }

     private void setRubro(String p_rubro){
        this.rubro = p_rubro;
    }
    public String getRubro(){
        return this.rubro;
    }   
    
    private void setDescripcion(String p_descripcion){
        this.descripcion = p_descripcion;
    }
    public String getDescripcion(){
        return this.descripcion;
    }

    private void setCosto(double p_costo){
        this.costo = p_costo;
    }
    public double getCosto(){
        return this.costo;
    }

    private void setStock(int p_stock){
        this.stock = p_stock;
    }
    public int getStock(){
        return this.stock;
    }
    
    private void setPorcPtoRepo(double p_porcPtoRepo){
        this.porcPtoRepo = p_porcPtoRepo;
    }
    public double getPorcPtoRepo(){
        return this.porcPtoRepo;
    }
    
    private void setExistMinima(int p_existMinima){
        this.existMinima = p_existMinima;
    }
    public int getExistMinima(){
        return this.existMinima;
    }
    
    private void setLaboratorio(Laboratorio p_laboratorio){
        this.laboratorio = p_laboratorio;
    }
    public Laboratorio getLaboratorio(){
        return this.laboratorio;
    }
    
    
    // Metodos //
    
    
    public void mostrar(){
        System.out.println (this.getLaboratorio().mostrar() + "\n" + "---------------------------------------------" + "\n" + "Rubro: " 
        + this.getRubro() + "\n" + "Descripcion: " + 
        this.getDescripcion() + "\n" + "Precio costo: " + this.getCosto() + "\n" + "Stock: " + this.getStock() + " - " + "Stock Valorizado: "
        + stockValorizado());
        System.out.println ("\n" + "////////////////////////SEPARADOR////////////////////////" + "\n");
    }
    
    /**Si el stock nuevo es positivo, se agrega al stock, si es negativo se resta
     @param int p_cantidad
     @return No devuelve nada
     @throws No dispara ninguna excepción **/
    public void ajuste(int p_cantidad){
        if(p_cantidad > 0){
            this.setStock(this.getStock() + p_cantidad);
        } else{
            this.setStock(this.getStock() + p_cantidad);
        }
    }
    
    /**Guardamos en una variable temporal el valor del stock y le sumamos el 12% para luego devolver el total
     @param No recibe parametros
     @return Devuelve una variable de tipo double
     @throws No dispara ninguna excepción **/
    public double stockValorizado(){
        double temp = this.getStock() * this.getCosto();
        return temp + ( (12 * temp) / 100 );
    }
    
    /**Suma un 12% al precio costo para devolver el precio de lista
     @param No recibe parametros
     @return Devuelve una variable de tipo double
     @throws No dispara ninguna excepción **/
    public double precioLista(){
        return this.getCosto() + ( (12 * this.getCosto()) / 100 ) ;
    }
    
    /**Resta un 5% al precio de lista para devolver precio de contado
     @param No recibe parametros
     @return Devuelve una variable de tipo double
     @throws No dispara ninguna excepción **/
    public double precioContado(){
        return precioLista() - ( (5 * precioLista()) / 100 ) ;
    }
    
    public String mostrarLinea(){
        double lista = Math.round(precioLista()*100.0)/100.0;
        double contado = Math.round(precioContado()*100.0)/100.0;
        return this.getDescripcion() + this.getRubro() + "\t" + lista + "\t" + contado + "\n" ;
    }
    
    /**Cambia el valor Porcentaje de reposicion
     @param double p_porce
     @return No devuelve nada
     @throws No dispara ninguna excepción **/
    public void ajustarPtoRepo(double p_porce){
        this.setPorcPtoRepo(p_porce) ;
        System.out.println("Nuevo porcentaje de reposicion: " + this.getPorcPtoRepo() );
    }
     
    /**Cambia el valor de existencia minima de un producto
     @param double p_cantidad
     @return No devuelve nada
     @throws No dispara ninguna excepción **/
    public void ajustarExistMin(int p_cantidad){
        this.setExistMinima(p_cantidad) ;
        System.out.println("Nuevo stock minimo: " + this.getExistMinima() );
    }
    

    
    
}