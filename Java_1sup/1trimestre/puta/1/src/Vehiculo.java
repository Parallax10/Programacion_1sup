public class Vehiculo {
    private String marca, modelo;
    private int añoProduccion;


    public Vehiculo(String marca, String modelo, int añoProduccion) {
        this.marca = marca;
        this.modelo = modelo;
        this.añoProduccion = añoProduccion;
    }
    public void mostrarInformacion(){
        System.out.println("El vehículo es de la marca: " + marca + ", es el modelo: " + modelo + " y se puso en producción en el año: " + añoProduccion );
    }
}


class coche extends Vehiculo {
    private int numPuertas, capPersonas;


    public coche(String marca, String modelo, int añoProduccion, int numPuertas, int capPersonas) {
        super(marca, modelo, añoProduccion);
        this.numPuertas = numPuertas;
        this.capPersonas = capPersonas;
    }


    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tiene " + numPuertas + " puertas y capacidad para " + capPersonas + " personas");
    }
}
class moto extends Vehiculo {
    private int añoFabricacion;
    private String sidecar;


    public moto(String marca, String modelo, int añoProduccion, String sidecar, int añoFabricacion) {
        super(marca, modelo, añoProduccion);
        this.sidecar = sidecar;
        this.añoFabricacion = añoFabricacion;
    }


    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Se fabricó en el año  "+ añoFabricacion + " y  " + sidecar + " tiene sidecar");
    }
}



