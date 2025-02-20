public class Main {
    public static void main(String[] args) {
     Universidad un1 = new Universidad("Terre tu puta madre");
       Universidad.Departamento dep1 =new Universidad.Departamento("ME VOY A SUICIDAR");
       int []notas ={5,2,1,2,3,4,2,9,3,2,};
       System.out.println(dep1.calcularPromedioNotas(notas));
    }
}