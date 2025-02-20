import java.util.Scanner;

//fibonacci
public class Main {
    public static void main(String[] args) {
        System.out.println("Introduce un numero y te dire su numero en fibonacci");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       int a,b,siguiente;
       siguiente = 0;
       a=1;
       b=1;
       if (num >= 1){
           System.out.println(a);
       }
       if (num >= 1){
           System.out.println(b);
       }
        for (int i = 3; i <= num; i++) {
            siguiente=a+b;
            System.out.println(siguiente);
            a=b;
            b=siguiente;
        }

    }
}