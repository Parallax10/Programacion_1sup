import java.time.LocalDate;

public class RevisionAlarma extends Servicio{
    int AlarmasRevisar;

    public RevisionAlarma(String trabajador, String cliente,int alarmasRevisar) {
        super(trabajador, cliente);
        this.AlarmasRevisar = alarmasRevisar;
    }

    public int getAlarmasRevisar() {
        return AlarmasRevisar;
    }

    public void setAlarmasRevisar(int alarmasRevisar) {
        AlarmasRevisar = alarmasRevisar;
    }

    @Override
    public double CosteMaterial() {
        return 0;
    }

    @Override
    public double CosteManohobra() {
        return (AlarmasRevisar/3)*40;
    }

    @Override
    public double CosteTotal() {
        return CosteManohobra();
    }

    @Override
    public String DetalleServicio() {
        return "RevisionAlarma{" +
                "AlarmasRevisar=" + AlarmasRevisar +
                ", trabajador='" + trabajador + '\'' +
                ", fechainicio=" + fechainicio +
                ", cliente='" + cliente + '\'' +
                "} " + super.toString();
    }
}
