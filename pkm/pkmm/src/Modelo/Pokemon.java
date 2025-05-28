package Modelo;

public class Pokemon {
    int id;
    String nombre;
    double niveles;
    int vida;
    int ataque;
    int defensa;
    int velocidad;
    String tipo;

    public Pokemon() {
    }

    public Pokemon(int id, String nombre, double niveles, int vida, int ataque, int defensa, int velocidad, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.niveles = niveles;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNiveles() {
        return niveles;
    }

    public void setNiveles(double niveles) {
        this.niveles = niveles;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
