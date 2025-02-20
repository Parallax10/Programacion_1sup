import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {
        System.out.println("La Palabras es" +" "+ Palabras("Mondongo"));
        System.out.println("La Palabras es" +" "+ Palabras("Goku"));
        System.out.println("La Palabras es" +" "+ Palabras("Alonso"));

    }
    static int Palabras(String... Palabras){
        int numeroPalabras = 0;
        System.out.println("Que inicial quieres probar?");
        Scanner sc = new Scanner(System.in);
        char inicial=sc.next().charAt(0);
        char iniciales=Palabras[0].charAt(0);
        if (iniciales==inicial){
            numeroPalabras++;
        }


        return numeroPalabras;
    }
}