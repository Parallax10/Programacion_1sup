package Modelo;

public class Pfuego extends Pokemon {
   int temperatura;
   int resistenciaCalor;

    public Pfuego() {
    }

    public Pfuego(int id, String nombre, double niveles, int vida, int ataque, int defensa, int velocidad, String tipo) {
        super(id, nombre, niveles, vida, ataque, defensa, velocidad, tipo);
        this.tipo = "fuego";
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getResistenciaCalor() {
        return resistenciaCalor;
    }

    public void setResistenciaCalor(int resistenciaCalor) {
        this.resistenciaCalor = resistenciaCalor;
    }

    @Override
    public String toString() {
        return "Modelo.Pfuego{" +
                "temperatura=" + temperatura +
                ", resistenciaCalor=" + resistenciaCalor +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", niveles=" + niveles +
                ", vida=" + vida +
                ", ataque=" + ataque +
                ", defensa=" + defensa +
                ", velocidad=" + velocidad +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
