import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Introduce un numero y te dire si es par o inpar");
        Scanner n1 = new Scanner(System.in);
        int num1 = n1.nextInt();
        if (num1%2==0) {
            System.out.println("es par");
        } else{
            System.out.println("es impar");
        }
    }
}