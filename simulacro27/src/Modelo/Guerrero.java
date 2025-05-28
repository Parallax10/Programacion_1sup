package Modelo;


public class Guerrero extends Personaje implements Atacante{
    int fuerza;
    int armadura;
    String arma;

    public Guerrero(String id, String nombre, int nivel, int vidaMax) {
        super(id, nombre, nivel, vidaMax);
    }

    public Guerrero(String id, String nombre, int nivel, int vidaMax, int fuerza, int armadura, String arma,String tipo) {
        super(id, nombre, nivel, vidaMax,tipo);
        this.fuerza = fuerza;
        this.armadura = armadura;
        this.arma = arma;
        this.tipo = "Guerrero";
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public int calcularDañoAtaque() {
        int bonificacion;
        if (getArma() == "Espada"){
            bonificacion = 20;
        } else if (getArma()=="Hacha") {
            bonificacion = 35;
        } else if (getArma()=="Martillo") {
            bonificacion = 50;
        }else {
            bonificacion = 10;
        }
        return fuerza*1+bonificacion;
    }

    @Override
    public boolean puedeAtacar() {
        return true;
    }

    @Override
    public void ejecutarAtaque(Personaje objetivo) {

    }

    @Override
    public String obtenerTipoAtaque() {
        return "Fisico";
    }

    @Override
    public int calcularExperienciaDrop() {
        return nivel*fuerza*10;
    }
}
