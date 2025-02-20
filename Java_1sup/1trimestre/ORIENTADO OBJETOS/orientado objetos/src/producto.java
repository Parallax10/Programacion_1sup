public class producto {

        //atributos
        String nombre;
        int cantidad,precio;
        public void calculartotal(){
            int total=cantidad*precio;
            //para llamar a un atributo en la clase donde se define el objeto se us this. y el atributo que quieras usar
            System.out.println("el total "+ "del producto " + this.nombre + " es " +total);

        }

        public producto(String nombre, int cantidad, int precio) {
            this.nombre = nombre;
            this.cantidad = cantidad;
            this.precio = precio;
        }
}

