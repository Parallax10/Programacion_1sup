public class coche {
    int año;
    String marca, modelo;

    public coche(int año, String marca, String modelo) {
        this.año = año;
        this.marca = marca;
        this.modelo = modelo;
    }
    public void infocoche(){
        System.out.println("El coche es marca: "+marca+" y modelo: "+modelo+" del año:"+año);
    }

    public int getAño() {
        return año;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
