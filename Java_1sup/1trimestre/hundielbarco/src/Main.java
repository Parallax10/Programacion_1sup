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
        boolean repeat = true;
        while(repeat==true) {
        //intro
        System.out.println(ANSI_YELLOW + "***************" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + ANSI_RED + "HUNDIR LA FLOTA");
        System.out.println(ANSI_YELLOW + "***************" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "8= agua 0=no descubierto 1-4=barcos" + ANSI_RESET);

        int[][] tablero = new int[10][10]; // tablero 10x10

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablero[i][j] = 0;
            }
            int[][] tableroVacio = new int[10][10];
            for (i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    tableroVacio[i][j] = 0;
                }
        }
       //INICIO SPAWNEO BARCOS
        int tipobarco1 = 1;
        int numeroAleatorio1 = (int) (Math.random() * 10);
        int numeroAleatorio2 = (int) (Math.random() * 10);

        tablero[numeroAleatorio1][numeroAleatorio2] = tipobarco1;
        System.out.println(numeroAleatorio1 + " " + numeroAleatorio2);

        int tipobarco2 = 2;
        int tipobarco3 = 3;
        int tipobarco4 = 4;

        numeroAleatorio1 = (int) (Math.random() * 10);
        numeroAleatorio2 = (int) (Math.random() * 10);
        //barco de 2
        for (int i1 = 0; i1 < 2; i1++) {
            if (tablero[numeroAleatorio1][numeroAleatorio2] == 0) {
                tablero[numeroAleatorio1][numeroAleatorio2] = tipobarco2;
                numeroAleatorio1 = numeroAleatorio1 + 1;
            }

        }
        numeroAleatorio1 = (int) (Math.random() * 10);
        numeroAleatorio2 = (int) (Math.random() * 10);
        //barco de 3
        for (int i2 = 0; i2 < 3; i2++) {
            if (tablero[numeroAleatorio1][numeroAleatorio2] == 0) {
            tablero[numeroAleatorio1][numeroAleatorio2] = tipobarco3;
            numeroAleatorio2 = numeroAleatorio2 + 1;
            }
        }

            numeroAleatorio1 = (int) (Math.random() * 10);
            numeroAleatorio2 = (int) (Math.random() * 10);
            //barco de 4
            for (int i3 = 0; i3 < 4; i3++) {
                if (tablero[numeroAleatorio1][numeroAleatorio2] == 0) {
                    tablero[numeroAleatorio1][numeroAleatorio2] = tipobarco4;
                    numeroAleatorio1 = numeroAleatorio1 + 1;
                }

            }
            //FIN SPAWN BARCOS
            //INICIO JUEGO

            for (i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(tableroVacio[i][j] + "\t");
                }
                System.out.println();
            }

        //juego
            int aciertos=0;
            while (aciertos<10) {
                System.out.println("vertical");
                Scanner sc = new Scanner(System.in);
                String vertical = sc.nextLine();
                System.out.println("horizontal");
                String horizontal = sc.nextLine();
                if (tablero[Integer.parseInt(vertical)][Integer.parseInt(horizontal)] == 0) {
                    tableroVacio[Integer.parseInt(vertical)][Integer.parseInt(horizontal)] = 8;
                }
                if (tablero[Integer.parseInt(vertical)][Integer.parseInt(horizontal)] != 0) {
                    tableroVacio[Integer.parseInt(vertical)][Integer.parseInt(horizontal)] = tablero[Integer.parseInt(vertical)][Integer.parseInt(horizontal)];
                    aciertos++;
                }
                for (i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {

                        System.out.print(tableroVacio[i][j] + "\t");
                    }
                    System.out.println();
                }
            }
            if (aciertos==10) {
                System.out.println("HUNDISTE TODOS LOS BARCOS,¿DESEA REPETIR? SI/NO");
                Scanner sc = new Scanner(System.in);
                String repetir = sc.nextLine();
                if (repetir.equals("SI")){
                    aciertos=0;
                    repeat=true;
                }
            }
    }
}
}
}