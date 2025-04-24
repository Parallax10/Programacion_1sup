import javax.swing.*;
import java.util.Observable;
import java.util.Observer;
public class VistaTotales extends JPanel implements Observer {
    protected JLabel lblSubtotal = new JLabel("Subtotal: 0");
    protected JLabel lblIVA = new JLabel("IVA: 0");
    protected JLabel lblTotal = new JLabel("Total: 0");
    public VistaTotales() {
        add(lblSubtotal);
        add(lblIVA);
        add(lblTotal);
    }
    public void update(Observable o, Object arg) {
        ModeloFactura factura = (ModeloFactura) o;
        lblSubtotal.setText("Subtotal: " + factura.getSubtotal());
        lblIVA.setText("IVA: " + factura.getIVA());
        lblTotal.setText("Total: " + factura.getTotal());
    }
}