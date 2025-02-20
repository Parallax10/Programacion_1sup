public class coche {
    String Marca, Modelo;

    public coche(String marca, String modelo) {
        Marca = marca;
        Modelo = modelo;
    }

    public void infocoche(){
        System.out.println("El coche es marca: "+Marca+" y modelo: "+Modelo);
    }
}
class motor{
    int potencia,numeropistones;
    String disposicionpistones;

    public motor(int potencia, int numeropistones, String disposicionpistones) {
        this.potencia = potencia;
        this.numeropistones = numeropistones;
        this.disposicionpistones = disposicionpistones;
    }
    public void infomotor(){
        System.out.println("El motor es un "+disposicionpistones+numeropistones+" Con "+potencia+"cv");
    }
}

