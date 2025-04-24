public class ControladorTotales {
    public ControladorTotales(ModeloFactura modelo, VistaTotales vista) {
        modelo.addObserver(vista);
    }
}
