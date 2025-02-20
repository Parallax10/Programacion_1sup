import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int usernum;
        int contadornumero=0;
        int numerolanzamientos=0;
        //pedimos numero al usuario
        System.out.println("Ingrese el numero que quieres revisar cuantas veces sale: ");
        Scanner sc = new Scanner(System.in);
        usernum = sc.nextInt();
//bucle para que tire 100 veces
        for (int i = 100; i >0; i--) {
            //generacion numeros random
            int numrandom1= (int) (Math.random()*6);
            int numrandom2= (int) (Math.random()*6);
            int sumadado= numrandom1+numrandom2;
            System.out.println(sumadado);
            //recuento de veces que se tiran los dados
            numerolanzamientos++;
            if (usernum == sumadado) {
                contadornumero++;
            }
        }
        System.out.println("tu numero ha salido: "+contadornumero+" veces en "+numerolanzamientos+ " lanzamientos de dado");
    }
}