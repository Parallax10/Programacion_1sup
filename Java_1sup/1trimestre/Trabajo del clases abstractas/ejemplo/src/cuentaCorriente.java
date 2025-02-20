public class cuentaCorriente {
    private int numeroCuenta;
    private double Balance;

    public cuentaCorriente(int numeroCuenta, double balance) {
        this.numeroCuenta = numeroCuenta;
        this.Balance = balance;
    }

    public cuentaCorriente(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public void deposito(double dinero) {
        setBalance(getBalance() + dinero);
        System.out.println("Deposito de " + dinero + "€ Realizado");

    }

    public void retiro(double dinero) {
        setBalance(getBalance() - dinero);
        if (getBalance() < dinero) {
            System.out.println("Retiro erroneo saldo insuficiente");
        } else {
            System.out.println("El valor del retiro es: " + dinero+"€");

        }
    }
}
