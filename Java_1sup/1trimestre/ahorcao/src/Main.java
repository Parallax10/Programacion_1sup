import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    //colores
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        //intro
        System.out.println(ANSI_YELLOW + "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "" + ANSI_RED + "█▄▄ █ █▀▀ █▄░█ █░█ █▀▀ █▄░█ █ █▀▄ █▀█   ▄▀█ █░░   ▄▀█ █░█ █▀█ █▀█ █▀▀ ▄▀█ █▀▄ █▀█\n" +
                "█▄█ █ ██▄ █░▀█ ▀▄▀ ██▄ █░▀█ █ █▄▀ █▄█   █▀█ █▄▄   █▀█ █▀█ █▄█ █▀▄ █▄▄ █▀█ █▄▀ █▄█" + ANSI_YELLOW + "");
        System.out.println(ANSI_YELLOW + "▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓" + ANSI_RESET);
        System.out.println("Adivina la palabra");
        String repetir="A";
        boolean repetirb=true;
        do {
            int numeroAleatorio = (int) (Math.random() * 10) + 1;
            //palabras posibles
            char palabraRandom[];
            palabraRandom = switch (numeroAleatorio) {
                case 1 -> new char[]{'D', 'E', 'P', 'R', 'E', 'S', 'I', 'O', 'N'};
                case 2 -> new char[]{'O', 'R', 'D', 'E', 'N', 'A', 'D', 'O', 'R'};
                case 3 -> new char[]{'R', 'U', 'I', 'N', 'A'};
                case 4 -> new char[]{'C', 'O', 'C', 'H', 'E'};
                case 5 -> new char[]{'H', 'O', 'R', 'A', 'R', 'I', 'O'};
                case 6 -> new char[]{'P', 'S', 'E', 'U', 'D', 'O', 'C', 'O', 'D', 'I', 'G', 'O'};
                case 7 -> new char[]{'M', 'O', 'T', 'O', 'R'};
                case 8 -> new char[]{'P', 'A', 'R', 'C', 'A'};
                case 9 -> new char[]{'L', 'U', 'C', 'I', 'F', 'E', 'R'};
                case 10 -> new char[]{'D', 'E', 'M', 'E', 'N', 'C', 'I', 'A'};
                default -> throw new IllegalStateException("Unexpected value: " + numeroAleatorio);
            };

            char[] guiones = new char[palabraRandom.length];
            for (int i = 0; i < palabraRandom.length; i++) {
                guiones[i] = '_';
                System.out.print(guiones[i]);
            }
            boolean adivinado = false;
            int vidas = 6;
            boolean acierto = false;
            while (vidas != 0 && !adivinado) {
                System.out.println("\n Numero de vidas: " + vidas);
                System.out.println("\n Introduce la letra a comprobar");
                Scanner sc = new Scanner(System.in);
                char letra = sc.next().charAt(0);
                acierto = false;
                for (int i = 0; i < palabraRandom.length; i++) {

                    if (letra == palabraRandom[i]) {
                        acierto = true;
                        guiones[i] = palabraRandom[i];
                    }
                }
                if (!acierto) {
                    System.out.println("Letra incorrecta");
                    vidas--;
                }
                for (int i = 0; i < palabraRandom.length; i++) {
                    System.out.print(guiones[i]);
                }
                if (vidas == 0) {
                    System.out.println("\n NO LA HAS ADIVINADO");
                }
                String sguiones = String.valueOf(guiones);
                String srandom = String.valueOf(palabraRandom);

                if (sguiones.equals(srandom)) {
                    adivinado = true;
                }


            }
            if (adivinado = true) {
                System.out.println("\n ADIVINASTE LA PALABRA");
            }

            System.out.println("\n Repetir juego SI/NO");
            Scanner sc = new Scanner(System.in);
            repetir = sc.nextLine();
            if (repetir.equals("NO")) {
                repetirb=false;
            }


        }while(repetirb!=false);
        System.out.println("Achuparla el ahorcao ya ");
    }
}
