public class PokemonElectrico extends Pokemon {
    private double voltaje;
    private double capacidadCarga;

    public PokemonElectrico(int id, String nombre, int nivel, int hp, int ataque, int defensa, int velocidad,
                            double voltaje, double capacidadCarga, int entrenadorId) {
        super(id, nombre, nivel, hp, ataque, defensa, velocidad, "Electrico", entrenadorId);
        this.voltaje = voltaje;
        this.capacidadCarga = capacidadCarga;
    }

    public double getVoltaje() {
        return voltaje;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    @Override
    public double calcularPotencialAtaque() {
        return super.calcularPotencialAtaque() + voltaje * 0.3;
    }
}
