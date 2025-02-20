import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int lado1,lado2,lado3;
        System.out.println("Introduce el 1 lado de un triangulo");
        Scanner sc = new Scanner(System.in);
        lado1 = sc.nextInt();
        System.out.println("Introduce el 2 lado de un triangulo");
        Scanner sc2 = new Scanner(System.in);
        lado2 = sc2.nextInt();
        System.out.println("Introduce el 3 lado de un triangulo");
        Scanner sc3 = new Scanner(System.in);
        lado3 = sc3.nextInt();
        if(lado1==lado2 && lado1==lado3){
            System.out.println("Equilatero");
        }
        else if(lado1==lado2 || lado1==lado3 || lado2==lado3){
            System.out.println("Isosceles");
        }
        else {
            System.out.println("Escaleno");
        }
    }

}