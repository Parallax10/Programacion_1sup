import javax.swing.*;
import java.awt.*;
public class Main {
    public static void main(String[] args) {
        ModeloFactura modelo = new ModeloFactura();
        VistaInsertar insertar = new VistaInsertar();
        VistaListado listado = new VistaListado();
        VistaEditar editar = new VistaEditar();
        VistaTotales totales = new VistaTotales();
        new ControladorInsertar(modelo, insertar);
        new ControladorEditar(modelo, editar);
        new ControladorListado(modelo, listado);
        new ControladorTotales(modelo, totales);
        JFrame frame = new JFrame("Gestión Facturas");
        frame.setLayout(new BorderLayout());
        frame.add(insertar, BorderLayout.NORTH);
        frame.add(listado, BorderLayout.CENTER);
        JPanel abajo = new JPanel(new BorderLayout());
        abajo.add(editar, BorderLayout.WEST);
        abajo.add(totales, BorderLayout.EAST);
        frame.add(abajo, BorderLayout.SOUTH);
        frame.setSize(700, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}