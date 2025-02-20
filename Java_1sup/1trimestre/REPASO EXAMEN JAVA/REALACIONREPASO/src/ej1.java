import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        System.out.println("Introduce el 1 numero");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Introduce el 2 numero");
        int num2 = sc.nextInt();
        int division=0;
        while (num1>=num2){
            num1=num1-num2;
            division++;
        }
        System.out.println("El resultado es: "+division);
    }
}