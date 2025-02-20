import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //variables con las letras y numeros
        char[] letrasmayusculas = {'A', 'B', 'D', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] letraminuscula = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Introduce un texto y vere si cumple los requisitos: ");
        Scanner sc = new Scanner(System.in);
        String[] texto = new String[]{sc.nextLine()};
        //booleanos para indicar los requisitos que estan correctos
        boolean valido1 = false;
        boolean valido2 = false;
        boolean valido3 = false;
        boolean valido4 = false;
        //revisamos longutud mayor que 8
        for (int i = 0; i < texto.length; i++) {
            if (texto[i].length() >= 8) {
                valido1 = true;
            }
        }
        //revisamos que tenga mayusculas
        for (int i = 0; i < texto.length; i++) {
            for (int j = 0; j < texto[i].length(); j++) {
                if (texto[i].contains("'A', 'B', 'D', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'")) {
                    valido2 = true;
                    break;
                }
            }
        }
        //revisamos que tenga minusculas
        for (int i = 0; i < texto.length; i++) {
            for (int j = 0; j < texto[i].length(); j++) {
                if (texto[i].contains("'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'")) {
                    valido3 = true;
                    break;
                }
            }
        }
        //revisamos que tenga numeros
        for (int i = 0; i < texto.length; i++) {
            for (int j = 0; j < texto[i].length(); j++) {
                if (texto[i].equals(numeros)) {
                    valido4 = true;
                    break;
                }
            }
        }
//segun las cosas validas mostramos unas opciones o otras
        if (valido1 && valido2 && valido3 && valido4) {
            System.out.println("El texto es valido");
        }
        if (valido1 == false) {
            System.out.println("El texto no es valido: No tiene mas de 8 carcteres");
        }
        if (valido2 == false) {
            System.out.println("El texto no es valido: No tiene mayusculas");
        }
        if (valido3 == false) {
            System.out.println("El texto no es valido: No tiene minusculas");
        }
        if (valido4 == false) {
            System.out.println("No tiene numeros");
        }

    }
    }
