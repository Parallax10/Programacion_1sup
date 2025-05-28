import java.sql.*;
import java.util.ArrayList;

public class PokemonDAO {
    private static final String URL = "jdbc:mariadb://localhost:3306/pokemon_db";
    private static final String USER = "tu_usuario";
    private static final String PASSWORD = "tu_contraseña";

    public void insertarPokemon(Pokemon p) {
        String sql = "INSERT INTO pokemon (id, nombre, nivel, hp, ataque, defensa, velocidad, tipo, " +
                "temp_corporal, resistencia_calor, habilidad_nado, tiempo_bajo_agua, voltaje, capacidad_carga) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, p.getId());
            ps.setString(2, p.getNombre());
            ps.setInt(3, p.getNivel());
            ps.setInt(4, p.getHp());
            ps.setInt(5, p.getAtaque());
            ps.setInt(6, p.getDefensa());
            ps.setInt(7, p.getVelocidad());
            ps.setString(8, p.getTipo());

            switch (p.getTipo()) {
                case "Fuego" -> {
                    PokemonFuego pf = (PokemonFuego) p;
                    ps.setDouble(9, pf.getTempCorporal());
                    ps.setDouble(10, pf.getResistenciaCalor());
                    ps.setNull(11, Types.VARCHAR);
                    ps.setNull(12, Types.DOUBLE);
                    ps.setNull(13, Types.DOUBLE);
                    ps.setNull(14, Types.DOUBLE);
                }
                case "Agua" -> {
                    PokemonAgua pa = (PokemonAgua) p;
                    ps.setNull(9, Types.DOUBLE);
                    ps.setNull(10, Types.DOUBLE);
                    ps.setString(11, pa.getHabilidadNado());
                    ps.setDouble(12, pa.getTiempoBajoAgua());
                    ps.setNull(13, Types.DOUBLE);
                    ps.setNull(14, Types.DOUBLE);
                }
                case "Electrico" -> {
                    PokemonElectrico pe = (PokemonElectrico) p;
                    ps.setNull(9, Types.DOUBLE);
                    ps.setNull(10, Types.DOUBLE);
                    ps.setNull(11, Types.VARCHAR);
                    ps.setNull(12, Types.DOUBLE);
                    ps.setDouble(13, pe.getVoltaje());
                    ps.setDouble(14, pe.getCapacidadCarga());
                }
            }

            ps.executeUpdate();
            System.out.println("Pokémon insertado con éxito en la base de datos.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Pokemon> listarPokemones() {
        ArrayList<Pokemon> lista = new ArrayList<>();
        String sql = "SELECT * FROM pokemon";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                String tipo = rs.getString("tipo");
                Pokemon p = null;

                switch (tipo) {
                    case "Fuego" -> p = new PokemonFuego(
                            rs.getInt("id"), rs.getString("nombre"), rs.getInt("nivel"), rs.getInt("hp"),
                            rs.getInt("ataque"), rs.getInt("defensa"), rs.getInt("velocidad"),
                            rs.getDouble("temp_corporal"), rs.getDouble("resistencia_calor"),rs.getString("tipo"));
                    case "Agua" -> p = new PokemonAgua(
                            rs.getInt("id"), rs.getString("nombre"), rs.getInt("nivel"), rs.getInt("hp"),
                            rs.getInt("ataque"), rs.getInt("defensa"), rs.getInt("velocidad"),
                            rs.getString("habilidad_nado"), rs.getDouble("tiempo_bajo_agua"),rs.getString("tipo"));
                    case "Electrico" -> p = new PokemonElectrico(
                            rs.getInt("id"), rs.getString("nombre"), rs.getInt("nivel"), rs.getInt("hp"),
                            rs.getInt("ataque"), rs.getInt("defensa"), rs.getInt("velocidad"),
                            rs.getDouble("voltaje"), rs.getDouble("capacidad_carga"),rs.getString("tipo"));
                }

                if (p != null) lista.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }
}
