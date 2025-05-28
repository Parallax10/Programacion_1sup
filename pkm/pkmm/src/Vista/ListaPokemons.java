package Vista;

import Controlador.DatosDAO;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ListaPokemons extends JFrame {

    public ListaPokemons() {
        setTitle("Lista de pokemon");
        setSize(800, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        String[] columnas = {"ID", "Nombre", "Nivel", "Vida", "Ataque", "Defensa", "Velocidad", "Tipo"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        JTable tabla = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabla);

        try {
            ResultSet rs = DatosDAO.getTodosLosPokemons();
            while (rs.next()) {
                Object[] fila = {
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getDouble("niveles"),
                        rs.getInt("vida"),
                        rs.getInt("ataque"),
                        rs.getInt("defensa"),
                        rs.getInt("velocidad"),
                        rs.getString("tipo")
                };
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al cargar datos.", "Error", JOptionPane.ERROR_MESSAGE);
        }

        add(scroll, BorderLayout.CENTER);
        setVisible(true);
    }
}
