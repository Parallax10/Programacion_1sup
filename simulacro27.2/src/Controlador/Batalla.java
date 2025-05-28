package Controlador;

import Model.Personaje;

public class Batalla {
    Personaje personaje;

    public Batalla() {

    }

    public void Pelea(Personaje personaje1, Personaje personaje2) {
        if (personaje1.getTipo()=="Guerrero"){
            personaje1.setDaño(personaje1.getDaño()+5);
        }else{
            personaje1.setDaño(personaje1.getDaño()+10);
        }

        if (personaje2.getTipo()=="Guerrero"){
            personaje2.setDaño(personaje2.getDaño()+5);
        }else{
            personaje2.setDaño(personaje2.getDaño()+10);
        }
        do {
            if (personaje1.getVida() > 0 && personaje2.getVida() > 0) {
                personaje1.setVida(personaje1.getVida() - personaje2.getDaño());
                personaje2.setVida(personaje2.getVida() - personaje1.getDaño());
            }
        }while (personaje1.getVida()>0 && personaje2.getVida()>0);
        if (personaje1.getVida()<=0) {
            System.out.println("El Ganador es: "+personaje2.getNombre());
        }else if (personaje2.getVida()<=0) {
            System.out.println("El Ganador es: "+personaje1.getNombre());
        }
    }
}
