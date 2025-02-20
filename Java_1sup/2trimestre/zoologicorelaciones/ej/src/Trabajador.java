class Trabajador {
    private String dni;
    private String nombre;
    private String especialidad;

    public Trabajador(String dni, String nombre, String especialidad) {
        this.dni = dni;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getDni() {
        return dni;
    }
    public String getNombre() {
        return nombre;
    }
    public String getEspecialidad() {
        return especialidad;
    }
}
