package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

public class VistaBiblioteca extends JFrame {
    private JButton btnAgregarLibro, btnEliminarLibro, btnAgregarUsuario, btnEliminarUsuario, btnPrestamo, btnDevolucion;
    private JTable tableLibros, tableUsuarios, tablePrestamos;
    private DefaultTableModel modelLibros, modelUsuarios, modelPrestamos;
    private JScrollPane scrollLibros, scrollUsuarios, scrollPrestamos;

    public VistaBiblioteca() {
        setTitle("Biblioteca Universitaria");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        // panel superior
        JTextArea areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        add(new JScrollPane(areaTexto), BorderLayout.NORTH);

        //botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(3, 2));
        btnAgregarLibro = new JButton("Agregar Libro");
        btnEliminarLibro = new JButton("Eliminar Libro");
        btnAgregarUsuario = new JButton("Agregar Usuario");
        btnEliminarUsuario = new JButton("Eliminar Usuario");
        btnPrestamo = new JButton("Realizar Préstamo");
        btnDevolucion = new JButton("Realizar Devolución");

        panelBotones.add(btnAgregarLibro);
        panelBotones.add(btnEliminarLibro);
        panelBotones.add(btnAgregarUsuario);
        panelBotones.add(btnEliminarUsuario);
        panelBotones.add(btnPrestamo);
        panelBotones.add(btnDevolucion);
        add(panelBotones, BorderLayout.SOUTH);

        //tablas para mostrar los datos existentes
        modelLibros = new DefaultTableModel(new Object[]{"ID", "Título", "Autor", "ISBN"}, 0);
        tableLibros = new JTable(modelLibros);
        scrollLibros = new JScrollPane(tableLibros);

        modelUsuarios = new DefaultTableModel(new Object[]{"ID", "Nombre", "Email"}, 0);
        tableUsuarios = new JTable(modelUsuarios);
        scrollUsuarios = new JScrollPane(tableUsuarios);

        modelPrestamos = new DefaultTableModel(new Object[]{"ID", "Libro ID", "Usuario ID", "Fecha Prestamo", "Fecha Devolución"}, 0);
        tablePrestamos = new JTable(modelPrestamos);
        scrollPrestamos = new JScrollPane(tablePrestamos);

        JPanel panelCentro = new JPanel();
        panelCentro.setLayout(new GridLayout(3, 1));
        panelCentro.add(scrollLibros);
        panelCentro.add(scrollUsuarios);
        panelCentro.add(scrollPrestamos);
        add(panelCentro, BorderLayout.CENTER);
    }
    //actuadores para los botones
    public void agregarListener(ActionListener listener) {
        btnAgregarLibro.addActionListener(listener);
        btnEliminarLibro.addActionListener(listener);
        btnAgregarUsuario.addActionListener(listener);
        btnEliminarUsuario.addActionListener(listener);
        btnPrestamo.addActionListener(listener);
        btnDevolucion.addActionListener(listener);
    }
    //mostrar valores de los objetos en la base de datos
    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    public void mostrarLibros(java.util.List<modelo.Libro> libros) {
        modelLibros.setRowCount(0);
        for (modelo.Libro libro : libros) {
            modelLibros.addRow(new Object[]{libro.getId(), libro.getTitulo(), libro.getAutor(), libro.getIsbn()});
        }
    }

    public void mostrarUsuarios(java.util.List<modelo.Usuario> usuarios) {
        modelUsuarios.setRowCount(0);
        for (modelo.Usuario usuario : usuarios) {
            modelUsuarios.addRow(new Object[]{usuario.getId(), usuario.getNombre(), usuario.getEmail()});
        }
    }

    public void mostrarPrestamos(java.util.List<modelo.Prestamo> prestamos) {
        modelPrestamos.setRowCount(0);
        for (modelo.Prestamo prestamo : prestamos) {
            modelPrestamos.addRow(new Object[]{
                    prestamo.getId(),
                    prestamo.getLibroId(),
                    prestamo.getUsuarioId(),
                    prestamo.getFechaPrestamo(),
                    prestamo.getFechaDevolucion()
            });
        }
    }

    public JButton getBtnAgregarLibro() { return btnAgregarLibro; }
    public JButton getBtnEliminarLibro() { return btnEliminarLibro; }
    public JButton getBtnAgregarUsuario() { return btnAgregarUsuario; }
    public JButton getBtnEliminarUsuario() { return btnEliminarUsuario; }
    public JButton getBtnPrestamo() { return btnPrestamo; }
    public JButton getBtnDevolucion() { return btnDevolucion; }
}
