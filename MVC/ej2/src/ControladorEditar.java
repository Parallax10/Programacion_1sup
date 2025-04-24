import java.awt.event.*;
public class ControladorEditar {
    public ControladorEditar(ModeloFactura modelo, VistaEditar vista) {
        vista.btnModificar.addActionListener(new ActionListener() {//pulsar boton
            public void actionPerformed(ActionEvent e) {
                int index = Integer.parseInt(vista.txtLinea.getText()) - 1;
                double precio = Double.parseDouble(vista.txtPrecio.getText());
                int cantidad = Integer.parseInt(vista.txtCantidad.getText());
                modelo.modificarItem(index, precio, cantidad);//cambiar datos
            }
        }
        );
        vista.btnEliminar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int index = Integer.parseInt(vista.txtLinea.getText()) - 1;
                modelo.eliminarItem(index);//elimina datos
            }
        }
        );
    }
}
