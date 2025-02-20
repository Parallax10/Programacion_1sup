import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num,divnum;
        divnum=0;
        System.out.println("introduce un numero y te dire su cantidad de divisores");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divnum = divnum+1;
            }
        } System.out.println("el numero " +num + " tiene "+divnum+" divisores");
    }

}