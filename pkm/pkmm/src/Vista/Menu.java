package Vista;

import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {

    public Menu() {
        setTitle("Menú");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // panel principal
        JPanel panelPrincipal = new JPanel(new BorderLayout());

        // panel de botones
        JPanel panelBotones = new JPanel(new GridLayout(3, 1, 10, 10));
        JButton btnCombate = new JButton("Empezar Combate");
        JButton btnListarPokemons = new JButton("Listar pokemons");
        JButton btnListarEntrenadores = new JButton("Listar Entrenadores");

        panelBotones.add(btnCombate);
        panelBotones.add(btnListarPokemons);
        panelBotones.add(btnListarEntrenadores);

        //panel para la foto
        JPanel panelImagen = new JPanel();
        panelImagen.setLayout(new BorderLayout());
        JLabel imagenLabel = new JLabel();

       //foto
        ImageIcon icono = new ImageIcon("img/img1.png");
        Image imagen = icono.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
        imagenLabel.setIcon(new ImageIcon(imagen));
        panelImagen.add(imagenLabel, BorderLayout.NORTH);

        panelPrincipal.add(panelImagen, BorderLayout.WEST);
        panelPrincipal.add(panelBotones, BorderLayout.CENTER);

        add(panelPrincipal);
        setVisible(true);

        // listeners
        btnCombate.addActionListener(e -> {
            new SeleccionarEntrenadores();
        }
        );

        btnListarPokemons.addActionListener(e -> {
            new ListaPokemons();
        }
        );

        btnListarEntrenadores.addActionListener(e -> {
            new ListaEntrenadores();
        }
        );
    }

}
