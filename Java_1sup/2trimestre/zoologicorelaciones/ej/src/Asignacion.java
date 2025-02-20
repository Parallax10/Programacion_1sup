class Asignacion {
    private Trabajador trabajador;
    private Zona zona;
    private String horario;

    public Asignacion(Trabajador trabajador, Zona zona, String horario) {
        this.trabajador = trabajador;
        this.zona = zona;
        this.horario = horario;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }
    public Zona getZona() {
        return zona;
    }
    public String getHorario() {
        return horario;
    }
}