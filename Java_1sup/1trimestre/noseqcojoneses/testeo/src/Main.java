public class Main {
    public static void main(String[] args) {

        Coche coche = new Coche("Toyota", "Corolla", 2020, 4, 5);

        Moto moto = new Moto("Harley-Davidson", "Iron 883", 2018, true);

        System.out.println(coche.mostrarInformacion());
        System.out.println(moto.mostrarInformacion());
    }
}
