import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("¿Como quieres que se llame el archivo?");
        Scanner sc = new Scanner(System.in);
        String Narchivo = sc.nextLine();
        String nombreArchivo = Narchivo+".txt";
        System.out.println("¿Que deseas escribir en el archivo?");
        String textoAEscribir = sc.nextLine();

        try (FileWriter escritor = new FileWriter(nombreArchivo, false)) {
            // false indica que se sobre escribe el texto del  archivo si este existe para que no lo sobre escriba usar true
            escritor.write(textoAEscribir);
            System.out.println("Texto añadido al archivo exitosamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo.");
            e.printStackTrace();
        }
        System.out.println("¿Deseas encriptar el archivo? y/n");
        String Encripta = sc.nextLine();
        String textocifrado="";
        if (Encripta.equals("y")) {
            System.out.println("Que clave desea usar?");
            int clave=sc.nextInt();
            boolean error=false;
            char [] caracteres= textoAEscribir.toCharArray();

            for (int i = 0; i < caracteres.length; i++) {
                char[] caracteresenasci = new char[]{(char) (caracteres[i] + clave)};

                try (FileWriter escritor = new FileWriter(Narchivo+"encriptado.txt",true)) {
                    // false indica que se sobre escribe el texto del  archivo si este existe para que no lo sobre escriba usar true
                    escritor.write(caracteresenasci);

                } catch (IOException e) {
                    e.printStackTrace();
                    error=true;
                }

            }
            if (error==true) {
                System.out.println("Ocurrió un error al escribir en el archivo.");
            }else{
                System.out.println("Texto añadido al archivo exitosamente.");
            }


        }
    }
}
