import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       int num1,num2;
       System.out.print("Ingrese un numero: ");
       Scanner sc1 = new Scanner(System.in);
       num1 = sc1.nextInt();
       System.out.print("Ingrese el 2  numero: ");
       Scanner sc2 = new Scanner(System.in);
       num2 = sc2.nextInt();
       if (num1>num2){
           System.out.println("El numero 1 es mayor  ");
       }
       else if (num1<num2){
           System.out.println("El numero 2  es mayor  ");
       }
       if (num1==num2){
           System.out.println("son iguales ");
       }
       else if (num1!=num2){
           System.out.println("no son iguales el primero es " + num1 + " y el segundo " + num2);
       }
       if (num1>=num2){
           System.out.println("El numero 1 es  mayor o igual al 2 siendo el 1: " + num1);
       }
       if (num1<=num2){
           System.out.println("El njumero 1 es menor o igual al 2 siendo el 1: " + num1);
       }
    }
}