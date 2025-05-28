package Modelo;

public class Mago extends Personaje implements Magico,Atacante{
    int inteligencia;
    int manaMax;
    int manaActual;
    String echizo;

    public Mago(String id, String nombre, int nivel, int vidaMax) {
        super(id, nombre, nivel, vidaMax);
    }

    public Mago(String id, String nombre, int nivel, int vidaMax, int inteligencia, int manaMax, String tipo) {
        super(id, nombre, nivel, vidaMax,tipo);
        this.inteligencia = inteligencia;
        this.manaMax = manaMax;
        this.manaActual = manaMax;
        this.tipo = "Mago";
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getManaMax() {
        return manaMax;
    }

    public void setManaMax(int manaMax) {
        this.manaMax = manaMax;
    }

    @Override
    public int calcularExperienciaDrop() {
        return nivel*inteligencia*15;
    }

    @Override
    public int getManaActual() {
        return manaActual;
    }

    @Override
    public boolean puedeAtacar() {
        if(manaActual >=30){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void recuperarMana(int cantidadMana) {

    }

    public void setManaActual(int manaActual) {
        this.manaActual = manaActual;
    }

    @Override
    public int calcularDañoAtaque() {
        return inteligencia*2;
    }

    @Override
    public void ejecutarAtaque(Personaje objetivo) {

    }

    @Override
    public String obtenerTipoAtaque() {
        return "Magico";
    }
    public void  lanzarHechizo(String echizo){
        int daño;
        if (echizo.equals("Fireball")){
            setManaActual(getManaActual()-40);
            daño = inteligencia*3;
        }else if (echizo.equals("Lightning")){
            setManaActual(getManaActual()-60);
            daño= inteligencia*4;
        }else if (echizo.equals("Heal")){
            setManaActual(getManaActual()-25);
            setVidaActual(getVidaActual()+50+inteligencia);
        }
    }
}
