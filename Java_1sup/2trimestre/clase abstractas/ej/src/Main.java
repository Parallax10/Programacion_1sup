public class Main {
    public static void main(String[] args) {
        TrabajoPintura t1 =new TrabajoPintura("Paco","Luis",500,50);
        RevisionAlarma r1= new RevisionAlarma("Paco","Luis",500);

        System.out.println(t1.CosteManohobra());
        System.out.println( t1.CosteMaterial());
        System.out.println(t1.CosteTotal());
        System.out.println( t1.DetalleServicio());



       System.out.println(r1.CosteManohobra());
       System.out.println(r1.CosteMaterial());
       System.out.println(r1.CosteTotal());
       System.out.println(r1.DetalleServicio());




    }
}