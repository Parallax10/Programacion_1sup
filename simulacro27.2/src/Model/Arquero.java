package Model;

public class Arquero extends Personaje{
    Personaje personaje;
    String tipo="Arquero";

    public Arquero(Personaje personaje) {
        this.personaje = personaje;
        this.tipo = "Arquero";
    }

    public Arquero(String nombre, int vida, int daño, Personaje personaje) {
        super(nombre, vida, daño);
        this.personaje = personaje;
        this.tipo = "Arquero";
    }
}
