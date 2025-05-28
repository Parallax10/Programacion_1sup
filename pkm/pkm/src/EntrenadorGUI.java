import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.util.List;

public class EntrenadorGUI extends JFrame {
    private JTextField txtNombre, txtRegion, txtExperiencia;
    private JButton btnAgregar, btnActualizar, btnEliminar, btnCargar;
    private JTable tablaEntrenadores;
    private DefaultTableModel modelo;
    private EntrenadorDAO entrenadorDAO;

    public EntrenadorGUI(Connection conexion) {
        super("Gestión de Entrenadores");
        entrenadorDAO = new EntrenadorDAO(conexion);
        configurarComponentes();
        configurarEventos();
        cargarEntrenadores();
    }

    private void configurarComponentes() {
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panelFormulario = new JPanel(new GridLayout(4, 2, 5, 5));
        panelFormulario.setBorder(BorderFactory.createTitledBorder("Datos del Entrenador"));

        txtNombre = new JTextField();
        txtRegion = new JTextField();
        txtExperiencia = new JTextField();

        panelFormulario.add(new JLabel("Nombre:"));
        panelFormulario.add(txtNombre);
        panelFormulario.add(new JLabel("Región:"));
        panelFormulario.add(txtRegion);
        panelFormulario.add(new JLabel("Experiencia:"));
        panelFormulario.add(txtExperiencia);

        btnAgregar = new JButton("Agregar");
        btnActualizar = new JButton("Actualizar");
        btnEliminar = new JButton("Eliminar");
        btnCargar = new JButton("Recargar");

        JPanel panelBotones = new JPanel();
        panelBotones.add(btnAgregar);
        panelBotones.add(btnActualizar);
        panelBotones.add(btnEliminar);
        panelBotones.add(btnCargar);

        modelo = new DefaultTableModel(new String[]{"ID", "Nombre", "Región", "Experiencia"}, 0);
        tablaEntrenadores = new JTable(modelo);
        JScrollPane scrollTabla = new JScrollPane(tablaEntrenadores);

        add(panelFormulario, BorderLayout.NORTH);
        add(scrollTabla, BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void configurarEventos() {
        btnAgregar.addActionListener(e -> agregarEntrenador());
        btnActualizar.addActionListener(e -> actualizarEntrenador());
        btnEliminar.addActionListener(e -> eliminarEntrenador());
        btnCargar.addActionListener(e -> cargarEntrenadores());

        tablaEntrenadores.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int fila = tablaEntrenadores.getSelectedRow();
                if (fila >= 0) {
                    txtNombre.setText(modelo.getValueAt(fila, 1).toString());
                    txtRegion.setText(modelo.getValueAt(fila, 2).toString());
                    txtExperiencia.setText(modelo.getValueAt(fila, 3).toString());
                }
            }
        });
    }

    private void agregarEntrenador() {
        String nombre = txtNombre.getText();
        String region = txtRegion.getText();
        int experiencia = Integer.parseInt(txtExperiencia.getText());

        Entrenador e = new Entrenador(0, nombre, region, experiencia);
        entrenadorDAO.agregarEntrenador(e);
        limpiarCampos();
        cargarEntrenadores();
    }

    private void actualizarEntrenador() {
        int fila = tablaEntrenadores.getSelectedRow();
        if (fila >= 0) {
            int id = Integer.parseInt(modelo.getValueAt(fila, 0).toString());
            String nombre = txtNombre.getText();
            String region = txtRegion.getText();
            int experiencia = Integer.parseInt(txtExperiencia.getText());

            Entrenador e = new Entrenador(id, nombre, region, experiencia);
            entrenadorDAO.actualizarEntrenador(e);
            limpiarCampos();
            cargarEntrenadores();
        }
    }

    private void eliminarEntrenador() {
        int fila = tablaEntrenadores.getSelectedRow();
        if (fila >= 0) {
            int id = Integer.parseInt(modelo.getValueAt(fila, 0).toString());
            entrenadorDAO.eliminarEntrenador(id);
            limpiarCampos();
            cargarEntrenadores();
        }
    }

    private void cargarEntrenadores() {
        modelo.setRowCount(0);
        List<Entrenador> entrenadores = entrenadorDAO.obtenerEntrenadores();
        for (Entrenador e : entrenadores) {
            modelo.addRow(new Object[]{
                    e.getId(),
                    e.getNombre(),
                    e.getRegion(),
                    e.getExperiencia()
            });
        }
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtRegion.setText("");
        txtExperiencia.setText("");
        tablaEntrenadores.clearSelection();
    }
}
