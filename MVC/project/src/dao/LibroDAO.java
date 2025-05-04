package dao;

import model.Libro;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LibroDAO {
    private Connection conexion;

    public LibroDAO() {
        conexion = ConexionBD.obtenerConexion();
    }

    public boolean insertarLibro(Libro libro) {
        String sql = "INSERT INTO libros (titulo, autor, disponible) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, libro.getTitulo());
            stmt.setString(2, libro.getAutor());
            stmt.setBoolean(3, libro.isDisponible());

            int filasAfectadas = stmt.executeUpdate();

            if (filasAfectadas > 0) {
                try (ResultSet rs = stmt.getGeneratedKeys()) {
                    if (rs.next()) {
                        libro.setIdLibro(rs.getInt(1));
                    }
                }
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public List<Libro> obtenerTodosLibros() {
        List<Libro> libros = new ArrayList<>();
        String sql = "SELECT * FROM libros ORDER BY titulo";

        try (Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                libros.add(new Libro(
                        rs.getInt("id_libro"),
                        rs.getString("titulo"),
                        rs.getString("autor"),
                        rs.getBoolean("disponible")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return libros;
    }

    public Libro buscarLibroPorId(int id) {
        String sql = "SELECT * FROM libros WHERE id_libro = ?";

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Libro(
                        rs.getInt("id_libro"),
                        rs.getString("titulo"),
                        rs.getString("autor"),
                        rs.getBoolean("disponible")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean actualizarLibro(Libro libro) {
        String sql = "UPDATE libros SET titulo = ?, autor = ?, disponible = ? WHERE id_libro = ?";

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, libro.getTitulo());
            stmt.setString(2, libro.getAutor());
            stmt.setBoolean(3, libro.isDisponible());
            stmt.setInt(4, libro.getIdLibro());

            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean eliminarLibro(int id) {
        String sql = "DELETE FROM libros WHERE id_libro = ?";

        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Libro> buscarLibrosDisponibles() {
        List<Libro> libros = new ArrayList<>();
        String sql = "SELECT * FROM libros WHERE disponible = TRUE ORDER BY titulo";

        try (Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                libros.add(new Libro(
                        rs.getInt("id_libro"),
                        rs.getString("titulo"),
                        rs.getString("autor"),
                        true
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return libros;
    }
}