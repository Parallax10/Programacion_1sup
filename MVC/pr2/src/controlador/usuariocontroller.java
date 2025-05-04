package controlador;
import modelo.Usuario;
import bdd.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
class UsuarioController {
    // Agrega un nuevo usuario a la base de datos
    public void agregarUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuarios (nombre, email) VALUES (?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, usuario.getNombre());
            stmt.setString(2, usuario.getEmail());
            stmt.executeUpdate();//añadir usuarios
            System.out.println("Usuario agregado: " + usuario.getNombre());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        String sql = "SELECT id, nombre, email FROM usuarios";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {//lista los usuarios
                Usuario u = new Usuario(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("email")
                );
                usuarios.add(u);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }
    public void eliminarUsuario(int idUsuario) {
        String sql = "DELETE FROM usuarios WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, idUsuario);
            stmt.executeUpdate();//eliminar usaurios
            System.out.println("Usuario eliminado (ID=" + idUsuario + ")");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
