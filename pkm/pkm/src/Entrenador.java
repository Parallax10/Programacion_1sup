public class Entrenador {
    private int id;
    private String nombre;
    private String region;
    private int experiencia;

    public Entrenador(int id, String nombre, String region, int experiencia) {
        this.id = id;
        this.nombre = nombre;
        this.region = region;
        this.experiencia = experiencia;
    }

    // Getters y setters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getRegion() { return region; }
    public int getExperiencia() { return experiencia; }

    public void setId(int id) { this.id = id; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setRegion(String region) { this.region = region; }
    public void setExperiencia(int experiencia) { this.experiencia = experiencia; }

    @Override
    public String toString() {
        return nombre + " (Región: " + region + ", XP: " + experiencia + ")";
    }
}
