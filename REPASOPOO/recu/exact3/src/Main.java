import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int eleccion=0;
        //productos y inventarios para probar
        Producto p1= new Producto("p1","Escopeta",27.00,30);
        Producto p2= new Producto("p2","Coche",7.00,12);
        Producto p3= new Producto("p3","impresora",2.00,45);
        Producto p4= new Producto("p4","peluca",2.01,54);
        Producto p5= new Producto("p5","ps5",25.30,87);
        Producto p6= new Producto("p6","cargador",57.00,955);
        Producto p7= new Producto("p7","municion",67.00,456);

        Inventario i1=new Inventario();
        i1.agregarProducto(p1);
        i1.agregarProducto(p2);
        i1.agregarProducto(p3);
        i1.agregarProducto(p4);
        i1.agregarProducto(p5);
        i1.agregarProducto(p6);
        i1.agregarProducto(p7);
        //
        do {
            System.out.println("Elije la opcion");
            System.out.println("1 Agregar Producto");
            System.out.println("2 Vender Producto");
            System.out.println("3 Eliminar Producto");
            System.out.println("4 Ver Productos");
            System.out.println("5 Salir");
            Scanner sc = new Scanner(System.in);
            eleccion = sc.nextInt();
            Scanner sc1 = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            switch (eleccion) {
                case 1:
                    System.out.println("Introduzca el nombre del producto");
                    String nombre = sc1.next();
                    System.out.println("Introduzca el precio del producto");
                    double precio = sc1.nextDouble();
                    System.out.println("Introduzca el cantidad del producto");
                    int cantidad = sc1.nextInt();
                    Producto p10 = new Producto("p10", nombre, precio, cantidad);
                    i1.agregarProducto(p10);
                    break;
                case 2:
                    System.out.println("Introduzca el Codigo del producto");
                    String codigo = sc2.next();
                    System.out.println("Introduzca la cantidad del producto que desea vender");
                    int cantidadvender = sc2.nextInt();
                    i1.venderProducto(codigo, cantidadvender);
                    break;
                case 3:
                    System.out.println("Introduzca el nombre del producto");
                    String nombre2 = sc2.next();
                    i1.eliminarProducto(nombre2);
                    break;
                case 4:
                    System.out.println(i1.toString());
                    break;
                case 5:
                    System.out.println("Adios");
            }
        }while (eleccion != 5);
    }
}