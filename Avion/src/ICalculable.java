
public interface ICalculable {
    double iva = 0.19;
    double descuentoAvionesCarga = 0.09;
    double descuentoAvionesComerciales = 0.15;
    
    
    double obtenerTotalAPagar();
    double descuentos();
    double obtenerTotalFinal();

} 
