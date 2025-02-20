import java.util.Scanner;

class Ahorcado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // palabras posibles
        String[] palabras = {"JAVA", "COMPUTADORA", "PROGRAMACION", "AHORCADO", "VARIABLE"};

        // selecciona palabra aleatoria
        String palabraSecreta = palabras[(int) (Math.random() * palabras.length)];

        //pasa a caracter las letras de la palabra
        char[] palabraAdivinada = new char[palabraSecreta.length()];
        //poner _ segun el numro de letras
        for (int i = 0; i < palabraAdivinada.length; i++) {
            palabraAdivinada[i] = '_';
        }
        //numero de vidas y si la palabra esta completa
        int intentosRestantes = 6;
        boolean palabraCompleta = false;

       System.out.println("BIENVENIDO AL JUEGO DEL AHORCADO");
        //bucle para repetir el juego
        while (intentosRestantes > 0 && !palabraCompleta) {
            System.out.println("Palabra: " + new String(palabraAdivinada));
            System.out.println("Intentos restantes: " + intentosRestantes);
            System.out.print("Ingresa una letra: ");

            // leer letra del usuario
            char letra = scanner.nextLine().toUpperCase().charAt(0);

           //pone el acierto en falso cada q se ejecute
            boolean acierto = false;
            //sustituir _ por la letra adivinada
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    // comprobar si la letra está en la palabra secreta
                    palabraAdivinada[i] = letra;
                    acierto = true;
                }
            }
            //si fallas la letra te quita 1 vida
            if (!acierto) {
                intentosRestantes--;
                System.out.println("La letra no está en la palabra.");
            } else {
                System.out.println("¡Bien! La letra está en la palabra.");
            }

            // comprobar si ha adivinado la palabra
            palabraCompleta = true;
            for (int i = 0; i < palabraAdivinada.length; i++) {
                //si en la palabra hay algun _ no esta completa
                if (palabraAdivinada[i] == '_') {
                    palabraCompleta = false;
                    break;
                }
            }
        }


        if (palabraCompleta) {
            System.out.println("Has adivinado la palabra era: " + palabraSecreta);
        } else {
            System.out.println("Te has quedado sin vidas. La palabra era: " + palabraSecreta);
        }

        scanner.close();
    }
}
