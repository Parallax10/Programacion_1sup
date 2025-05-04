package controller;

import dao.UsuarioDAO;
import model.Usuario;
import java.time.LocalDate;
import java.util.List;

public class UsuarioController {
    private UsuarioDAO usuarioDAO;

    public UsuarioController() {
        usuarioDAO = new UsuarioDAO();
    }

    public boolean registrarUsuario(String dni, String nombre, String telefono) {
        Usuario usuario = new Usuario(dni, nombre, telefono, LocalDate.now());
        return usuarioDAO.insertarUsuario(usuario);
    }

    public List<Usuario> obtenerTodosUsuarios() {
        return usuarioDAO.obtenerTodosUsuarios();
    }

    public Usuario buscarUsuarioPorDni(String dni) {
        return usuarioDAO.buscarUsuarioPorDni(dni);
    }

    public boolean actualizarUsuario(Usuario usuario) {
        return usuarioDAO.actualizarUsuario(usuario);
    }

    public boolean eliminarUsuario(String dni) {
        return usuarioDAO.eliminarUsuario(dni);
    }
}