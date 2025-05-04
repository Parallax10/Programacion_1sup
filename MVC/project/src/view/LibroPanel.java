package view;

import controller.LibroController1;
import model.Libro;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class LibroPanel extends JPanel {
    private LibroController1 controller;
    private JTable tablaLibros;
    private LibroTableModel tableModel;

    public LibroPanel() {
        controller = new LibroController1();
        initComponents();
        cargarLibros();
    }

    private void initComponents() {
        setLayout(new BorderLayout());

        // Panel superior con botones
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JButton btnAgregar = new JButton("Agregar Libro");
        btnAgregar.addActionListener(e -> mostrarDialogoAgregarLibro());

        JButton btnEditar = new JButton("Editar Libro");
        btnEditar.addActionListener(e -> editarLibroSeleccionado());

        JButton btnEliminar = new JButton("Eliminar Libro");
        btnEliminar.addActionListener(e -> eliminarLibroSeleccionado());

        panelBotones.add(btnAgregar);
        panelBotones.add(btnEditar);
        panelBotones.add(btnEliminar);

        add(panelBotones, BorderLayout.NORTH);

        // Tabla de libros
        tableModel = new LibroTableModel();
        tablaLibros = new JTable(tableModel);
        add(new JScrollPane(tablaLibros), BorderLayout.CENTER);

        // Panel de búsqueda
        JPanel panelBusqueda = new JPanel();
        JTextField txtBusqueda = new JTextField(30);
        JButton btnBuscar = new JButton("Buscar");
        btnBuscar.addActionListener(e -> buscarLibros(txtBusqueda.getText()));

        panelBusqueda.add(new JLabel("Buscar por título:"));
        panelBusqueda.add(txtBusqueda);
        panelBusqueda.add(btnBuscar);

        add(panelBusqueda, BorderLayout.SOUTH);
    }

    private void cargarLibros() {
        tableModel.setLibros(controller.obtenerTodosLibros());
    }

    private void buscarLibros(String texto) {
        List<Libro> todosLibros = controller.obtenerTodosLibros();
        List<Libro> librosFiltrados = new ArrayList<>();

        for (Libro libro : todosLibros) {
            if (libro.getTitulo().toLowerCase().contains(texto.toLowerCase())) {
                librosFiltrados.add(libro);
            }
        }

        tableModel.setLibros(librosFiltrados);
    }

    private void mostrarDialogoAgregarLibro() {
        JDialog dialogo = new JDialog((Frame) SwingUtilities.getWindowAncestor(this), "Agregar Libro", true);
        dialogo.setLayout(new GridLayout(0, 2, 5, 5));

        JTextField txtTitulo = new JTextField();
        JTextField txtAutor = new JTextField();

        dialogo.add(new JLabel("Título:"));
        dialogo.add(txtTitulo);
        dialogo.add(new JLabel("Autor:"));
        dialogo.add(txtAutor);

        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.addActionListener(e -> {
            if (txtTitulo.getText().isEmpty() || txtAutor.getText().isEmpty()) {
                JOptionPane.showMessageDialog(dialogo, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            if (controller.agregarLibro(txtTitulo.getText(), txtAutor.getText())) {
                JOptionPane.showMessageDialog(dialogo, "Libro agregado correctamente");
                cargarLibros();
                dialogo.dispose();
            } else {
                JOptionPane.showMessageDialog(dialogo, "Error al agregar el libro", "Error", JOptionPane.ERROR_MESSAGE);
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

    private void editarLibroSeleccionado() {
        int filaSeleccionada = tablaLibros.getSelectedRow();
        if (filaSeleccionada >= 0) {
            Libro libro = tableModel.getLibroEn(filaSeleccionada);

            JDialog dialogo = new JDialog((Frame) SwingUtilities.getWindowAncestor(this), "Editar Libro", true);
            dialogo.setLayout(new GridLayout(0, 2, 5, 5));

            JTextField txtTitulo = new JTextField(libro.getTitulo());
            JTextField txtAutor = new JTextField(libro.getAutor());

            dialogo.add(new JLabel("Título:"));
            dialogo.add(txtTitulo);
            dialogo.add(new JLabel("Autor:"));
            dialogo.add(txtAutor);

            JButton btnGuardar = new JButton("Guardar");
            btnGuardar.addActionListener(e -> {
                if (txtTitulo.getText().isEmpty() || txtAutor.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(dialogo, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                libro.setTitulo(txtTitulo.getText());
                libro.setAutor(txtAutor.getText());

                if (controller.actualizarLibro(libro)) {
                    JOptionPane.showMessageDialog(dialogo, "Libro actualizado correctamente");
                    cargarLibros();
                    dialogo.dispose();
                } else {
                    JOptionPane.showMessageDialog(dialogo, "Error al actualizar el libro", "Error", JOptionPane.ERROR_MESSAGE);
                }
            });

            JButton btnCancelar = new JButton("Cancelar");
            btnCancelar.addActionListener(e -> dialogo.dispose());

            dialogo.add(btnGuardar);
            dialogo.add(btnCancelar);

            dialogo.pack();
            dialogo.setLocationRelativeTo(this);
            dialogo.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un libro de la tabla", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void eliminarLibroSeleccionado() {
        int filaSeleccionada = tablaLibros.getSelectedRow();
        if (filaSeleccionada >= 0) {
            int confirmacion = JOptionPane.showConfirmDialog(
                    this,
                    "¿Está seguro que desea eliminar este libro?",
                    "Confirmar eliminación",
                    JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                int idLibro = tableModel.getLibroEn(filaSeleccionada).getIdLibro();
                if (controller.eliminarLibro(idLibro)) {
                    JOptionPane.showMessageDialog(this, "Libro eliminado correctamente");
                    cargarLibros();
                } else {
                    JOptionPane.showMessageDialog(this, "Error al eliminar el libro", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un libro de la tabla", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    private class LibroTableModel extends AbstractTableModel {
        private List<Libro> libros = new ArrayList<>();
        private final String[] columnNames = {"ID", "Título", "Autor", "Disponible"};

        public void setLibros(List<Libro> libros) {
            this.libros = libros;
            fireTableDataChanged();
        }

        public Libro getLibroEn(int rowIndex) {
            return libros.get(rowIndex);
        }

        @Override
        public int getRowCount() {
            return libros.size();
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
            Libro libro = libros.get(rowIndex);
            switch (columnIndex) {
                case 0: return libro.getIdLibro();
                case 1: return libro.getTitulo();
                case 2: return libro.getAutor();
                case 3: return libro.isDisponible() ? "Sí" : "No";
                default: return null;
            }
        }
    }
}