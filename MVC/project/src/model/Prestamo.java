package model;

import java.time.LocalDate;

public class Prestamo {
    private int idPrestamo;
    private String dniUsuario;
    private int idLibro;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucionPrevista;
    private LocalDate fechaDevolucionReal;

    public Prestamo(int idPrestamo, String dniUsuario, int idLibro,
                    LocalDate fechaPrestamo, LocalDate fechaDevolucionPrevista,
                    LocalDate fechaDevolucionReal) {
        this.idPrestamo = idPrestamo;
        this.dniUsuario = dniUsuario;
        this.idLibro = idLibro;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucionPrevista = fechaDevolucionPrevista;
        this.fechaDevolucionReal = fechaDevolucionReal;
    }

    // Getters y Setters
    public int getIdPrestamo() { return idPrestamo; }
    public String getDniUsuario() { return dniUsuario; }
    public int getIdLibro() { return idLibro; }
    public LocalDate getFechaPrestamo() { return fechaPrestamo; }
    public LocalDate getFechaDevolucionPrevista() { return fechaDevolucionPrevista; }
    public LocalDate getFechaDevolucionReal() { return fechaDevolucionReal; }
    public void setFechaDevolucionReal(LocalDate fechaDevolucionReal) {
        this.fechaDevolucionReal = fechaDevolucionReal;
    }

    public boolean estaVencido() {
        return LocalDate.now().isAfter(fechaDevolucionPrevista) && fechaDevolucionReal == null;
    }
}