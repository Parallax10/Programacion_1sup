import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        System.out.println("introduce el divisor");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        try {
            int op=1;
            op=op/num;
            System.out.println("divisor valido");

        }catch (Exception e) {
            throw new ArrayIndexOutOfBoundsException("El divisor es 0 o menor que 0");

        }finally {
            System.out.println("Programa finalizado");
        }
    }
}
