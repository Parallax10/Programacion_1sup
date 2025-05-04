package controladores;
import modelo.Prestamo;
import bdd.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Prestamocontrolador {
    public void registrarPrestamo(int idLibro, int idUsuario) {
        String sql = "INSERT INTO prestamos (id_libro, id_usuario, fecha_prestamo) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idLibro);
            stmt.setInt(2, idUsuario);
            stmt.setDate(3, new java.sql.Date(new Date().getTime()));
            stmt.executeUpdate();//nuevo prestamo
            System.out.println("Préstamo registrado (libro=" + idLibro + ", usuario=" +
                    idUsuario + ")");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void registrarDevolucion(int idPrestamo) {
        String sql = "UPDATE prestamos SET fecha_devolucion = ? WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDate(1, new java.sql.Date(new Date().getTime()));
            stmt.setInt(2, idPrestamo);
            stmt.executeUpdate();//cuando se ha devuelto
            System.out.println("Préstamo devuelto (ID=" + idPrestamo + ")");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // Obtiene la lista de préstamos activos (sin devolución)
    public List<Prestamo> listarPrestamosActivos() {
        List<Prestamo> prestamos = new ArrayList<>();
        String sql = "SELECT id, id_libro, id_usuario, fecha_prestamo FROM prestamos WHERE fecha_devolucion IS NULL";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Prestamo p = new Prestamo();
                p.setId(rs.getInt("id"));
                p.setIdLibro(rs.getInt("id_libro"));
                p.setIdUsuario(rs.getInt("id_usuario"));
                p.setFechaPrestamo(rs.getDate("fecha_prestamo"));
                prestamos.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return prestamos;
    }
}
