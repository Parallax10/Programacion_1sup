public class INSTALACIONES {
    ZONAS zonas;
    String descripcion,fecha;
    int codigo;

    public ZONAS getZonas() {
        return zonas;
    }

    public void setZonas(ZONAS zonas) {
        this.zonas = zonas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public INSTALACIONES(ZONAS zonas, String descripcion, String fecha, int codigo) {
        this.zonas = zonas;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.codigo = codigo;
    }
}
