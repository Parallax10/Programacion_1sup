public class Main {
    public static void main(String[] args) {
        Estudiantes e1=new Estudiantes("Juan",16);
        Estudiantes e2=new Estudiantes("Paco",18);

        Curso c1=new Curso("1ESO","1ESO");
        Curso c2=new Curso("2ESO","2ESO");

        c1.inscribirEstudiante(e1);
        c2.inscribirEstudiante(e2);

        c1.evaluar(e1,4.99);
        c2.evaluar(e2,5.00);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}