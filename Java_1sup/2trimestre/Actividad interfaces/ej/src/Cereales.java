import java.time.LocalDate;

public class Cereales implements EsAlimento{
    String marca;
    double precio;
    String TipoCereal;
    double descuento;
    LocalDate Caducidad;
    int calorias;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipoCereal() {
        return TipoCereal;
    }

    public void setTipoCereal(String tipoCereal) {
        TipoCereal = tipoCereal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public LocalDate getCaducidad() {
        return Caducidad;
    }

    public void setCaducidad(LocalDate caducidad) {
        Caducidad = caducidad;
    }

    public int getCalorias() {
        if (TipoCereal == "Espelta"){
            return 5;
        } else if (TipoCereal == "maiz") {
            return 8;
        }else if (TipoCereal == "trigo") {
            return 12;
        }else{
            return 15;
        }

    }



    @Override
    public void SetCaducidad(LocalDate caducidad) {
    caducidad = caducidad;
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
        return "Cereales{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", TipoCereal='" + TipoCereal + '\'' +
                ", descuento=" + descuento +
                ", Caducidad=" + Caducidad +
                ", calorias=" + calorias +
                '}';
    }
}
