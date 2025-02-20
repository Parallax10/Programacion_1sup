import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num,fact;
        fact=1;
        System.out.println("introduce un numero  y te dire su serie factorial");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}