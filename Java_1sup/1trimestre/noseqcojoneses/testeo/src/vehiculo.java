//padre vehículo
class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int año;


    public Vehiculo(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    //mostrar información vehículo
    public String mostrarInformacion() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año;
    }
}

//hija coches
class Coche extends Vehiculo {
    private int cantidadPuertas;
    private int capacidadPersonas;


    public Coche(String marca, String modelo, int año, int cantidadPuertas, int capacidadPersonas) {
        super(marca, modelo, año);
        this.cantidadPuertas = cantidadPuertas;
        this.capacidadPersonas = capacidadPersonas;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + ", Puertas: " + cantidadPuertas + ", Capacidad: " + capacidadPersonas + " personas";
    }
}

//hija motos
class Moto extends Vehiculo {
    private boolean tieneSidecar;


    public Moto(String marca, String modelo, int año, boolean tieneSidecar) {
        super(marca, modelo, año);
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion() + ", Sidecar: " + (tieneSidecar ? "Sí" : "No");
    }
}