public class Main {
    public static void main(String[] args) {
        coche c1 =new coche(1900,"toyota","corolla");

        coche c2 =new coche(2018,"Ford","Focus");
        c1.setAño(1800);
        c2.setAño(2020);
        c1.infocoche();
        c2.infocoche();

    }
}