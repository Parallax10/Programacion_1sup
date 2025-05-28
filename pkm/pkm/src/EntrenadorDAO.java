import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EntrenadorDAO implements EntrenadorDAOInterface {
    private Connection conexion;

    public EntrenadorDAO(Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public void agregarEntrenador(Entrenador entrenador) {
        String sql = "INSERT INTO entrenador (nombre, region, experiencia) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, entrenador.getNombre());
            stmt.setString(2, entrenador.getRegion());
            stmt.setInt(3, entrenador.getExperiencia());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Entrenador> obtenerEntrenadores() {
        List<Entrenador> entrenadores = new ArrayList<>();
        String sql = "SELECT * FROM entrenador";
        try (Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Entrenador e = new Entrenador(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("region"),
                        rs.getInt("experiencia")
                );
                entrenadores.add(e);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return entrenadores;
    }

    @Override
    public void actualizarEntrenador(Entrenador entrenador) {
        String sql = "UPDATE entrenador SET nombre = ?, region = ?, experiencia = ? WHERE id = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setString(1, entrenador.getNombre());
            stmt.setString(2, entrenador.getRegion());
            stmt.setInt(3, entrenador.getExperiencia());
            stmt.setInt(4, entrenador.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void eliminarEntrenador(int id) {
        String sql = "DELETE FROM entrenador WHERE id = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Entrenador buscarEntrenadorPorId(int id) {
        String sql = "SELECT * FROM entrenador WHERE id = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Entrenador(
                            rs.getInt("id"),
                            rs.getString("nombre"),
                            rs.getString("region"),
                            rs.getInt("experiencia")
                    );
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
