import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] nombres = {"juan", "paco", "javier", "fenando", "menganito"};

        int[] edades = {18, 22, 15, 33, 13};

        System.out.println("Mayores de edad:");

        int i = 0;
        for (int edad : edades) {
            if (edad >= 18) {
                System.out.println( nombres[i]+" "+  edad + " años");
            }
            i++;
        }

        System.out.println("Menores de edad:");
        i = 0;

        for (int edad : edades) {
            if (edad < 18) {
                int contador=5;
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite o nombre: ");
                String nombre = sc.nextLine();
                System.out.println("Digite o edad: ");

            }
            i++;
        }
    }
}
