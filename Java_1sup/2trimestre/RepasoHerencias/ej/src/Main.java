public class Main {
    public static void main(String[] args) {
        Electrodomesticos Lavadora =new Electrodomesticos("kawasaki",150.5,"Lavadora");
        Electrodomesticos Lavadora2 =new Electrodomesticos("yamaha",200,"Lavadora");

        System.out.println( Lavadora.getConsumo(50));
        System.out.println( Lavadora2.getConsumo(150));

        System.out.println(Lavadora.getCosteConsumo(50,2));
        System.out.println(Lavadora2.getCosteConsumo(150,2));

        Lavadora lavadora=new Lavadora(Lavadora.getMarca(),Lavadora.getPotencia(),500,true,Lavadora.getTipo());
        Lavadora lavadora2=new Lavadora(Lavadora.getMarca(),Lavadora.getPotencia(),Lavadora.getTipo());

        System.out.println(lavadora.getConsumo(50));
        System.out.println(lavadora2.getConsumo(150));

        System.out.println(lavadora.toString());
        System.out.println(lavadora2.toString());

    }
}