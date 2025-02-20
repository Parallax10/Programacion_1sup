public abstract class electrodomestico {
    String modelo;
    String marca;
    public void info(){
        System.out.println("info");

    }

    public electrodomestico(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
}

class lavadora extends electrodomestico{
   int capacidad;
    @Override
 public void info() {

     System.out.println("La lavadora de marca: "+ marca + " con el modelo "+ modelo +" tiene una capacidad de : "+capacidad);
 }

    public lavadora(String marca, String modelo, int capacidad) {
        super(marca, modelo);
        this.capacidad = capacidad;
    }
}
class televisor extends electrodomestico{
    int pulgadas;
    @Override
    public void info(){
        System.out.println("televisor de la marca "+marca+ " de modelo : "+modelo +"tiene "+ pulgadas+" pulgadas");
    }

    public televisor(String marca, String modelo, int pulgadas) {
        super(marca, modelo);
        this.pulgadas = pulgadas;
    }
}


