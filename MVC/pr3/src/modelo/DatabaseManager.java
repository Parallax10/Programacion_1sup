package modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {
    private static final String URL = "jdbc:mysql://localhost:3306/biblioteca";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private Connection connection;

    public DatabaseManager() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
// funciones  libro
    public void insertarLibro(Libro libro) throws SQLException {
        String query = "INSERT INTO libros (titulo, autor, isbn) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, libro.getTitulo());
            stmt.setString(2, libro.getAutor());
            stmt.setString(3, libro.getIsbn());
            stmt.executeUpdate();
        }
    }

    public void eliminarLibro(int libroId) throws SQLException {
        String query = "DELETE FROM libros WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, libroId);
            stmt.executeUpdate();
        }
    }

    public List<Libro> obtenerLibros() throws SQLException {
        List<Libro> libros = new ArrayList<>();
        String query = "SELECT * FROM libros";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Libro libro = new Libro(
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        rs.getString("autor"),
                        rs.getString("isbn")
                );
                libros.add(libro);
            }
        }
        return libros;
    }
// funciones usuario
    public void insertarUsuario(Usuario usuario) throws SQLException {
        String query = "INSERT INTO usuarios (nombre, email) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, usuario.getNombre());
            stmt.setString(2, usuario.getEmail());
            stmt.executeUpdate();
        }
    }

    public void eliminarUsuario(int usuarioId) throws SQLException {
        String query = "DELETE FROM usuarios WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, usuarioId);
            stmt.executeUpdate();
        }
    }

    public List<Usuario> obtenerUsuarios() throws SQLException {
        List<Usuario> usuarios = new ArrayList<>();
        String query = "SELECT * FROM usuarios";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Usuario usuario = new Usuario(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("email")
                );
                usuarios.add(usuario);
            }
        }
        return usuarios;
    }
//funciones prestamo
    public void insertarPrestamo(Prestamo prestamo) throws SQLException {
        String sql = "INSERT INTO prestamos (libro_id, usuario_id, fecha_prestamo, fecha_devolucion) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, prestamo.getLibroId());
            stmt.setInt(2, prestamo.getUsuarioId());

            Date fechaPrestamo = new Date(prestamo.getFechaPrestamo().getTime());
            Date fechaDevolucion = new Date(prestamo.getFechaDevolucion().getTime());

            stmt.setDate(3, fechaPrestamo);
            stmt.setDate(4, fechaDevolucion);

            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al insertar préstamo: " + e.getMessage());
            throw e;
        }
    }




    public void eliminarPrestamo(int prestamoId) throws SQLException {
        String query = "DELETE FROM prestamos WHERE id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, prestamoId);
            stmt.executeUpdate();
        }
    }

    public List<Prestamo> obtenerPrestamos() throws SQLException {
        List<Prestamo> prestamos = new ArrayList<>();
        String query = "SELECT * FROM prestamos";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Prestamo prestamo = new Prestamo(
                        rs.getInt("id"),
                        rs.getInt("libro_id"),
                        rs.getInt("usuario_id"),
                        rs.getDate("fecha_prestamo"),
                        rs.getDate("fecha_devolucion")
                );
                prestamos.add(prestamo);
            }
        }
        return prestamos;
    }

    public Connection getConnection() {
        return connection;
    }
}
