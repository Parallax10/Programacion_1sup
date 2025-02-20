public class Main {
    public static void main(String[] args) {
        coche coche1 = new coche("seat", "ibiza", 2000, 5, 5);
        moto moto1 = new moto("yamaha", "xf543", 2000, "si",2001);
        coche1.mostrarInformacion();
        moto1.mostrarInformacion();
    }
}
