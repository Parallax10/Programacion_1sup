//padre
class Animal {
    void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}
//hija 1
class Perro extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("El perro ladra: ¡Guau guau!");
    }
}
//hija 2
class Gato extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("El gato maúlla: ¡Miau!");
    }
}
public class Main {
    public static void main(String[] args) {
        // Crear un objeto de tipo Perro
        Animal miPerro = new Perro();
        miPerro.hacerSonido(); // Llama al método sobrescrito en Perro

        // Crear un objeto de tipo Gato
        Animal miGato = new Gato();
        miGato.hacerSonido(); // Llama al método sobrescrito en Gato

        // Crear un objeto de tipo Animal (superclase)
        Animal miAnimal = new Animal();
        miAnimal.hacerSonido(); // Llama al método original de Animal
    }
}

