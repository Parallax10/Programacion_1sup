import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.util.List;

public class PokemonGUI extends JFrame {
    private JComboBox<String> tipoCombo;
    private JTextField txtNombre, txtNivel, txtHP, txtAtaque, txtDefensa, txtVelocidad;
    private JTextField txtExtra1, txtExtra2;
    private JTable tablaPokemons;
    private DefaultTableModel modelo;
    private JButton btnAgregar, btnActualizar, btnEliminar, btnCargar;

    private PokemonDAO pokemonDAO;

    public PokemonGUI(Connection conexion) {
        super("Gestión de Pokémon");
        pokemonDAO = new PokemonDAO(conexion);
        configurarComponentes();
        configurarEventos();
        cargarPokemons();
    }

    private void configurarComponentes() {
        setSize(800, 450);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panelFormulario = new JPanel(new GridLayout(9, 2));
        panelFormulario.setBorder(BorderFactory.createTitledBorder("Datos del Pokémon"));

        tipoCombo = new JComboBox<>(new String[]{"Fuego", "Agua", "Electrico"});
        txtNombre = new JTextField();
        txtNivel = new JTextField();
        txtHP = new JTextField();
        txtAtaque = new JTextField();
        txtDefensa = new JTextField();
        txtVelocidad = new JTextField();
        txtExtra1 = new JTextField();
        txtExtra2 = new JTextField();

        panelFormulario.add(new JLabel("Tipo:"));
        panelFormulario.add(tipoCombo);
        panelFormulario.add(new JLabel("Nombre:"));
        panelFormulario.add(txtNombre);
        panelFormulario.add(new JLabel("Nivel:"));
        panelFormulario.add(txtNivel);
        panelFormulario.add(new JLabel("HP:"));
        panelFormulario.add(txtHP);
        panelFormulario.add(new JLabel("Ataque:"));
        panelFormulario.add(txtAtaque);
        panelFormulario.add(new JLabel("Defensa:"));
        panelFormulario.add(txtDefensa);
        panelFormulario.add(new JLabel("Velocidad:"));
        panelFormulario.add(txtVelocidad);
        panelFormulario.add(new JLabel("Extra 1:"));
        panelFormulario.add(txtExtra1);
        panelFormulario.add(new JLabel("Extra 2:"));
        panelFormulario.add(txtExtra2);

        btnAgregar = new JButton("Agregar");
        btnActualizar = new JButton("Actualizar");
        btnEliminar = new JButton("Eliminar");
        btnCargar = new JButton("Recargar");

        JPanel panelBotones = new JPanel();
        panelBotones.add(btnAgregar);
        panelBotones.add(btnActualizar);
        panelBotones.add(btnEliminar);
        panelBotones.add(btnCargar);

        modelo = new DefaultTableModel(new String[]{"ID", "Tipo", "Nombre", "Nivel", "HP", "Ataque", "Defensa", "Velocidad", "Extra 1", "Extra 2"}, 0);
        tablaPokemons = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tablaPokemons);

        add(panelFormulario, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void configurarEventos() {
        btnAgregar.addActionListener(e -> agregarPokemon());
        btnActualizar.addActionListener(e -> actualizarPokemon());
        btnEliminar.addActionListener(e -> eliminarPokemon());
        btnCargar.addActionListener(e -> cargarPokemons());

        tablaPokemons.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int fila = tablaPokemons.getSelectedRow();
                if (fila >= 0) {
                    tipoCombo.setSelectedItem(modelo.getValueAt(fila, 1).toString());
                    txtNombre.setText(modelo.getValueAt(fila, 2).toString());
                    txtNivel.setText(modelo.getValueAt(fila, 3).toString());
                    txtHP.setText(modelo.getValueAt(fila, 4).toString());
                    txtAtaque.setText(modelo.getValueAt(fila, 5).toString());
                    txtDefensa.setText(modelo.getValueAt(fila, 6).toString());
                    txtVelocidad.setText(modelo.getValueAt(fila, 7).toString());
                    txtExtra1.setText(modelo.getValueAt(fila, 8).toString());
                    txtExtra2.setText(modelo.getValueAt(fila, 9).toString());
                }
            }
        });
    }

    private void agregarPokemon() {
        String tipo = tipoCombo.getSelectedItem().toString();
        String nombre = txtNombre.getText();
        int nivel = Integer.parseInt(txtNivel.getText());
        int hp = Integer.parseInt(txtHP.getText());
        int ataque = Integer.parseInt(txtAtaque.getText());
        int defensa = Integer.parseInt(txtDefensa.getText());
        int velocidad = Integer.parseInt(txtVelocidad.getText());
        Pokemon p = null;

        switch (tipo) {
            case "Fuego":
                double temp = Double.parseDouble(txtExtra1.getText());
                double calor = Double.parseDouble(txtExtra2.getText());
                p = new PokemonFuego(0, nombre, nivel, hp, ataque, defensa, velocidad, temp, calor);
                break;
            case "Agua":
                String habilidad = txtExtra1.getText();
                double tiempo = Double.parseDouble(txtExtra2.getText());
                p = new PokemonAgua(0, nombre, nivel, hp, ataque, defensa, velocidad, habilidad, tiempo);
                break;
            case "Electrico":
                double volt = Double.parseDouble(txtExtra1.getText());
                double carga = Double.parseDouble(txtExtra2.getText());
                p = new PokemonElectrico(0, nombre, nivel, hp, ataque, defensa, velocidad, volt, carga);
                break;
        }

        if (p != null) {
            pokemonDAO.agregarPokemon(p);
            limpiarCampos();
            cargarPokemons();
        }
    }

    private void actualizarPokemon() {
        int fila = tablaPokemons.getSelectedRow();
        if (fila >= 0) {
            int id = Integer.parseInt(modelo.getValueAt(fila, 0).toString());
            String tipo = tipoCombo.getSelectedItem().toString();
            String nombre = txtNombre.getText();
            int nivel = Integer.parseInt(txtNivel.getText());
            int hp = Integer.parseInt(txtHP.getText());
            int ataque = Integer.parseInt(txtAtaque.getText());
            int defensa = Integer.parseInt(txtDefensa.getText());
            int velocidad = Integer.parseInt(txtVelocidad.getText());
            Pokemon p = null;

            switch (tipo) {
                case "Fuego":
                    double temp = Double.parseDouble(txtExtra1.getText());
                    double calor = Double.parseDouble(txtExtra2.getText());
                    p = new PokemonFuego(id, nombre, nivel, hp, ataque, defensa, velocidad, temp, calor);
                    break;
                case "Agua":
                    String habilidad = txtExtra1.getText();
                    double tiempo = Double.parseDouble(txtExtra2.getText());
                    p = new PokemonAgua(id, nombre, nivel, hp, ataque, defensa, velocidad, habilidad, tiempo);
                    break;
                case "Electrico":
                    double volt = Double.parseDouble(txtExtra1.getText());
                    double carga = Double.parseDouble(txtExtra2.getText());
                    p = new PokemonElectrico(id, nombre, nivel, hp, ataque, defensa, velocidad, volt, carga);
                    break;
            }

            if (p != null) {
                pokemonDAO.actualizarPokemon(p);
                limpiarCampos();
                cargarPokemons();
            }
        }
    }

    private void eliminarPokemon() {
        int fila = tablaPokemons.getSelectedRow();
        if (fila >= 0) {
            int id = Integer.parseInt(modelo.getValueAt(fila, 0).toString());
            pokemonDAO.eliminarPokemon(id);
            limpiarCampos();
            cargarPokemons();
        }
    }

    private void cargarPokemons() {
        modelo.setRowCount(0);
        List<Pokemon> pokemons = pokemonDAO.obtenerTodos();
        for (Pokemon p : pokemons) {
            String tipo = p.getTipo();
            String extra1 = "", extra2 = "";

            switch (tipo) {
                case "Fuego":
                    PokemonFuego pf = (PokemonFuego) p;
                    extra1 = String.valueOf(pf.getTempCorporal());
                    extra2 = String.valueOf(pf.getResistenciaCalor());
                    break;
                case "Agua":
                    PokemonAgua pa = (PokemonAgua) p;
                    extra1 = pa.getHabilidadNado();
                    extra2 = String.valueOf(pa.getTiempoBajoAgua());
                    break;
                case "Electrico":
                    PokemonElectrico pe = (PokemonElectrico) p;
                    extra1 = String.valueOf(pe.getVoltaje());
                    extra2 = String.valueOf(pe.getCapacidadCarga());
                    break;
            }

            modelo.addRow(new Object[]{
                    p.getId(), tipo, p.getNombre(), p.getNivel(), p.getHp(),
                    p.getAtaque(), p.getDefensa(), p.getVelocidad(),
                    extra1, extra2
            });
        }
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtNivel.setText("");
        txtHP.setText("");
        txtAtaque.setText("");
        txtDefensa.setText("");
        txtVelocidad.setText("");
        txtExtra1.setText("");
        txtExtra2.setText("");
        tipoCombo.setSelectedIndex(0);
    }
}
