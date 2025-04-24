import java.io.Serializable;
public class ModeloItem implements Serializable {
    private String concepto;
    private int cantidad;
    private double precio;
//constructor
    public ModeloItem(String concepto, double precio, int cantidad) {
        this.concepto = concepto;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    //geter y setter
    public double getImporte() {
        return precio * cantidad;
    }
    public String getConcepto() {
        return concepto;
    }
    public double getPrecio() {
        return precio;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
