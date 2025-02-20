import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tablero tablero = new Tablero();
        boolean continuar = true;
        do {
            System.out.println("¿Que desea hacer? " + "\n" + "1 mover arriba " + "\n" + "2 mover abajo" + "\n" + "3 mover izquierda" + "\n" + "4 mover derecha "+"\n"+"5 Rendirse");
            tablero.mostrartablero();
            Scanner sc = new Scanner(System.in);
            int accion = sc.nextInt();
            switch (accion) {
                case 1:
                    tablero.arriba();
                    tablero.añadir2();
                    tablero.terminado();
                    break;
                case 2:
                    tablero.abajo();
                    tablero.añadir2();
                    tablero.terminado();
                    break;
                case 3:
                    tablero.izquierda();
                    tablero.añadir2();
                    tablero.terminado();
                    break;
                case 4:
                    tablero.derecha();
                    tablero.añadir2();
                    tablero.terminado();
                    break;
                case 5:
                    continuar = false;
            }
        }while (continuar==true);
    }
}