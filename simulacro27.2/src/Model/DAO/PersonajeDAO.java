package Model.DAO;

import Model.DatabaseConnection;
import Model.Personaje;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonajeDAO {
    public void guardarPersonaje(Connection conn, Personaje personaje) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("INSERT INTO personaje (nombre,vida,dano,tipo)VALUES (?,?,?,?)");
        ps.setString(1, personaje.getNombre());
        ps.setInt(2, personaje.getVida());
        ps.setInt(3,personaje.getDaño());
        ps.setString(4, personaje.getTipo());
        ps.executeUpdate();
        ps.close();
    }
    public void vaerPersonaje(Connection conn, Personaje personaje) throws SQLException {
        String query = "accion * FROM tabla WHERE valor1= ?";
        try (Connection conn1 = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn1.prepareStatement(query)) {
            stmt.setString(1, personaje.getNombre());

            ResultSet rs = stmt.executeQuery();
            // Aquí puedes procesar los resultados, por ejemplo:
            while (rs.next()) {
                // String dato = rs.getString("nombre_columna");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
