import java.lang.reflect.Array;
import java.util.Scanner;

public class Figura {
    String codigo;
    double precio;
    Superheroe superheroe;
    Dimension dimension;

    public Figura(String codigo, double precio, Superheroe superheroe, Dimension dimension) {
        this.codigo = codigo;
        this.precio = precio;
        this.superheroe = superheroe;
        this.dimension = dimension;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public Superheroe getS1() {
        return superheroe;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setS1(Superheroe superheroe) {
        this.superheroe = superheroe;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }
    public String mostrar(){
        return "Codigo: " + codigo+" Precio: " + precio+" Superheroe: " + superheroe+" Dimensiones: " + dimension;
    }
    public void subirPrecio(){
        double cantidad;
        System.out.println("Cantidad a subir: ");
        Scanner sc = new Scanner(System.in);
        cantidad = sc.nextDouble();
        this.precio = cantidad;
    }
}
