public class cuentabancaria {
    //atributos
    String titular;
    int salario,ncuenta;


    public cuentabancaria(String titular, int salario, int ncuenta) {
        this.titular = titular;
        this.salario = salario;
        this.ncuenta = ncuenta;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    public int getNcuenta() {
        return ncuenta;
    }
    public void setNcuenta(int ncuenta) {
        this.ncuenta = ncuenta;
    }

}
