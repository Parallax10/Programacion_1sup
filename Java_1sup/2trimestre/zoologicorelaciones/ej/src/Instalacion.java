class Instalacion {
    private int numero;
    private String descripcion;
    private int añoInstalacion;
    private Zona zona;

    public Instalacion(int numero, String descripcion, int anioInstalacion, Zona zona) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.añoInstalacion = anioInstalacion;
        this.zona = zona;
    }

    public int getNumero() {
        return numero;
    }
    public Zona getZona() {
        return zona;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public int getAñoInstalacion() {
        return añoInstalacion;
    }
}
