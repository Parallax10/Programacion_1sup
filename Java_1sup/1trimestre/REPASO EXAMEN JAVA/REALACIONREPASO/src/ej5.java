import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        int numero=0;
        System.out.println("Dame un numero y vere si es antropomorfico");
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        int mumeroelevado=0;
        mumeroelevado=numero*numero;
        String numerostring=String.valueOf(numero);
        String mumeroelevadostring=String.valueOf(mumeroelevado);

        if (mumeroelevadostring.endsWith(numerostring)){
            System.out.println("es antropomorfico");
        }else{
            System.out.println("no es antropomorfico");
        }

    }
}
