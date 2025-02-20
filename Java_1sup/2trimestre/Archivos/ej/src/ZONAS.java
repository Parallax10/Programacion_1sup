public class ZONAS {
    int codigo,metroscuadrados;
    String nombre;

    public ZONAS(int codigo, int metroscuadrados, String nombre) {
        this.codigo = codigo;
        this.metroscuadrados = metroscuadrados;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getMetroscuadrados() {
        return metroscuadrados;
    }

    public void setMetroscuadrados(int metroscuadrados) {
        this.metroscuadrados = metroscuadrados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
