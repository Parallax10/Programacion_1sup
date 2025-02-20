import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduce un numero");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int divisor=0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                divisor=i+divisor;
            }
        }
        if (divisor >= num) {
            System.out.println("es perfecto");
        }else{
            System.out.println("no es perfecto");
        }
    }
}