import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numerousuario;
        System.out.println("Ingrese un numero y lo pasare a binario");
        Scanner sc = new Scanner(System.in);
        //pedimos numero al usuario
        numerousuario = sc.nextInt();
        while(numerousuario > 0){
            //si es par ponermos un 0
           if (numerousuario%2==0){
               System.out.print("0");
               numerousuario=numerousuario/2;
               //si es impar ponemos un 1
           }else{
               System.out.print("1");
               numerousuario=numerousuario/2;
           }

        }
    }
}