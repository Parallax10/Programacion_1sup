import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduce el tamaño de la piramide invertida");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int altura, i;
        altura = num;

        for (altura = 1; altura <=num ; altura++) {
            for (i = altura; i <= num; i++){
                System.out.print("*");
            }
            System.out.println(" ");

        }
        System.out.println("Toma tu triángulo alrevés");
    }
}
