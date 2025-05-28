package Vista;

import Controlador.Combate;
import Controlador.DatosDAO;
import Modelo.Pokemon;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class SeleccionarEntrenadores extends JFrame {

    private JComboBox<String> comboEntrenador1;
    private JComboBox<String> comboEntrenador2;
    private JComboBox<String> comboPokemon1;
    private JComboBox<String> comboPokemon2;
    private JButton btnIniciarCombate;

    public SeleccionarEntrenadores() {
        setTitle("Seleccionar Entrenadores y pokemon");
        setSize(450, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        initComponents();
        loadEntrenadores();
        setupListeners();

        setVisible(true);
    }

    private void initComponents() {
        comboEntrenador1 = new JComboBox<>();
        comboEntrenador2 = new JComboBox<>();
        comboPokemon1 = new JComboBox<>();
        comboPokemon2 = new JComboBox<>();
        btnIniciarCombate = new JButton("Iniciar Combate");

        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        panel.add(new JLabel("Entrenador 1:"));
        panel.add(comboEntrenador1);
        panel.add(new JLabel("pokemon de Entrenador 1:"));
        panel.add(comboPokemon1);

        panel.add(new JLabel("Entrenador 2:"));
        panel.add(comboEntrenador2);
        panel.add(new JLabel("pokemon de Entrenador 2:"));
        panel.add(comboPokemon2);

        panel.add(new JLabel(""));
        panel.add(btnIniciarCombate);

        add(panel);
    }

    private void loadEntrenadores() {
        ArrayList<String> entrenadores = DatosDAO.getEntrenadores();
        for (String nombre : entrenadores) {
            comboEntrenador1.addItem(nombre);
            comboEntrenador2.addItem(nombre);
        }
        if (!entrenadores.isEmpty()) {
            loadPokemonsEntrenador(comboEntrenador1.getSelectedItem().toString(), comboPokemon1);
            loadPokemonsEntrenador(comboEntrenador2.getSelectedItem().toString(), comboPokemon2);
        }
    }

    private void setupListeners() {
        comboEntrenador1.addActionListener(e -> {
            String entrenador = (String) comboEntrenador1.getSelectedItem();
            if (entrenador != null) {
                loadPokemonsEntrenador(entrenador, comboPokemon1);
            }
        });

        comboEntrenador2.addActionListener(e -> {
            String entrenador = (String) comboEntrenador2.getSelectedItem();
            if (entrenador != null) {
                loadPokemonsEntrenador(entrenador, comboPokemon2);
            }
        });

        btnIniciarCombate.addActionListener(e -> iniciarCombate());
    }

    private void loadPokemonsEntrenador(String entrenador, JComboBox<String> comboPokemon) {
        comboPokemon.removeAllItems();
        ArrayList<String> pokemons = DatosDAO.getPokemonsPorEntrenador(entrenador);
        for (String p : pokemons) {
            comboPokemon.addItem(p);
        }
        if (comboPokemon.getItemCount() == 0) {
            comboPokemon.addItem("No hay pokemons");
            comboPokemon.setEnabled(false);
        } else {
            comboPokemon.setEnabled(true);
        }
    }

    private void iniciarCombate() {
        String entrenador1 = (String) comboEntrenador1.getSelectedItem();
        String pokemon1Nombre = (String) comboPokemon1.getSelectedItem();
        String entrenador2 = (String) comboEntrenador2.getSelectedItem();
        String pokemon2Nombre = (String) comboPokemon2.getSelectedItem();

        if (pokemon1Nombre == null || pokemon2Nombre == null ||
                pokemon1Nombre.equals("No hay pokemons") || pokemon2Nombre.equals("No hay pokemon")) {
            JOptionPane.showMessageDialog(this, "Ambos entrenadores deben seleccionar un pokemon valido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Pokemon p1 = DatosDAO.getPokemonPorNombre(entrenador1, pokemon1Nombre);
        Pokemon p2 = DatosDAO.getPokemonPorNombre(entrenador2, pokemon2Nombre);

        if (p1 == null || p2 == null) {
            JOptionPane.showMessageDialog(this, "No se pudo cargar uno de los pokemon seleccionados.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Combate combate = new Combate(p1, p2);

        JOptionPane.showMessageDialog(this, combate.resultado, "Resultado del Combate", JOptionPane.INFORMATION_MESSAGE);
    }
}
