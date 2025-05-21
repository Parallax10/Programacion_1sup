public class Main {
    public static void main(String[] args) {
        Superheroe Batman = new Superheroe("Batman");
        Batman.setDescripcion("Es batman");
        Batman.setCapa(true);
        System.out.println(Batman.toString());
        Dimension D1 =new Dimension(4.00,4.00,4.00);
        Dimension D2 =new Dimension(5.00,5.00,5.00);
        Figura Bat =new Figura("BATMAN",33.00,Batman,D1);
        Coleccion c1=new Coleccion("DC");
        c1.AñadirFigura(Bat);
        System.out.println(c1.toString());



    }
}