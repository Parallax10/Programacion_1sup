public class Main {
    public static void main(String[] args) {
        coche c1 = new coche("Toyota", "GT86");
        motor m1 = new motor(120,6,"H");
        coche c2 = new coche("Chevrolet", "Corvette c7");
        motor m2 = new motor(450,8,"V");

        c1.infocoche();
        m1.infomotor();
        c2.infocoche();
        m2.infomotor();
    }
}