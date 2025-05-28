import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EntrenadorDAOImpl implements EntrenadorDAO {
    private Connection conexion;

    public EntrenadorDAOImpl(Connection conexion) {
        this.conexion = conexion;
    }

    @Override
    public void insertar(Entrenador entrenador) {
        String sql = "INSERT INTO entrenadores (id, nombre, region, experiencia) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, entrenador.getId());
            stmt.setString(2, entrenador.getNombre());
            stmt.setString(3, entrenador.getRegion());
            stmt.setInt(4, entrenador.getExperiencia());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void actualizar(Entrenador entrenador) {
        String sql = "UPDATE entrenadores SET nombre=?, region=?, experiencia=? WHERE id=?";
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
    public void eliminar(int id) {
        String sql = "DELETE FROM entrenadores WHERE id=?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Entrenador> obtenerTodos() {
        List<Entrenador> lista = new ArrayList<>();
        String sql = "SELECT * FROM entrenadores";
        try (Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Entrenador e = new Entrenador(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("region"),
                        rs.getInt("experiencia")
                );
                lista.add(e);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    @Override
    public Entrenador obtenerPorId(int id) {
        String sql = "SELECT * FROM entrenadores WHERE id=?";
        try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Entrenador(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("region"),
                        rs.getInt("experiencia")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
