package Controlador;

import Modelo.Personaje;

public class ArenaManager {
    Personaje personaje1 = new Personaje(id, nombre, nivel, vidaMax, tipo) {
        @Override
        public int calcularExperienciaDrop() {
            return 0;
        }
    };
    Personaje personaje2=new Personaje(id, nombre, nivel, vidaMax, tipo) {

        @Override
        public int calcularExperienciaDrop() {
            return 0;
        }
    };
    boolean personaje1Lucha;
    boolean personaje2Lucha;
    public void registrarPersonajes(Personaje personaje) {
        personaje.getId();
        personaje.getNombre();
        personaje.getNivel();
        personaje.getVidaActual();
        personaje.getVidaMax();
    }
    public void obtenerLuchadores() {

        if(personaje1.estaVido()){
            personaje1Lucha=true;
        }else {
            personaje1Lucha=false;
        }
        if(personaje2.estaVido()){
            personaje2Lucha=true;
        }else {
            personaje2Lucha=false;
        }
    }
    public void SimularCombate(String id1, String id2) {
        if (personaje1.getId().equals(id1) && personaje2.getId().equals(id2)) {
            if(personaje1Lucha && personaje2Lucha){
            personaje1.getTipo();
            personaje2.getTipo();
            }
        }
    }
}
