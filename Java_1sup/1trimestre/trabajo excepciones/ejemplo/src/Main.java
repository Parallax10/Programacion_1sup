import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Introduce un numero para dividir 50");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        try {
            int result = 50/num;
            System.out.println("division realizada");

        }catch(ArithmeticException e) {
            System.out.println("Error no se puede dividir entre 0");
        }finally {
            System.out.println("Programa terminado");
        }
    }
}
