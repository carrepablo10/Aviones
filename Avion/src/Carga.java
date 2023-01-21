
public class Carga extends Avion{
    private int Capacidad;

    public Carga() {
        super();
        Capacidad = 0;
    }

    public Carga(int Capacidad, String codigo, int precio, String color, int estanque) {
        super(codigo, precio, color, estanque);
        setCapacidad(Capacidad);
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int Capacidad) {
        if(Capacidad >= 1) {
            this.Capacidad = Capacidad;
        }else{
            throw new IllegalArgumentException("CAPACIDAD MINIMA 1");
        }
    }

    @Override
    public double obtenerTotalAPagar() {
        double precio = getPrecio()+(getCapacidad()*1200000);
        return precio;
    }

    @Override
    public double descuentos() {
        double dscto = obtenerTotalAPagar()-obtenerTotalAPagar()*descuentoAvionesCarga;
        return dscto;
    }

    @Override
    public double obtenerTotalFinal() {
        double desctoFinal =descuentos() - descuentos()*iva;
        return desctoFinal;
    }

    @Override
    public String toString() {
        return "Carga{" + "Capacidad=" + Capacidad + '}';
    }
     
    

    public void mostrarDatosCARGA(){
        System.out.println("AVIÓN CARGA");
        super.mostrarDatos();
        System.out.println("capacidad estanque    : " + getEstanque());
        System.out.println("color                 : " + getColor());
        System.out.println("Cantidad de toneladas : " + getCapacidad());
        System.out.println("Precio inicial        : " + obtenerTotalAPagar());
        System.out.println("Precio con descuento  : " + descuentos());
        System.out.println("Precio final          : " + obtenerTotalFinal());
    }

 

    
    
    
    
}
