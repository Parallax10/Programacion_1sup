package controladores;
import model.Libro;
import util.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class controladorlibro {
    public void agregarLibro(Libro libro) {
        String sql = "INSERT INTO libros (titulo, autor, isbn, disponible) VALUES (?, ?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, libro.getTitulo());
            stmt.setString(2, libro.getAutor());//para meter cada dato
            stmt.setString(3, libro.getIsbn());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<Libro> listarLibros() {
        List<Libro> libros = new ArrayList<>();
        String sql = "SELECT * FROM libros";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                libros.add(new Libro(//para mostra todos lso libros
                        rs.getInt("id"),
                        rs.getString("titulo"),
                        rs.getString("autor"),
                        rs.getString("isbn")
                        ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return libros;
    }
    public void eliminarLibro(int id) {
        String sql = "DELETE FROM libros WHERE id=?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();//para eliminar algun libro
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
