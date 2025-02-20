import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        boolean a,b;
        a=true;
        b=false;
        if(a==true && b==false){
            System.out.println("a es verdadero y b es falso");
        }
        if(a==true || b==false){
            System.out.println("a o b es falso");
        }
        if(a!=false){
            System.out.println("a es verdadero");

        }

    }
}