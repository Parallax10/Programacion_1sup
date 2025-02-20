import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Ingresa el numero de horas del trabajador");
        Scanner inp1 = new Scanner(System.in);
        int horas = inp1.nextInt();
        int pagar = horas * 10;
        System.out.println("El numero de horas del trabajador es: " + horas + " Corresponde pagar: " + pagar);
    }
}