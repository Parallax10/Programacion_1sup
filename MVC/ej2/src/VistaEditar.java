import javax.swing.*;
public class VistaEditar extends JPanel {
    //campos para meter datos
    protected JTextField txtLinea = new JTextField(3);
    protected JTextField txtPrecio = new JTextField(5);
    protected JTextField txtCantidad = new JTextField(5);
    //botones
    protected JButton btnModificar = new JButton("Modificar");
    protected JButton btnEliminar = new JButton("Eliminar");

    public VistaEditar() {
        add(new JLabel("Línea #")); add(txtLinea);
        add(new JLabel("Precio")); add(txtPrecio);
        add(new JLabel("Cantidad")); add(txtCantidad);
        add(btnModificar); add(btnEliminar);
    }
}
