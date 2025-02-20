import java.time.LocalDate;

public abstract class Servicio {
    String trabajador;
    LocalDate fechainicio;
    String cliente;

    public Servicio(String trabajador, String cliente) {
        this.trabajador = trabajador;
        this.fechainicio = fechainicio;
        this.cliente = cliente;
    }

    public String getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(String trabajador) {
        this.trabajador = trabajador;
    }

    public LocalDate getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(LocalDate fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    public double CosteMaterial(){
return 0;
    }
    public double CosteManohobra(){
        return 0;
    }

    public double CosteTotal(){
        return 0;
    }
    public String DetalleServicio(){
        return "0";
    }

}
