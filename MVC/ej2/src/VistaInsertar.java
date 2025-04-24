import javax.swing.*;
import java.awt.*;
import java.util.Observer;
//jpanels del frameform
public class VistaInsertar extends JPanel {
    protected JTextField txtConcepto = new JTextField(10);
    protected JTextField txtPrecio = new JTextField(5);
    protected JTextField txtCantidad = new JTextField(5);
    //boton guardaar
    protected JButton btnAgregar = new JButton("Añadir");

    public VistaInsertar() {
        add(new JLabel("Concepto:"));
        add(txtConcepto);
        add(new JLabel("Precio:"));
        add(txtPrecio);
        add(new JLabel("Cantidad:"));
        add(txtCantidad);
        add(btnAgregar);
    }
}