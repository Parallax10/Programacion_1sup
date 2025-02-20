public class persona {
    //atributos
    String nombre;
    int edad;
    public void saludar(){
        System.out.println("hola buenas tardes");

    }
    public void complirano() {
        this.edad ++;
    }
    public persona() {

    }

    public persona(String nombre, int edad) {
       this.nombre = nombre;
        this.edad = edad;
    }
}
