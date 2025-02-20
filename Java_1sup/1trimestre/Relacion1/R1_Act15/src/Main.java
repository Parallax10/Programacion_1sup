import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        double raiz,result1, result2;
        System.out.println("introduce los datos para la ecuacion de 2 grado en orden A , B, C");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        raiz=(Math.sqrt(b^2-4*a*c));
        if (raiz>0){
            result1=(-b+raiz)/(2*4);
            result2=(-b-raiz)/(2*4);
            System.out.println("el primer resultado es " +result1);
            System.out.println("el segundo resultado es " +result2);
        }else{
            System.out.println("La raiz no es real vuelva a ejecutar con otros valores");
        }

    }
}