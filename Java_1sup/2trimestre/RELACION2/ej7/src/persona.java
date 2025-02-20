public class persona {
String nombre;
int edad;

    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrarinfo() {
        System.out.println("Nombre: " + nombre+" Tiene "+edad +" años");
    }
}

