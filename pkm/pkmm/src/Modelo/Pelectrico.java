package Modelo;

public class Pelectrico extends Pokemon {
    int voltaje;
    int carga;

    public Pelectrico() {
    }

    public Pelectrico(int id, String nombre, double niveles, int vida, int ataque, int defensa, int velocidad, String tipo) {
        super(id, nombre, niveles, vida, ataque, defensa, velocidad, tipo);
        tipo = "electrico";
    }

    public int getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(int voltaje) {
        this.voltaje = voltaje;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Modelo.Pelectrico{" +
                "voltaje=" + voltaje +
                ", carga=" + carga +
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
