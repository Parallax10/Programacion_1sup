public class PokemonFuego extends Pokemon {
    private double tempCorporal;
    private double resistenciaCalor;

    public PokemonFuego(int id, String nombre, int nivel, int hp, int ataque, int defensa, int velocidad, double tempCorporal, double resistenciaCalor) {
        super(id, nombre, nivel, hp, ataque, defensa, velocidad);
        this.tempCorporal = tempCorporal;
        this.resistenciaCalor = resistenciaCalor;
    }

    public double getTempCorporal() {
        return tempCorporal;
    }

    public double getResistenciaCalor() {
        return resistenciaCalor;
    }

    @Override
    public String getTipo() {
        return "Fuego";
    }

    @Override
    public int calcularPotencialAtaque() {
        return getAtaque() + (int)(tempCorporal * 0.5);
    }
}
