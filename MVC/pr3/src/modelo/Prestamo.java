package modelo;

import java.util.Date;

public class Prestamo {
    private int id;
    private int libroId;
    private int usuarioId;
    private Date fechaPrestamo;
    private Date fechaDevolucion;

    public Prestamo(int id, int libroId, int usuarioId, Date fechaPrestamo, Date fechaDevolucion) {
        this.id = id;
        this.libroId = libroId;
        this.usuarioId = usuarioId;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }
//getter y setter
    public int getId() {
        return id;
    }

    public int getLibroId() {
        return libroId;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLibroId(int libroId) {
        this.libroId = libroId;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
}
