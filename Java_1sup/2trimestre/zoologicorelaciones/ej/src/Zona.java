class Zona {
    private String codigo;
    private String nombre;
    private double metros;

    public Zona(String codigo, String nombre, double metrosCuadrados) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.metros = metrosCuadrados;
    }

    public String getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
}
