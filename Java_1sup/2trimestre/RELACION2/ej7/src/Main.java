public class Main {
    public static void main(String[] args) {
       persona p1 =new persona("Jacinto",18);
       persona p2 =new persona("rodofredo",50);
       profesor prof = new profesor("rosa de guadalupe");
       estudiante est=new estudiante("matematicas");
       p1.mostrarinfo();
       est.infoEstudiante();
       p2.mostrarinfo();
       prof.infoprofesor();
    }
}