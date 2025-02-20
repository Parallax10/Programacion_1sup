public class Main {
    public static void main(String[] args) {
    curso c1 =new curso("Java");
    estudiantes e1 =new estudiantes("Jacinto", 12, c1.nombrecurso);
    System.out.println(e1.nombre+" de "+e1.edad+" años del curso "+e1.nombrecurso);

    }
}