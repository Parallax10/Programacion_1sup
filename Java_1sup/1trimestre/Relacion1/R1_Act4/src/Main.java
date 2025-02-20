import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, sum;
        sum=0;
        System.out.println("Introduce un numero");
        Scanner n1 = new Scanner(System.in);
        int num1 = n1.nextInt();
        for (i = 1; i <= num1; i++) {
            if (i % 2 == 0) {
                sum=sum + i;

            }
        }
        System.out.println("la suma de los pares es "+sum);
    }
}