import java.time.LocalDate;

public  class TrabajoPintura extends Servicio{

    double Superficie;
    double PrecioPintura;

    public TrabajoPintura(String trabajador,String cliente,double Superficie, double PrecioPintura) {
        super(trabajador,cliente);
        this.Superficie = Superficie;
        this.PrecioPintura = PrecioPintura;
    }

    public double getSuperficie() {
        return Superficie;
    }

    public void setSuperficie(double superficie) {
        Superficie = superficie;
    }

    public double getPrecioPintura() {
        return PrecioPintura;
    }

    public void setPrecioPintura(double precioPintura) {
        PrecioPintura = precioPintura;
    }

    @Override
    public double CosteMaterial() {
        return (getSuperficie()/7.8)*PrecioPintura;
    }

    @Override
    public double CosteManohobra() {
        return (getSuperficie()/10)*9.5;
    }

    @Override
    public double CosteTotal() {
        if (getSuperficie()<50) {
            return CosteMaterial() + CosteManohobra()*0.15;
        }else{
            return CosteMaterial() + CosteManohobra();
        }
    }

    @Override
    public String DetalleServicio() {
        return "TrabajoPintura{" +
                "cliente='" + cliente + '\'' +
                ", fechainicio=" + fechainicio +
                ", trabajador='" + trabajador + '\'' +
                "} " + super.toString();
    }

}
