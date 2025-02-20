public abstract class Detergente implements ConDescuento,ESLiquido{
    String Marca;
    double Precio;
    String TipoEnvase;
    double volumen;
    double descuento;

    public Detergente(String marca, Double precio, String tipoEnvase) {
        Marca = marca;
        Precio = precio;
        TipoEnvase = tipoEnvase;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    public String getTipoEnvase() {
        return TipoEnvase;
    }

    public void setTipoEnvase(String tipoEnvase) {
        TipoEnvase = tipoEnvase;
    }

    @Override
    public double GetVolumen() {
        return 0;
    }
    @Override
    public void SetVolumen(double volumen){
        volumen = volumen;
    }
    @Override
    public void SetTipoEnvase(String envase){
        TipoEnvase = envase;
    }
    @Override
    public String GetTipoEnvase(){
        return TipoEnvase;
    }
    @Override
    public void SetDescuento(double descuento){
        descuento = descuento;
    }
    @Override
    public double GetDescuento(){
        return descuento;
    }
    @Override
    public double GetPrecioDescuento(){
        return Precio-descuento;
    }

    @Override
    public String toString() {
        return "Detergente{" +
                "Marca='" + Marca + '\'' +
                ", Precio=" + Precio +
                ", TipoEnvase='" + TipoEnvase + '\'' +
                ", volumen=" + volumen +
                ", descuento=" + descuento +
                '}';
    }
}
