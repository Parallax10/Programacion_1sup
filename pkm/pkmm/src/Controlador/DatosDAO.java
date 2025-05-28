package Controlador;

import java.sql.*;
import java.util.ArrayList;
import Modelo.Pokemon;

public class DatosDAO {

    // consulta nombres de entrenadores
    public static ArrayList<String> getEntrenadores() {
        ArrayList<String> lista = new ArrayList<>();
        String query = "SELECT nombre FROM entrenador";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(query);
             ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                lista.add(rs.getString("nombre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    // consulta para obtener el pokemon segun el entrenador
    public static ArrayList<String> getPokemonsPorEntrenador(String nombreEntrenador) {
        ArrayList<String> lista = new ArrayList<>();
        String query = """
            SELECT p.nombre 
            FROM pokemon p
            JOIN entrenador_pokemon ep ON p.id = ep.pokemon_id
            JOIN entrenador e ON ep.entrenador_id = e.id
            WHERE e.nombre = ?
        """;

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, nombreEntrenador);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                lista.add(rs.getString("nombre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    //obtener un Pokemon  por nombre de entrenador y pokemon
    public static Pokemon getPokemonPorNombre(String nombreEntrenador, String nombrePokemon) {
        String query = """
            SELECT p.id, p.nombre, p.ataque, p.defensa, p.niveles, p.velocidad, p.vida, p.tipo
            FROM pokemon p
            JOIN entrenador_pokemon ep ON p.id = ep.pokemon_id
            JOIN entrenador e ON ep.entrenador_id = e.id
            WHERE e.nombre = ? AND p.nombre = ?
        """;

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, nombreEntrenador);
            pst.setString(2, nombrePokemon);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                Pokemon pokemon = new Pokemon();
                pokemon.setId(rs.getInt("id"));
                pokemon.setNombre(rs.getString("nombre"));
                pokemon.setAtaque(rs.getInt("ataque"));
                pokemon.setDefensa(rs.getInt("defensa"));
                pokemon.setNiveles(rs.getInt("niveles"));
                pokemon.setVelocidad(rs.getInt("velocidad"));
                pokemon.setVida(rs.getInt("vida"));
                pokemon.setTipo(rs.getString("tipo"));
                return pokemon;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    //devuelve entrenadores con sus pokemons (nombre, región, xp, pokemon, tipo)
    public static ResultSet getEntrenadoresConPokemons() throws SQLException {
        Connection con = DatabaseConnection.getConnection();
        String query = """
            SELECT e.nombre AS entrenador, e.region, e.xp, 
                   p.nombre AS pokemon, p.tipo
            FROM entrenador e
            JOIN entrenador_pokemon ep ON e.id = ep.entrenador_id
            JOIN pokemon p ON ep.pokemon_id = p.id
        """;
        PreparedStatement pst = con.prepareStatement(query);
        return pst.executeQuery();
    }

    //obtener todos los pokemons (todas sus columnas)
    public static ResultSet getTodosLosPokemons() throws SQLException {
        Connection con = DatabaseConnection.getConnection();
        String query = "SELECT * FROM pokemon";
        PreparedStatement pst = con.prepareStatement(query);
        return pst.executeQuery();
    }
}
