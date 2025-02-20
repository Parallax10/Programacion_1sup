import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String usuario = "admin";
        String contrasena = "admin";

        int intentos = 3;


        Scanner scanner = new Scanner(System.in);

        while (intentos > 0) {

            System.out.print("Ingrese su usuario: ");
            String usuarioIngresado = scanner.nextLine();

            System.out.print("Ingrese su contraseña: ");
            String contrasenaIngresada = scanner.nextLine();

            if (usuarioIngresado.equals(usuario) && contrasenaIngresada.equals(contrasena)) {
                System.out.println("Usiario y contraseña correctos conectando con su cuenta");
                break;
            } else {
                intentos--;
                System.out.println("Usuario o contraseña incorrectos Intentos restantes: " + intentos);

                if (intentos == 0) {
                    System.out.println("Ha superado el número máximo de intentos. Su cuenta está bloqueada.");
                }
            }
        }
    }
}