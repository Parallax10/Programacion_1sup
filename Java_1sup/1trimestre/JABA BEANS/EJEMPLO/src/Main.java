public class Main {
    public static void main(String[] args) {
    cuentabancaria c1 = new cuentabancaria("Paco",1500,1 );
        cuentabancaria c2 = new cuentabancaria("migue",2020,2 );

    c1.setSalario(33);
    c2.setSalario(200);

    System.out.println("cuenta 1:" + " "+c1.getTitular()+ " Saldo "+c1.getSalario()+ " numero de cuenta "+c1.getNcuenta());

    System.out.println("cuenta 2:" +  " "+c2.getTitular()+ " saldo "+c2.getSalario()+ " numero de cuenta "+c2.getNcuenta());
    }
}