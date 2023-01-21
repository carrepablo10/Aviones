
public class Comercial extends Avion{
    private int CantPasajero;

    public Comercial() {
        super();
        CantPasajero = 0;
    }

    public Comercial(int CantPasajero, String codigo, int precio, String color, int estanque) {
        super(codigo, precio, color, estanque);
        setCantPasajero(CantPasajero);
    }

    public int getCantPasajero() {
        return CantPasajero;
    }

    public void setCantPasajero(int CantPasajero) {
        this.CantPasajero = CantPasajero;
    }

    @Override
    public double obtenerTotalAPagar() {
        double precio = getPrecio()+(100000*getCantPasajero());
        return precio;
    }

    @Override
    public double descuentos() {
        double dscto = obtenerTotalAPagar()-obtenerTotalAPagar()*descuentoAvionesComerciales;
        return dscto;
    }

    @Override
    public double obtenerTotalFinal() {
        double desctoFinal = descuentos() - descuentos()*iva;
        return desctoFinal;
    }

    @Override
    public String toString() {
        return "Comercial{" + "CantPasajero=" + CantPasajero + '}';
    }
     
    

    public void mostrarDatosCOMERCIAL(){
        System.out.println("AVIÓN COMERCIAL");
        super.mostrarDatos();
        System.out.println("cantidad pasajeros       : " + getCantPasajero());
        System.out.println("color                    : " + getColor());
        System.out.println("capacidad estanque       : " + getEstanque());
        System.out.println("precio inicial           : " + obtenerTotalAPagar());
        System.out.println("precio con descuento     : " + descuentos());
        System.out.println("precio final descto iva  : " + obtenerTotalFinal());
       
    }

    
}
