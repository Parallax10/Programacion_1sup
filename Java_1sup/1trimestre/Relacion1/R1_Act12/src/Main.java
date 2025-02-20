import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int inverso=0;
        double unidades=0;
        System.out.println("dime un numero y te lo invierto");
        Scanner sc = new Scanner(System.in);
        double numero = sc.nextInt();
        do {
            unidades = numero%10;
            numero=Math.floor(numero/10);
            inverso=(int)(inverso*10 + unidades);

        }while (numero != 0);
        System.out.println(inverso);
    }
}