import java.util.*;
public class ModeloFactura extends Observable {
    private ArrayList<ModeloItem> items = new ArrayList<>();
    private double porcentajeIVA = 0.21;
    //agregar items
    public void agregarItem(ModeloItem item) {
        items.add(item);
        actualizar();
    }
    //metodo para modificar items
    public void modificarItem(int index, double precio, int cantidad) {
        if (index >= 0 && index < items.size()) {
            ModeloItem item = items.get(index);
            item.setPrecio(precio);
            item.setCantidad(cantidad);
            actualizar();
        }
    }
    //eliminar items
    public void eliminarItem(int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
            actualizar();
        }
    }

    public ArrayList<ModeloItem> getItems() {
        return items;
    }
    //suma importes
    public double getSubtotal() {
        return items.stream().mapToDouble(ModeloItem::getImporte).sum();

    }
    //obtener iva
    public double getIVA() {
        return getSubtotal() * porcentajeIVA;

    }
    //obtener total con iva
    public double getTotal() {
        return getSubtotal() + getIVA();
    }

    private void actualizar() {
        setChanged();
        notifyObservers();
    }
}