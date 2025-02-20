import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ano;
        System.out.println("introduce un año y te dire si es bisiesto");
        Scanner sc = new Scanner(System.in);
        ano = sc.nextInt();
        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
            System.out.println(ano + " es bisiesto");
        }else {
            System.out.println(ano + " no es bisiesto");
        }

    }
}