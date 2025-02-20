public class Main {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante(1, "javier", 3.33);
        Estudiante estudiante2 = new Estudiante(2, "angel", 4.69);
        Estudiante estudiante3 = new Estudiante(3, "pablo", 6.9);

        estudiante2.setPromedio(5.2);

        estudiante1.mostarinfo();
        estudiante2.mostarinfo();
        estudiante3.mostarinfo();
    }
}
