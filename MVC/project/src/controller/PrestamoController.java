package controller;

import dao.PrestamoDAO;
import model.Prestamo;
import java.time.LocalDate;
import java.util.List;

public class PrestamoController {
    private PrestamoDAO prestamoDAO;

    public PrestamoController() {
        prestamoDAO = new PrestamoDAO();
    }

    public boolean realizarPrestamo(String dniUsuario, int idLibro, LocalDate fechaPrestamo, LocalDate fechaDevolucionPrevista) {
        Prestamo prestamo = new Prestamo(0, dniUsuario, idLibro, fechaPrestamo, fechaDevolucionPrevista, null);
        return prestamoDAO.realizarPrestamo(prestamo);
    }

    public boolean registrarDevolucion(int idPrestamo) {
        return prestamoDAO.registrarDevolucion(idPrestamo, LocalDate.now());
    }

    public List<Prestamo> obtenerPrestamosActivos() {
        return prestamoDAO.obtenerPrestamosActivos();
    }

    public Prestamo buscarPrestamoPorId(int idPrestamo) {
        return prestamoDAO.buscarPrestamoPorId(idPrestamo);
    }
}