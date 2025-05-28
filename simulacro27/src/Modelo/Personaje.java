package Modelo;

public abstract class Personaje {
    String id;
    String nombre;
    int nivel;
    int vidaMax;
    int vidaActual;
    String tipo;

    public Personaje(String id, String nombre, int nivel, int vidaMax, int vidaActual, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.vidaMax = vidaMax;
        this.vidaActual = vidaActual;
        this.tipo = tipo;
    }

    public Personaje(String id, String nombre, int nivel, int vidaMax, String tipo) {
    }

    public Personaje(String id, String nombre, int nivel, int vidaMax) {
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
        this.vidaMax = vidaMax;
        this.vidaActual = vidaMax;
        this.tipo = "";
    }
    public abstract int calcularExperienciaDrop();

    public final boolean estaVido(){
        return vidaActual > 0;
    }
    public void recibirDaño(int daño){
        if(vidaActual - daño > 0){
            vidaActual=vidaActual-daño;
        }else {
            vidaActual=0;
        }

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVidaMax() {
        return vidaMax;
    }

    public void setVidaMax(int vidaMax) {
        this.vidaMax = vidaMax;
    }

    public int getVidaActual() {
        return vidaActual;
    }

    public void setVidaActual(int vidaActual) {
        this.vidaActual = vidaActual;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
