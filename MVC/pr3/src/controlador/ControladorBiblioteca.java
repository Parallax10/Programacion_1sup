package controlador;

import vista.VistaBiblioteca;
import modelo.DatabaseManager;
import modelo.Libro;
import modelo.Usuario;
import modelo.Prestamo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ControladorBiblioteca implements ActionListener {
    private VistaBiblioteca vista;
    private DatabaseManager dbManager;

    public ControladorBiblioteca(VistaBiblioteca vista, DatabaseManager dbManager) {
        this.vista = vista;
        this.dbManager = dbManager;
        this.vista.agregarListener(this);
        cargarDatos();
    }
//pulsar cualquier boton y depende del boton llama a una funcion o a otra
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if (source == vista.getBtnAgregarLibro()) {
            agregarLibro();
        } else if (source == vista.getBtnEliminarLibro()) {
            eliminarLibro();
        } else if (source == vista.getBtnAgregarUsuario()) {
            agregarUsuario();
        } else if (source == vista.getBtnEliminarUsuario()) {
            eliminarUsuario();
        } else if (source == vista.getBtnPrestamo()) {
            realizarPrestamo();
        } else if (source == vista.getBtnDevolucion()) {
            eliminarPrestamo();
        }
    }
//funcion para interfaz agregar libro
    private void agregarLibro() {
        JTextField titulo = new JTextField();
        JTextField autor = new JTextField();
        JTextField isbn = new JTextField();

        Object[] campos = {
                "Título:", titulo,
                "Autor:", autor,
                "ISBN:", isbn
        };

        int opcion = JOptionPane.showConfirmDialog(vista, campos, "Agregar Libro", JOptionPane.OK_CANCEL_OPTION);
        if (opcion == JOptionPane.OK_OPTION) {
            try {
                Libro libro = new Libro(0, titulo.getText(), autor.getText(), isbn.getText());
                dbManager.insertarLibro(libro);
                cargarDatos();
            } catch (SQLException ex) {
                mostrarError("Error al agregar libro: " + ex.getMessage());
            }
        }
    }
    //funcion para interfaz eliminar libro
    private void eliminarLibro() {
        String input = JOptionPane.showInputDialog(vista, "Ingrese el ID del libro a eliminar:");
        if (input != null) {
            try {
                int id = Integer.parseInt(input);
                dbManager.eliminarLibro(id);
                cargarDatos();
            } catch (Exception ex) {
                mostrarError("Error al eliminar libro: " + ex.getMessage());
            }
        }
    }
    //funcion para interfaz agregar usuario
    private void agregarUsuario() {
        JTextField nombre = new JTextField();
        JTextField email = new JTextField();

        Object[] campos = {
                "Nombre:", nombre,
                "Email:", email
        };

        int opcion = JOptionPane.showConfirmDialog(vista, campos, "Agregar Usuario", JOptionPane.OK_CANCEL_OPTION);
        if (opcion == JOptionPane.OK_OPTION) {
            try {
                Usuario usuario = new Usuario(0, nombre.getText(), email.getText());
                dbManager.insertarUsuario(usuario);
                cargarDatos();
            } catch (SQLException ex) {
                mostrarError("Error al agregar usuario: " + ex.getMessage());
            }
        }
    }
    //funcion para interfaz eliminar usuario
    private void eliminarUsuario() {
        String input = JOptionPane.showInputDialog(vista, "Ingrese el ID del usuario a eliminar:");
        if (input != null) {
            try {
                int id = Integer.parseInt(input);
                dbManager.eliminarUsuario(id);
                cargarDatos();
            } catch (Exception ex) {
                mostrarError("Error al eliminar usuario: " + ex.getMessage());
            }
        }
    }
    //funcion para interfaz realizar prestamo
    private void realizarPrestamo() {
        try {
            String libroIdStr = JOptionPane.showInputDialog(vista, "ID del Libro:");
            String usuarioIdStr = JOptionPane.showInputDialog(vista, "ID del Usuario:");
            String fechaPrestamoStr = JOptionPane.showInputDialog(vista, "Fecha de préstamo (YYYY-MM-DD):");
            String fechaDevolucionStr = JOptionPane.showInputDialog(vista, "Fecha de devolución (YYYY-MM-DD):");

            int libroId = Integer.parseInt(libroIdStr);
            int usuarioId = Integer.parseInt(usuarioIdStr);
            Date fechaPrestamoUtil = new SimpleDateFormat("yyyy-MM-dd").parse(fechaPrestamoStr);
            Date fechaDevolucionUtil = new SimpleDateFormat("yyyy-MM-dd").parse(fechaDevolucionStr);

            Prestamo prestamo = new Prestamo(0, libroId, usuarioId, fechaPrestamoUtil, fechaDevolucionUtil);
            dbManager.insertarPrestamo(prestamo);
            cargarDatos();
        } catch (Exception ex) {
            mostrarError("Error al realizar préstamo: " + ex.getMessage());
        }
    }
    //funcion para interfaz devolver prestamo
    private void eliminarPrestamo() {
        String input = JOptionPane.showInputDialog(vista, "Ingrese el ID del préstamo a eliminar:");
        if (input != null) {
            try {
                int id = Integer.parseInt(input);
                dbManager.eliminarPrestamo(id);
                cargarDatos();
            } catch (Exception ex) {
                mostrarError("Error al eliminar préstamo: " + ex.getMessage());
            }
        }
    }
    //funcion para cargar los datos y que aparezcan en la interfaz cada vez que se modifique algo
    public void cargarDatos() {
        try {
            List<Libro> libros = dbManager.obtenerLibros();
            List<Usuario> usuarios = dbManager.obtenerUsuarios();
            List<Prestamo> prestamos = dbManager.obtenerPrestamos();
            vista.mostrarLibros(libros);
            vista.mostrarUsuarios(usuarios);
            vista.mostrarPrestamos(prestamos);
        } catch (SQLException ex) {
            mostrarError("Error al cargar datos: " + ex.getMessage());
        }
    }
// mostrar errores
    private void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(vista, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
}
