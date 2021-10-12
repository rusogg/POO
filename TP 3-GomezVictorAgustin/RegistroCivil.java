public class RegistroCivil{
    public static void main(String[] args){
        Mujer unaMujer=new Mujer("Monica","Jimenez",28);
        Hombre unHombre=new Hombre("Pedro","Ramirez",24);
        /* PRUEBAS EXHAUSTIVAS
        Hombre unHombre2=new Hombre("Ricardo","Gomez",29);
        Mujer unaMujer2=new Mujer("Cecilia","Lopez",27);
        
        unaMujer.datos();
        unaMujer.mostrarEstadoCivil();
        unaMujer.casadaCon();
        
        unaMujer.casarseCon(unHombre);
        
        unHombre.mostrarEstadoCivil();
        
        unaMujer.casarseCon(unHombre);
        
        unaMujer2.casarseCon(unHombre);
        unaMujer.casarseCon(unHombre2);
        
        unaMujer.divorcio();
        unaMujer.divorcio();
        unHombre.divorcio();
        
        unaMujer2.casarseCon(unHombre);
        unaMujer2.casarseCon(unHombre);
        unaMujer2.casarseCon(unHombre2);
        
        unHombre.casarseCon(unaMujer);  PRUEBAS EXHAUSTIVAS, casarse 2 solteros, casarse 1 soltero y 1 divorciado, intentar casarse una vez
                                                                                        casados y con solteros o divorciados, y divorciarse*/
                                                                                        
        unaMujer.casarseCon(unHombre);
        System.out.println ("--------------------------------------------------");
        System.out.println ("************Certificado de matrimonio************");
        System.out.println ("        El Registro civil da registro que        ");
        unHombre.casadoCon();
        unaMujer.casadaCon();
        System.out.println ("--------------------------------------------------");
        
        
    }
}