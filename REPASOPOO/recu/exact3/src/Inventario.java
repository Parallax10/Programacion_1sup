import java.util.HashMap;

public class Inventario {
    HashMap<String,Producto> inventario;

    public Inventario() {
        this.inventario = new HashMap<>();
    }

    public Inventario(HashMap<String, Producto> inventario) {
        this.inventario = inventario;
    }

    public void agregarProducto(Producto producto) {
        if (inventario.containsKey(producto.getNombre())) {
            throw new IllegalArgumentException("Ya existe un producto con ese nombre");
        }else {
            inventario.put(producto.getNombre(),producto);
        }

    }
    public void eliminarProducto(String nombre) {
        if (inventario.containsKey(nombre)) {
            inventario.remove(nombre);
        }else{
            throw new IllegalArgumentException("No existe un producto con ese nombre");
        }

    }
    public void venderProducto(String codigo,int cantidad) {
        Producto producto = inventario.get(codigo);
        producto.setCantidad(producto.getCantidad()-cantidad);
        if (producto.getCantidad()<cantidad) {
            throw new RuntimeException("El producto no esta disponible");
        }
    }

    @Override
    public String toString() {
        return "Inventario{" +
                "inventario=" + inventario +
                '}';
    }

    public HashMap<String, Producto> getInventario() {
        return inventario;
    }

    public void setInventario(HashMap<String, Producto> inventario) {
        this.inventario = inventario;
    }
}
