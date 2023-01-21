
public abstract class Avion implements ICalculable{
    private String codigo;
    private int precio;
    private String color;
    private int estanque;

    public Avion() {
        codigo = "";
        precio = 0;
        color = "";
        estanque = 0;
    }

    public Avion(String codigo, int precio, String color, int estanque) {
        setCodigo(codigo);
        setPrecio(precio);
        setColor(color);
        setEstanque(estanque);
    }

   
    public String getCodigo() {
        return codigo;
    }

    public int getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public int getEstanque() {
        return estanque;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(int precio) {  
        if(precio > 1){
            this.precio = precio;          
        }else{
            throw new IllegalArgumentException("precio minimo 1 ");
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEstanque(int estanque) {
        this.estanque = estanque;
       
    }

    @Override
    public String toString() {
        return "Avion{" + "codigo=" + codigo + ", precio=" + precio + ", color=" + color + ", estanque=" + estanque + '}';
    }
    
    

    public void mostrarDatos(){
        System.out.println("codigo                :  "+ getCodigo());
        System.out.println("precio                :  $"+getPrecio());
        
    }

    
            
    
}
