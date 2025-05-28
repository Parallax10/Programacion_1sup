package Modelo;

public abstract class Entrenador {
    String nombre;
    String region;
    int xp;
    Pokemon pokemon;

    public Entrenador() {
    }

    public Entrenador(String nombre, String region, int xp, Pokemon pokemon) {
        this.nombre = nombre;
        this.region = region;
        this.xp = xp;
        this.pokemon = pokemon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "nombre='" + nombre + '\'' +
                ", region='" + region + '\'' +
                ", xp=" + xp +
                ", pokemon=" + pokemon +
                '}';
    }
}
