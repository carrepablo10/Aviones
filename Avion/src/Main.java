
public class Main {

  
    public static void main(String[] args) {
       Comercial comercial1 = new Comercial(2, "AA-BB-200", 2000, "azul", 5000);
       Carga carga1 = new Carga(5, "BB-CC-200", 15000, "rojo", 45000);
       Tienda tind = new Tienda();
       
       tind.AgregarAvion(comercial1);
       tind.AgregarAvion(carga1);
       
       // para que pueda verficar, profe borre el comentado del metodo eliminar
       //tind.EliminarAvion("AA-BB-200");
       
       
       tind.listarAvion();
       
       
       tind.contadorAvionesEstanque();
       tind.contadorToneladas(carga1);
    }
    
    
}
