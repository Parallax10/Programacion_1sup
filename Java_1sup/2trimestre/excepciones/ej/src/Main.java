import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Parking parking = new Parking("Centro", 10);
        while (true) {
            System.out.println("\n1) Entrada coche  2) Salida coche  3) Mostrar parking  4) Salir");
            System.out.print("Elija opción: ");
            int opcion;
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida.");
                continue;
            }

            try {
                if (opcion == 1) {
                    System.out.print("Matrícula: ");
                    String matricula = scanner.nextLine();
                    System.out.print("Plaza: ");
                    int plaza = scanner.nextInt();
                    parking.entrada(matricula, plaza);
                    System.out.println("Coche aparcado.");
                } else if (opcion == 2) {
                    System.out.print("Matrícula: ");
                    String matricula = scanner.nextLine();
                    System.out.println("Coche retirado de plaza " + parking.salida(matricula));
                } else if (opcion == 3) {
                    System.out.println(parking);
                } else if (opcion == 4) {
                    break;
                } else {
                    System.out.println("Opción no válida.");
                }
            } catch (ParkingException e) {
                System.out.println("Error: " + e.getMessage() + " (Matrícula: " + e.getMatricula() + ")");
            } catch (Exception e) {
                System.out.println("Error inesperado: " + e.getMessage());
            }
        }
    }
}