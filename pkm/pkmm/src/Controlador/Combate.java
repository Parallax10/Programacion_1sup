package Controlador;

import Modelo.Pokemon;

public class Combate {
    public String resultado;

    public Combate(Pokemon pokemon, Pokemon pokemon2) {
        // mas ataque si nivel > 5
        if (pokemon.getNiveles() > 5) {
            pokemon.setAtaque(pokemon.getAtaque() + 5);
        }
        if (pokemon2.getNiveles() > 5) {
            pokemon2.setAtaque(pokemon2.getAtaque() + 5);
        }

        do {
            if (pokemon.getVelocidad() > pokemon2.getVelocidad()) {
                pokemon2.setVida(pokemon2.getVida() - pokemon.getAtaque());
                if (pokemon2.getVida() <= 0) break;
                pokemon.setVida(pokemon.getVida() - pokemon2.getAtaque());
            } else {
                pokemon.setVida(pokemon.getVida() - pokemon2.getAtaque());
                if (pokemon.getVida() <= 0) break;
                pokemon2.setVida(pokemon2.getVida() - pokemon.getAtaque());
            }
        } while (pokemon.getVida() > 0 && pokemon2.getVida() > 0);

        if (pokemon.getVida() <= 0) {
            resultado = "El ganador es: " + pokemon2.getNombre();
        } else {
            resultado = "El ganador es: " + pokemon.getNombre();
        }
    }
}
