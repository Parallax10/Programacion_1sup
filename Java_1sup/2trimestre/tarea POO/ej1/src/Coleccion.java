import java.util.ArrayList;


public class Coleccion {
    String nombreColeccion;
    Superheroe listaFiguras;

    public Coleccion(String nombreColeccion, Superheroe listaFiguras) {
        this.nombreColeccion = nombreColeccion;
        this.listaFiguras = listaFiguras;
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }
    public void AñadirFigura(Figura figura) {
        this.listaFiguras.add(figura);

    }

}
