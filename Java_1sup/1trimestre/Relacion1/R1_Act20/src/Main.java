import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dame un numero y te hare un marco");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        for (int i = 1; i <= numero; i++) { //top
            System.out.print("*");
        }
        System.out.println(" "); //final marco arriba
        for (int i = 1; i <= numero-2; i++) { //lateral izquierdo
            System.out.print("*");
            for (int j = 1; j <= numero-2; j++) { //relleno marco
                System.out.print(" ");
            }
            System.out.print("*"); //lateral derecho
            System.out.println(" "); //si no se pone se ralla ns pq
        }
        for (int i = 1; i <= numero; i++) { //parte baja
            System.out.print("*");
        }
    }
}