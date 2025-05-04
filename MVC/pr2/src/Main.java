package view;
import controller.Prestamocontrolador;
import controller.controladorlibro;
import controller.UsuarioController;
import model.Usuario;
import model.Libro;
import model.Prestamo;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;
public class Vista extends JFrame {
    private controladorlibro libroController = new controladorlibro();
    private UsuarioController usuarioController = new UsuarioController();
    private Prestamocontrolador prestamoController = new Prestamocontrolador();
    private JTable tablaLibros = new JTable();
    private JTable tablaUsuarios = new JTable();
    private JTable tablaPrestamos = new JTable();
    public Vista() {
        setTitle("Sistema de Biblioteca");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 600);
        JTabbedPane tabs = new JTabbedPane();
        JPanel panelLibros = new JPanel(new BorderLayout());
        panelLibros.add(new JScrollPane(tablaLibros), BorderLayout.CENTER);
        JButton btnEliminarLibro = new JButton("Eliminar Libro");
        panelLibros.add(btnEliminarLibro, BorderLayout.SOUTH);
        tabs.addTab("Libros", panelLibros);
        btnEliminarLibro.addActionListener(e -> {
            int fila = tablaLibros.getSelectedRow();
            if (fila != -1) {//eliminar libro
                int idLibro = (int) tablaLibros.getValueAt(fila, 0);
                libroController.eliminarLibro(idLibro);
                actualizarTablaLibros();
            }
        });
        JPanel panelUsuarios = new JPanel(new BorderLayout());
        panelUsuarios.add(new JScrollPane(tablaUsuarios), BorderLayout.CENTER);
        JPanel usuarioButtons = new JPanel();
        JButton btnAgregarUsuario = new JButton("Agregar Usuario");
        JButton btnEliminarUsuario = new JButton("Eliminar Usuario");
        usuarioButtons.add(btnAgregarUsuario);
        usuarioButtons.add(btnEliminarUsuario);
        panelUsuarios.add(usuarioButtons, BorderLayout.SOUTH);
        tabs.addTab("Usuarios", panelUsuarios);
        btnAgregarUsuario.addActionListener(e -> {
            String nombre = JOptionPane.showInputDialog(this, "Nombre del usuario:");
            String email = JOptionPane.showInputDialog(this, "Email del usuario:");
            if (nombre != null && email != null) {//para agregar usuarios
                usuarioController.agregarUsuario(new Usuario(nombre, email));
                actualizarTablaUsuarios();
            }
        });
        btnEliminarUsuario.addActionListener(e -> {
            int fila = tablaUsuarios.getSelectedRow();
            if (fila != -1) {//para eliminar usuarios
                int idUsuario = (int) tablaUsuarios.getValueAt(fila, 0);
                usuarioController.eliminarUsuario(idUsuario);
                actualizarTablaUsuarios();
            }
        });
        JPanel panelPrestamos = new JPanel(new BorderLayout());
        panelPrestamos.add(new JScrollPane(tablaPrestamos), BorderLayout.CENTER);
        JPanel prestamoButtons = new JPanel();
        JButton btnPrestarLibro = new JButton("Prestar Libro");
        JButton btnDevolverLibro = new JButton("Devolver Libro");
        prestamoButtons.add(btnPrestarLibro);
        prestamoButtons.add(btnDevolverLibro);
        panelPrestamos.add(prestamoButtons, BorderLayout.SOUTH);
        tabs.addTab("Préstamos", panelPrestamos);
        btnPrestarLibro.addActionListener(e -> {
            String idLibroStr = JOptionPane.showInputDialog(this, "ID del libro:");
            String idUsuarioStr = JOptionPane.showInputDialog(this, "ID del usuario:");
            if (idLibroStr != null && idUsuarioStr != null) {//Para marcar que se a prestado                un libro
                int idLibro = Integer.parseInt(idLibroStr);
                int idUsuario = Integer.parseInt(idUsuarioStr);
                prestamoController.registrarPrestamo(idLibro, idUsuario);
                actualizarTablaPrestamos();
            }
        });
        btnDevolverLibro.addActionListener(e -> {
            int fila = tablaPrestamos.getSelectedRow();
            if (fila != -1) {//para marcar que se ha devuelto un libro
                int idPrestamo = (int) tablaPrestamos.getValueAt(fila, 0);
                prestamoController.registrarDevolucion(idPrestamo);
                actualizarTablaPrestamos();
            }
        });
        add(tabs);
        actualizarTablaLibros();
        actualizarTablaUsuarios();
        actualizarTablaPrestamos();
    }
    private void actualizarTablaLibros() {
        List<Libro> libros = libroController.listarLibros();
        DefaultTableModel model = new DefaultTableModel(new Object[]{"ID", "Título",
                "Autor"}, 0);
        for (Libro lib : libros) {
            model.addRow(new Object[]{lib.getId(), lib.getTitulo(), lib.getAutor()});
        }
        tablaLibros.setModel(model);
    }
    private void actualizarTablaUsuarios() {
        List<Usuario> usuarios = usuarioController.listarUsuarios();
        DefaultTableModel model = new DefaultTableModel(new Object[]{"ID", "Nombre",
                "Email"}, 0);
        for (Usuario u : usuarios) {
            model.addRow(new Object[]{u.getId(), u.getNombre(), u.getEmail()});
        }
        tablaUsuarios.setModel(model);
    }
    private void actualizarTablaPrestamos() {
        List<Prestamo> prestamos = prestamoController.listarPrestamosActivos();
        DefaultTableModel model = new DefaultTableModel(new Object[]{"ID", "Libro ID",
                "Usuario ID", "Fecha Préstamo"}, 0);
        for (Prestamo p : prestamos) {
            model.addRow(new Object[]{
                    p.getId(),
                    p.getIdLibro(),
                    p.getIdUsuario(),
                    p.getFechaPrestamo()
            });
        }
        tablaPrestamos.setModel(model);
    }
}