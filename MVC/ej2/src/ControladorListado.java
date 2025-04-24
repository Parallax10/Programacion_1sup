public class ControladorListado {
    public ControladorListado(ModeloFactura modelo, VistaListado vista) {
        modelo.addObserver(vista);
    }
}
