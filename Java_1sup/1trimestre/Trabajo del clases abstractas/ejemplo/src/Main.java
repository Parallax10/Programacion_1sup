public class Main {
    public static void main(String[] args) {
        cuentaCorriente c1 =new cuentaCorriente(1,900);
        c1.setBalance(1000);
        System.out.println("El saldo de la cuenta "+c1.getNumeroCuenta() +" es de "+c1.getBalance());
        c1.deposito(45.1);
        c1.retiro(600000);
    }
}