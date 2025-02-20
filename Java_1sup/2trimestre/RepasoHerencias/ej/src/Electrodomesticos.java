public class Electrodomesticos {
    String tipo;
    String marca;
    double potencia;

    public Electrodomesticos(String marca, double potencia, String tipo) {
        this.tipo = tipo;
        this.marca = this.marca;
        this.potencia = potencia;
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
    public String MostrarElectrodomesticos() {
        return "Tipo: " + tipo + ", Marca: " + marca + ", Potencia: " + potencia;
    }
    public double getConsumo(int horas){
     return potencia*horas;
    }
    public double getCosteConsumo(int horas,double costeHora){
     return potencia * horas* costeHora;
    }

}
