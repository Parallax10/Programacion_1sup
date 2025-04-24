import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

final class Estudiante {
    // Atributos finales
    private final String nombre;
    private final int edad;
    private final List<String> asignaturas;

    // Constructor
    public Estudiante(String nombre, int edad, List<String> asignaturas) {
        this.nombre = nombre;
        this.edad = edad;

        this.asignaturas = new ArrayList<>(asignaturas);
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public List<String> getAsignaturas() {
        return Collections.unmodifiableList(asignaturas);
    }


    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", asignaturas=" + asignaturas +
                '}';
    }

    // crear un nuevo estudiante con una asignatura extra
    public Estudiante conNuevaAsignatura(String nueva) {
        List<String> nuevasAsignaturas = new ArrayList<>(this.asignaturas);
        nuevasAsignaturas.add(nueva);
        return new Estudiante(this.nombre, this.edad, nuevasAsignaturas);
    }

    //prueba embebida
    public static void main(String[] args) {
        List<String> materias = Arrays.asList("Matemáticas", "Historia", "Física");
        Estudiante e1 = new Estudiante("Ana", 20, materias);

        System.out.println("Estudiante original:");
        System.out.println(e1);

        //inmutabilidad de la lista original
        materias.set(0, "Arte"); // No afecta a e1
        System.out.println("\nDespués de modificar la lista original:");
        System.out.println(e1);

        //inmutabilidad desde el getter
        try {
            e1.getAsignaturas().add("Química");
        } catch (UnsupportedOperationException e) {
            System.out.println("\nNo se puede modificar la lista desde el getter: " + e.getMessage());
        }

        //nuevo estudiante con una asignatura extra
        Estudiante e2 = e1.conNuevaAsignatura("Química");
        System.out.println("\nNuevo estudiante con asignatura extra:");
        System.out.println(e2);
    }
}
