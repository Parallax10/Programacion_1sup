package Modelo;

public interface Atacante {
    public int calcularDañoAtaque();
    public boolean puedeAtacar();
    public void ejecutarAtaque(Personaje objetivo);
    String obtenerTipoAtaque();

}
