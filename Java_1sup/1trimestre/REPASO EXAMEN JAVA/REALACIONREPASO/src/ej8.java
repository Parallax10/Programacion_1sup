import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        System.out.println("Dame una frase en minusculas y te dire si es un palindromo");
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        String frasereverso=new StringBuilder(frase).reverse().toString();
       System.out.println(frasereverso);
       System.out.println(frase);
    }
}
