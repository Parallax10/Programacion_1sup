public class Main {
    public static void main(String[] args) {
        producto p1 = new producto("tomate","verdura",9,33,40);
        producto p2 = new producto("Intel core I9","Tecnoogia",9,5,192);
        //seter para modificar los valores
        p1.setId(4);
        p1.setPrecio(0);
        p1.setStock(2);
        p2.setId(9);
        p2.setPrecio(400);
        p2.setStock(3);
        //comprobar precio mayor que 0 y stock mayor que 0
        boolean cumplerequisitos1, cumplerequisitos2;
        if (p1.getPrecio() <= 0) {
            cumplerequisitos1 = false;
        }else {
            cumplerequisitos1 = true;
        }
        if (p1.getStock() <= 0) {
            cumplerequisitos2 = false;
        }else {
            cumplerequisitos2 = true;
        }
        //si los requisitos son validos
        if (cumplerequisitos1==true && cumplerequisitos2==true) {
            System.out.println("El producto :" + p1.getNombre() + " del tipo: " + p1.getTipo() + " con el id: " + p1.getId() + " cuesta: " + p1.getPrecio() +"€ "+ " y hay: " + p1.getStock() + " en existencias");
        }
        //si los requisitos no son validos
        else {
        System.out.println("Lo sentimos el producto "+p1.getNombre()+ " no esta disponible o el precio es invalido, porfavor revise los valores proporcionados");
        }
        cumplerequisitos1 = false;
        cumplerequisitos2 = false;
        if (p2.getPrecio() <= 0) {
            cumplerequisitos1 = false;
        }else {
            cumplerequisitos1 = true;
        }
        if (p2.getStock() <= 0) {
            cumplerequisitos2 = false;
        }else {
            cumplerequisitos2 = true;
        }
        if (cumplerequisitos1==true && cumplerequisitos2==true) {
            System.out.println("El producto :" + p2.getNombre() + " del tipo: " + p2.getTipo() + " con el id: " + p2.getId() + " cuesta: " + p2.getPrecio() +"€ "+ " y hay: " + p2.getStock() + " en existencias");
        }
        else {
            System.out.println("Lo sentimos el producto "+p2.getNombre()+ " no esta disponible o el precio es invalido, porfavor revise los valores proporcionados");
        }
    }

}