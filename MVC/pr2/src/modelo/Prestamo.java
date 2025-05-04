package modelo;
import java.util.Date;
public class Prestamo {
    private int id;
    private int idLibro;
    private int idUsuario;
    //ATRIBUTOS DEL PRESTAMO
    private Date fechaPrestamo;
    public Prestamo() {}
    public Prestamo(int id, int idLibro, int idUsuario, Date fechaPrestamo) {
        this.id = id;
        this.idLibro = idLibro;
        this.idUsuario = idUsuario;
        this.fechaPrestamo = fechaPrestamo;
    }
    public Prestamo(int idLibro, int idUsuario, Date fechaPrestamo) {
        this.idLibro = idLibro;
        this.idUsuario = idUsuario;
        this.fechaPrestamo = fechaPrestamo;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getIdLibro() {
        return idLibro;
    }
    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }
    public int getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }
    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
}
