import java.awt.event.*;
public class ControladorInsertar {
    public ControladorInsertar(ModeloFactura modelo, VistaInsertar vista) {
        vista.btnAgregar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String concepto = vista.txtConcepto.getText();
                double precio = Double.parseDouble(vista.txtPrecio.getText());
                int cantidad = Integer.parseInt(vista.txtCantidad.getText());
                modelo.agregarItem(new ModeloItem(concepto, precio, cantidad));
            }
        });
    }
}