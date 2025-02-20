import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String ruta = "src/Diccionario.txt";
        Diccionario d1 = new Diccionario();
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.split("-");

                    for (int i = 0; i < palabras.length; i=i+2) {
                        d1.nuevopar(palabras[i], palabras[i+1]);
                    }


            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        int npalabras;
        int aciertos=0,fallos=0;
        System.out.println("¿Cuantas palabra quiere hacer?");
        Scanner sc = new Scanner(System.in);
        npalabras = sc.nextInt();
        boolean jugar = true;
        for (int i = 0; i < npalabras; i++) {

            String palabra = d1.palabraAleatoria();
            String palabraingles=d1.traduce(palabra);
            System.out.print(palabra + ":");
            d1.primeraLetraTraduccion(palabra);
            System.out.println("indique la respuesta: ");
            String respuesta = sc.next();
            if (respuesta.equals(palabra.trim())) {
                aciertos=aciertos+1;
                System.out.println("Correcto");
            }else{
                fallos=fallos+1;
                System.out.println("Error la respuesta correcta  es : "+palabraingles);
            }
        }
        System.out.println("Total preguntas: " + npalabras);
        System.out.println("Aciertos: " + aciertos);
        System.out.println("Fallos: " + fallos);
    }

    }
