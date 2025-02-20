import java.time.LocalDate;

public class Vino implements ConDescuento,EsAlimento,ESLiquido{
    String nombre;
    String TipoVino;
    int Alcohol;
    double Precio;
    double descuento;
    double volumen;
    String Envase;
    LocalDate Caducidad;
    int calorias;

    public Vino(String nombre, String tipoVino, int alcohol, double precio, double descuento, double volumen, String envase, LocalDate caducidad, int calorias) {
        this.nombre = nombre;
        TipoVino = tipoVino;
        Alcohol = alcohol;
        Precio = precio;
        this.descuento = descuento;
        this.volumen = volumen;
        Envase = envase;
        Caducidad = caducidad;
        this.calorias = calorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoVino() {
        return TipoVino;
    }

    public void setTipoVino(String tipoVino) {
        TipoVino = tipoVino;
    }

    public int getAlcohol() {
        return Alcohol;
    }

    public void setAlcohol(int alcohol) {
        Alcohol = alcohol;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    @Override
    public void SetDescuento(double descuento) {
descuento = descuento;
    }

    @Override
    public double GetDescuento() {
        return descuento;
    }

    @Override
    public double GetPrecioDescuento() {
        return Precio-descuento;
    }

    @Override
    public void SetVolumen(double volumen) {
volumen = volumen;
    }

    @Override
    public double GetVolumen() {
        return volumen;
    }

    @Override
    public void SetTipoEnvase(String envase) {
envase = envase;
    }

    @Override
    public String GetTipoEnvase() {
        return Envase;
    }

    @Override
    public void SetCaducidad(LocalDate caducidad) {
caducidad = Caducidad;
    }

    @Override
    public LocalDate GetCaducidad() {
        return Caducidad;
    }

    @Override
    public int GetCalorias() {
        return calorias;
    }

    @Override
    public String toString() {
        return "Vino{" +
                "nombre='" + nombre + '\'' +
                ", TipoVino='" + TipoVino + '\'' +
                ", Alcohol=" + Alcohol +
                ", Precio=" + Precio +
                ", descuento=" + descuento +
                ", volumen=" + volumen +
                ", Envase='" + Envase + '\'' +
                ", Caducidad=" + Caducidad +
                ", calorias=" + calorias +
                '}';
    }
}
