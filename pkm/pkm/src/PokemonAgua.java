public class PokemonAgua extends Pokemon {
    private String habilidadNado;
    private int tiempoBajoAgua;

    public PokemonAgua(int id, String nombre, int nivel, int hp, int ataque, int defensa, int velocidad,
                       String habilidadNado, int tiempoBajoAgua, int entrenadorId) {
        super(id, nombre, nivel, hp, ataque, defensa, velocidad, "Agua", entrenadorId);
        this.habilidadNado = habilidadNado;
        this.tiempoBajoAgua = tiempoBajoAgua;
    }

    public String getHabilidadNado() {
        return habilidadNado;
    }

    public int getTiempoBajoAgua() {
        return tiempoBajoAgua;
    }

    @Override
    public double calcularPotencialAtaque() {
        return super.calcularPotencialAtaque() + tiempoBajoAgua * 0.1;
    }
}
