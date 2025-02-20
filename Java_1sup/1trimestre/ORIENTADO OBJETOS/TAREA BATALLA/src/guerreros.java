public class guerreros {

    int vida1, vida2, clase, ataqueespada, ataquearc;


    public guerreros(int clase) {
        this.clase = clase;
        this.vida1 = 100;
        this.vida2 = 100;

    }
        public void batalla() {
            int turno = 1; // contar turnos
            while (vida1 > 0 && vida2 > 0) {
                System.out.println("Turno: " + turno);

                // ataque guerrero

                int nrandom = (int) (Math.random() * 2 + 1);
                this.ataqueespada = 20;

                if (nrandom == 1) {
                    vida2= vida2 - ataqueespada;
                    System.out.println("¡Guerrero acertó! Vida del arquero ahora es: " + vida2);
                } else {
                    System.out.println("Guerrero falló.");
                }

                // ataque arquero
                nrandom = (int) (Math.random() * 4 + 1);
                this.ataquearc = 50;

                if (nrandom == 1) {
                    vida1= vida1 - ataquearc;
                    System.out.println("¡Arquero acertó! Vida del guerrero ahora es: " + vida1);
                } else {
                    System.out.println("Arquero falló.");
                }

                turno++;
            }

            if (vida1 <= 0) {
                System.out.println("El guerrero ha caído. ¡El arquero Fulanito gana!");
            } else if (vida2 <= 0) {
                System.out.println("El arquero ha caído. ¡El guerrero Menganito gana!");
            }
        }
    }