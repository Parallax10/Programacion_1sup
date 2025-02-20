import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("introduce el primer numero");
        Scanner n1 = new Scanner(System.in);
        int num1 = n1.nextInt();
        System.out.println("introduce el segundo numero");
        Scanner n2 = new Scanner(System.in);
        int num2 = n2.nextInt();
        if (num1>0) {
            int result=num1*num2;
            System.out.println("era positivo se multiplican: "+ result);
        }else{
            int result=num1+num2;
            System.out.println("era negativo se suman: "+result);
        }
                   
        }
    }
