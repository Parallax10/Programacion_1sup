import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num,min,max;
        num=3;
        min=100;
        max=0;
        while ( num!=0 ){
            System.out.println("Introduce un numero, se guardara el mayor y el menos hasta que introduzcas 0");
            Scanner sc1 = new Scanner(System.in);
            num=sc1.nextInt();
            if ( num>max){
                max=num;
            }else if ( num<min && num!=0 ){
                min=num;
            }
        }
        System.out.println("El mayor es "+max);
        System.out.println("El menor es "+min);
    }
}