import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int cifras=0;
        System.out.println("dime un numero y te dire sus cifras");
        Scanner sc = new Scanner(System.in);
        double numero = sc.nextInt();
        if (numero<9){
            System.out.println("El numero de cifras es: 1 ");
        }
        if (numero>9){}
        while (numero != 0) {
            numero=Math.floor(numero/10);
            cifras=cifras+1;

        }
        if (cifras%2==0){
            System.out.println("El numero de cifras es: "+cifras);
        }else {
            System.out.println("El numero de cifras es: *"+cifras+ "*");
        }
    }
}