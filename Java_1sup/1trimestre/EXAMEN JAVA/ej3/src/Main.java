import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numerousuario[];
        //pedimos numero al usuario
        System.out.println("Ingrese un numero ");
        Scanner sc = new Scanner(System.in);
        numerousuario = new int[]{sc.nextInt()};
        //bucles para la suma
        for(int i = 0; i < numerousuario.length; i++) {
            for (int j = 0; j < numerousuario.length; j++) {
                //si es menor que 9 se imprime el mismo numero, no se puede sumar digitos si solo hay 1 digito
                if (numerousuario[i] < 9) {
                    System.out.println("Tu numero es: " + numerousuario[i] + " no tiene digitos a sumar");
                }
                //si es mayor que 9 se suma
                if (numerousuario[i] > 9) {
                    int suma = numerousuario[i] + numerousuario[j];
                    System.out.println(suma);
                }
            }
        }
    }
}