package view;

import controller.UsuarioController;

import javax.swing.*;
import java.awt.*;

public class UsuarioPanel extends JPanel {
    private UsuarioController controller;
    private JTable tablaUsuarios;
    private UsuarioTableModel tableModel;

    public UsuarioPanel() {
        controller = new UsuarioController();
        initComponents();
        cargarUsuarios();
    }

    private void initComponents() {
        setLayout(new BorderLayout());

        // Panel superior con botones
        JPanel panelBotones = new JPanel(new FlowLayout(FlowLayout.LEFT));

        JButton btnAgregar = new JButton("Agregar Usuario");
        btnAgregar.addActionListener(e -> mostrarDialogoAgregarUsuario());

        JButton btnEditar = new JButton("Editar Usuario");
        btnEditar.addActionListener(e -> editarUsuarioSeleccionado());

        JButton btnEliminar = new JButton("Eliminar Usuario");
        btnEliminar.addActionListener(e -> eliminarUsuarioSeleccionado());

        panelBotones.add(btnAgregar);
        panelBotones.add(btnEditar);
        panelBotones.add(btnEliminar);
    }
}