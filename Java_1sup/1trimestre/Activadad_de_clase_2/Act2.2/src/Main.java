import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("introduce el nombre del alummno ");
        Scanner Name = new Scanner(System.in);
        String nombre = Name.nextLine();
        System.out.println("Ingrese el primer numero");
        Scanner inp1 = new Scanner(System.in);
        float num1 = inp1.nextInt();
        System.out.println("Ingrese el segundo numero");
        Scanner inp2 = new Scanner(System.in);
        float num2 = inp2.nextInt();
        System.out.println("Ingrese el tercer numero");
        Scanner inp3 = new Scanner(System.in);
        float num3 = inp3.nextInt();
        float media = (num1 + num2 + num3) / 3;
        System.out.println("La nota media"+ nombre + " es: " + media);
    }
}