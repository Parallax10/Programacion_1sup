import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean error = false;
        int clave=3;
        Scanner sc = new Scanner(System.in);

        //pedir la ruta del archivo al usuario
        System.out.println("Por favor, introduce la ruta completa del archivo que deseas leer:");
        String rutaArchivo = sc.nextLine(); // tiene que ser asi la ruta C:\\Users\\TuUsuario\\Documents\\archivo.txt

        //leer el archivo utilizando BufferedReader
        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea=lector.readLine();
            char[] caracteres = linea.toCharArray();
            System.out.println("Contenido del archivo:CIFRADO");
            System.out.println("Desea desencriptar el archivo? y/n");
            if (sc.nextLine().equals("y")) {
                System.out.println("Cual es la clave de descifrado?");
                clave = sc.nextInt();
                System.out.println("Como quieres nombrar al archivo con el contenido descifrado?");
                Scanner sc1 = new Scanner(System.in);
                String nombrearchivo = sc1.nextLine();
                for (int i = 0; i < caracteres.length; i++) {
                    char[] caracteresenasci = new char[]{(char) (caracteres[i] - clave)};
                    try (FileWriter escritor = new FileWriter(nombrearchivo+".txt",true)) {
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
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo. Verifica la ruta y el archivo.");
            e.printStackTrace();
        }
    }
}
