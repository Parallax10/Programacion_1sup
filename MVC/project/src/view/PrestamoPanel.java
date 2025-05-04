package view;

import controller.LibroController1;
import controller.PrestamoController;
import controller.UsuarioController;
import model.Libro;
import model.Prestamo;
import model.Usuario;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PrestamoPanel extends JPanel {
    private PrestamoController prestamoController;
    private UsuarioController usuarioController;
    private LibroController1 libroController;
    private JTable tablaPrestamos;
    private PrestamoTableModel tableModel;

    public PrestamoPanel() {
        prestamoController = new PrestamoController();
        usuarioController = new UsuarioController();
        libroController = new LibroController1();
        initComponents();
        cargarPrestamosActivos();
    }

    private void initComponents() {
        setLayout(new BorderLayout());

        // Panel superior con botones
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JButton btnNuevoPrestamo = new JButton("Nuevo Préstamo");
        btnNuevoPrestamo.addActionListener(e -> mostrarDialogoNuevoPrestamo());

        JButton btnRegistrarDevolucion = new JButton("Registrar Devolución");
        btnRegistrarDevolucion.addActionListener(e -> registrarDevolucion());

        panelBotones.add(btnNuevoPrestamo);
        panelBotones.add(btnRegistrarDevolucion);

        add(panelBotones, BorderLayout.NORTH);

        // Tabla de préstamos
        tableModel = new PrestamoTableModel();
        tablaPrestamos = new JTable(tableModel);
        add(new JScrollPane(tablaPrestamos), BorderLayout.CENTER);
    }

    private void cargarPrestamosActivos() {
        tableModel.setPrestamos(prestamoController.obtenerPrestamosActivos());
    }

    private void mostrarDialogoNuevoPrestamo() {
        JDialog dialogo = new JDialog((Frame) SwingUtilities.getWindowAncestor(this), "Nuevo Préstamo", true);
        dialogo.setLayout(new GridLayout(0, 2, 5, 5));

        // Combo para seleccionar usuario
        List<Usuario> usuarios = usuarioController.obtenerTodosUsuarios();
        JComboBox<Usuario> comboUsuarios = new JComboBox<>();
        for (Usuario usuario : usuarios) {
            comboUsuarios.addItem(usuario);
        }

        // Combo para seleccionar libro (solo disponibles)
        List<Libro> librosDisponibles = libroController.obtenerLibrosDisponibles();
        JComboBox<Libro> comboLibros = new JComboBox<>();
        for (Libro libro : librosDisponibles) {
            comboLibros.addItem(libro);
        }

        // Fecha de devolución prevista (7 días después por defecto)
        JTextField txtFechaDevolucion = new JTextField(LocalDate.now().plusDays(7).toString());
        txtFechaDevolucion.setEditable(false);

        dialogo.add(new JLabel("Usuario:"));
        dialogo.add(comboUsuarios);
        dialogo.add(new JLabel("Libro:"));
        dialogo.add(comboLibros);
        dialogo.add(new JLabel("Fecha Devolución Prevista:"));
        dialogo.add(txtFechaDevolucion);

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(e -> {
            Usuario usuario = (Usuario) comboUsuarios.getSelectedItem();
            Libro libro = (Libro) comboLibros.getSelectedItem();
            LocalDate fechaDevolucion = LocalDate.now().plusDays(7);

            if (prestamoController.realizarPrestamo(
                    usuario.getDni(),
                    libro.getIdLibro(),
                    LocalDate.now(),
                    fechaDevolucion)) {

                JOptionPane.showMessageDialog(dialogo, "Préstamo registrado correctamente");
                cargarPrestamosActivos();
                dialogo.dispose();
            } else {
                JOptionPane.showMessageDialog(dialogo, "Error al registrar el préstamo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        JButton btnCancelar = new JButton("Cancelar");
        btnCancelar.addActionListener(e -> dialogo.dispose());

        dialogo.add(btnGuardar);
        dialogo.add(btnCancelar);

        dialogo.pack();
        dialogo.setLocationRelativeTo(this);
        dialogo.setVisible(true);
    }

    private void registrarDevolucion() {
        int filaSeleccionada = tablaPrestamos.getSelectedRow();
        if (filaSeleccionada >= 0) {
            int confirmacion = JOptionPane.showConfirmDialog(
                    this,
                    "¿Registrar devolución de este préstamo?",
                    "Confirmar devolución",
                    JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                int idPrestamo = tableModel.getPrestamoEn(filaSeleccionada).getIdPrestamo();
                if (prestamoController.registrarDevolucion(idPrestamo)) {
                    JOptionPane.showMessageDialog(this, "Devolución registrada correctamente");
                    cargarPrestamosActivos();
                } else {
                    JOptionPane.showMessageDialog(this, "Error al registrar la devolución", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un préstamo de la tabla", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    private class PrestamoTableModel extends AbstractTableModel {
        private List<Prestamo> prestamos = new ArrayList<>();
        private final String[] columnNames = {"ID", "Usuario", "Libro", "Fecha Préstamo", "Fecha Devolución", "Estado"};

        public void setPrestamos(List<Prestamo> prestamos) {
            this.prestamos = prestamos;
            fireTableDataChanged();
        }

        public Prestamo getPrestamoEn(int rowIndex) {
            return prestamos.get(rowIndex);
        }

        @Override
        public int getRowCount() {
            return prestamos.size();
        }

        @Override
        public int getColumnCount() {
            return columnNames.length;
        }

        @Override
        public String getColumnName(int column) {
            return columnNames[column];
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            Prestamo prestamo = prestamos.get(rowIndex);
            Usuario usuario = usuarioController.buscarUsuarioPorDni(prestamo.getDniUsuario());
            Libro libro = libroController.buscarLibroPorId(prestamo.getIdLibro());

            switch (columnIndex) {
                case 0: return prestamo.getIdPrestamo();
                case 1: return usuario != null ? usuario.getNombre() : "Desconocido";
                case 2: return libro != null ? libro.getTitulo() : "Desconocido";
                case 3: return prestamo.getFechaPrestamo().toString();
                case 4: return prestamo.getFechaDevolucionPrevista().toString();
                case 5: return prestamo.estaVencido() ? "Vencido" : "Activo";
                default: return null;
            }
        }
    }
}