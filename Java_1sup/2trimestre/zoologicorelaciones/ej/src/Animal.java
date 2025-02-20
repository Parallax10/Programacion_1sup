class Animal {
    private String codigo;
    private String nombre;
    private String especie;
    private int anioNacimiento;
    private Instalacion instalacion;

    public Animal(String codigo, String nombre, String especie, int anioNacimiento, Instalacion instalacion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.especie = especie;
        this.anioNacimiento = anioNacimiento;
        this.instalacion = instalacion;
    }

    public String getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getEspecie() {
        return especie;
    }
    public int getAnioNacimiento() {
        return anioNacimiento;
    }
    public Instalacion getInstalacion() {
        return instalacion;
    }
}