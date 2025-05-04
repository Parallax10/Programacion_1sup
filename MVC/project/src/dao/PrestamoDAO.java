package dao;

import model.Libro;
import java.util.List;

class LibroController {
    private LibroDAO libroDAO;

    public LibroController() {
        libroDAO = new LibroDAO();
    }

    public boolean agregarLibro(String titulo, String autor) {
        Libro libro = new Libro(0, titulo, autor, true);
        return libroDAO.insertarLibro(libro);
    }

    public List<Libro> obtenerTodosLibros() {
        return libroDAO.obtenerTodosLibros();
    }

    public List<Libro> obtenerLibrosDisponibles() {
        return libroDAO.buscarLibrosDisponibles();
    }

    public Libro buscarLibroPorId(int id) {
        return libroDAO.buscarLibroPorId(id);
    }

    public boolean actualizarLibro(Libro libro) {
        return libroDAO.actualizarLibro(libro);
    }

    public boolean eliminarLibro(int id) {
        return libroDAO.eliminarLibro(id);
    }
}