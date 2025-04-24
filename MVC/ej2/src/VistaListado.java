import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Observable;
import java.util.Observer;

public class VistaListado extends JPanel implements Observer {
    protected JTable tabla;
    protected DefaultTableModel modeloTabla;
    public VistaListado() {
        modeloTabla = new DefaultTableModel(new Object[]{"Concepto", "Precio",
                "Cantidad", "Total"}, 0);
        tabla = new JTable(modeloTabla);
        setLayout(new BorderLayout());
        add(new JScrollPane(tabla), BorderLayout.CENTER);
    }
    public void update(Observable o, Object arg) {
        ModeloFactura factura = (ModeloFactura) o;
        modeloTabla.setRowCount(0);
        for (ModeloItem item : factura.getItems()) {
            modeloTabla.addRow(new Object[]{item.getConcepto(), item.getPrecio(),
                    item.getCantidad(), item.getImporte()});
        }
    }
}