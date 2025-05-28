package Vista;

import Controlador.DatosDAO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ListaEntrenadores extends JFrame {

    public ListaEntrenadores() {
        setTitle("Lista de Entrenadores");
        setSize(800, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        String[] columnas = {"Entrenador", "Región", "XP", "pokemon", "Tipo"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        JTable tabla = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabla);

        try {
            ResultSet rs = DatosDAO.getEntrenadoresConPokemons();
            while (rs.next()) {
                Object[] fila = {
                        rs.getString("entrenador"),
                        rs.getString("region"),
                        rs.getInt("xp"),
                        rs.getString("pokemon"),
                        rs.getString("tipo")
                };
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar entrenadores.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        add(scroll, BorderLayout.CENTER);
        setVisible(true);
    }
}
