import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        float area;
        System.out.println("Introduce el radio del circulo");
        Scanner inp1 = new Scanner(System.in);
        double radio = inp1.nextInt();
        double pi = Math.PI;
        area=(float) (pi*radio*radio);
        System.out.println("El area del circulo es: "+area);

    }
}