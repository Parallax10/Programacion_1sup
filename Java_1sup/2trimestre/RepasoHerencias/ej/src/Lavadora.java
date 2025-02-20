public class Lavadora extends Electrodomesticos{
    int precio;
    boolean aguaCaliente;

    public Lavadora(String marca,double potencia,String tipo){
        super(marca, potencia,tipo);
        aguaCaliente=false;

    }
    public Lavadora(String marca, double potencia, int precio, boolean aguaCaliente, String tipo) {
        super(marca, potencia,tipo);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    public int getPrecio() {
        return precio;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }
    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "tipo='" + tipo + '\'' +
                ", potencia=" + potencia +
                ", marca='" + marca + '\'' +
                ", aguaCaliente=" + aguaCaliente +
                ", precio=" + precio +
                "} " + super.toString();
    }

    public double getConsumo(int horas){
    if (aguaCaliente==false){
        return horas*potencia;
    }else {
        return horas*(potencia+potencia*0.20);
    }
    }
}
