package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {
    public MainFrame() {
        super("Sistema de Gestión de Biblioteca Universitaria");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        initUI();
    }

    private void initUI() {
        // Crear barra de menú
        JMenuBar menuBar = new JMenuBar();

        // Menú Libros
        JMenu menuLibros = new JMenu("Libros");
        JMenuItem itemGestionLibros = new JMenuItem("Gestión de Libros");
        itemGestionLibros.addActionListener(this::mostrarPanelLibros);
        menuLibros.add(itemGestionLibros);

        // Menú Usuarios
        JMenu menuUsuarios = new JMenu("Usuarios");
        JMenuItem itemGestionUsuarios = new JMenuItem("Gestión de Usuarios");
        itemGestionUsuarios.addActionListener(this::mostrarPanelUsuarios);
        menuUsuarios.add(itemGestionUsuarios);

        // Menú Préstamos
        JMenu menuPrestamos = new JMenu("Préstamos");
        JMenuItem itemGestionPrestamos = new JMenuItem("Gestión de Préstamos");
        itemGestionPrestamos.addActionListener(this::mostrarPanelPrestamos);
        menuPrestamos.add(itemGestionPrestamos);

        // Añadir menús a la barra
        menuBar.add(menuLibros);
        menuBar.add(menuUsuarios);
        menuBar.add(menuPrestamos);

        setJMenuBar(menuBar);

        // Panel principal con card layout para cambiar entre vistas
        JPanel mainPanel = new JPanel(new CardLayout());

        // Crear los diferentes paneles
        LibroPanel libroPanel = new LibroPanel();
        UsuarioPanel usuarioPanel = new UsuarioPanel();
        PrestamoPanel prestamoPanel = new PrestamoPanel();

        // Añadir paneles al card layout
        mainPanel.add(libroPanel, "LIBROS");
        mainPanel.add(usuarioPanel, "USUARIOS");
        mainPanel.add(prestamoPanel, "PRESTAMOS");

        // Mostrar el panel de libros por defecto
        ((CardLayout) mainPanel.getLayout()).show(mainPanel, "LIBROS");

        add(mainPanel);
    }

    private void mostrarPanelLibros(ActionEvent e) {
        ((CardLayout) ((JPanel) getContentPane().getComponent(0)).getLayout()).show(
                (JPanel) getContentPane().getComponent(0), "LIBROS");
        setTitle("Sistema de Gestión de Biblioteca - Libros");
    }

    private void mostrarPanelUsuarios(ActionEvent e) {
        ((CardLayout) ((JPanel) getContentPane().getComponent(0)).getLayout()).show(
                (JPanel) getContentPane().getComponent(0), "USUARIOS");
        setTitle("Sistema de Gestión de Biblioteca - Usuarios");
    }

    private void mostrarPanelPrestamos(ActionEvent e) {
        ((CardLayout) ((JPanel) getContentPane().getComponent(0)).getLayout()).show(
                (JPanel) getContentPane().getComponent(0), "PRESTAMOS");
        setTitle("Sistema de Gestión de Biblioteca - Préstamos");
    }
}