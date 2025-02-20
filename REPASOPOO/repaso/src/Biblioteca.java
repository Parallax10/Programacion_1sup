import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    public void interfaz(){
        System.out.println("Selecciona la accion \n Agregar libro:1 \n Agregar socio:2 \n Listar libros:3\n Prestar libro:4 \n Devolver Libro:5");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        switch(opcion){
            case 1:
                agregarLibro();
                break;
            case 2:
                agregarSocio();
                break;
            case 3:
                listarLibros();
                break;
            case 4:
                prestarLibro();
                break;
            case 5:
                devolverLibro();
                break;
            default:
                System.out.println("Opcion no valida");
                break;

        }
    }
    public void agregarLibro(){
        String AtributoISBN="",Titulo="",Autor="";
        int añoPublicacion=0;
        boolean Disponible=false;
        System.out.println("Ingrese el ISBN del libro:");
        Scanner sc = new Scanner(System.in);
        AtributoISBN=sc.nextLine();
        System.out.println("Ingrese el Titulo del libro:");
        Titulo=sc.nextLine();
        System.out.println("Ingrese el Autor del libro:");
        Autor=sc.nextLine();
        System.out.println("Ingrese el año de publicacion del libro:");
        añoPublicacion=sc.nextInt();
        System.out.println("Ingrese si esta  disponible del libro true/false:");
        Disponible=sc.nextBoolean();
        Libro nombreLibro =new Libro(AtributoISBN,Titulo,Autor,añoPublicacion,Disponible);
    }
    public void agregarSocio(){
        String Idsocio="",Nombre="",Direccion="",Telefono="";
        System.out.println("Ingrese el ID del Socio:");
        Scanner sc = new Scanner(System.in);
        Idsocio=sc.nextLine();
        System.out.println("Ingrese el Nombre del Socio:");
        Nombre=sc.nextLine();
        System.out.println("Ingrese el Direccion del Socio:");
        Direccion=sc.nextLine();
        System.out.println("Ingrese el Telefono del Socio:");
        Telefono=sc.nextLine();
        Socio nombre=new Socio(Idsocio,Nombre,Direccion,Telefono);
        System.out.println("¡se a agregado de forma correcta!");
    }
    public  void listarLibros(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el nombre del socio");
        String nombre=sc.nextLine();
        for (Socio socio : socios) {
            if(socio.getNombre().equals(nombre)){
                ArrayList<Libro> libros = socio.getLibro();
                for (Libro libro : libros) {
                    System.out.println(libro);
                }
            }
        }
    }
    public void prestarLibro(){}
    public void devolverLibro(){}

}
