public class Superheroe {
    String nombre;
    String descripcion;
    boolean capa;

    public Superheroe(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isCapa() {
        return capa;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCapa(boolean capa) {
        this.capa = capa;
    }
    public String mostrar() {
        return "Nombre: " + nombre+" Descripcion: " + descripcion+" Capa: " + capa;
    }

    public void add(Figura figura) {
    }
}
