import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, esprimo;
        esprimo = 0;
        System.out.println("introduce un numero y te dire si es primo");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                esprimo = esprimo+1;
            }
        }
        if (esprimo == 2) {
            System.out.println("El numero es primo");
        }else {
            System.out.println("El numero no es primo");
        }
    }
}