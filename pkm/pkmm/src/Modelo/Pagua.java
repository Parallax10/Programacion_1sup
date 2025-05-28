package Modelo;

public class Pagua extends Pokemon {
    int habilidadesNado;
    int tiempoBajoAgua;

    public Pagua() {
    }

    public Pagua(int id, String nombre, double niveles, int vida, int ataque, int defensa, int velocidad, String tipo) {
        super(id, nombre, niveles, vida, ataque, defensa, velocidad, tipo);
        tipo = "agua";
    }

    public int getHabilidadesNado() {
        return habilidadesNado;
    }

    public void setHabilidadesNado(int habilidadesNado) {
        this.habilidadesNado = habilidadesNado;
    }

    public int getTiempoBajoAgua() {
        return tiempoBajoAgua;
    }

    public void setTiempoBajoAgua(int tiempoBajoAgua) {
        this.tiempoBajoAgua = tiempoBajoAgua;
    }

    @Override
    public String toString() {
        return "Modelo.Pagua{" +
                "habilidadesNado=" + habilidadesNado +
                ", tiempoBajoAgua=" + tiempoBajoAgua +
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
