package Model;

public class Guerrero extends Personaje{
    Personaje personaje;
    String tipo="Guerrero";

    public Guerrero(Personaje personaje) {
        this.personaje = personaje;
        tipo="Guerrero";
    }

    public Guerrero(String nombre, int vida, int daño, Personaje personaje) {
        super(nombre, vida, daño);
        this.personaje = personaje;
        tipo="Guerrero";
    }
}
