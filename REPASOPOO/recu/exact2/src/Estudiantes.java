public class Estudiantes {
    String nombre;
    int edad;
    double nota;

    public Estudiantes(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public  double obtenerCalificacion(){
        return getNota();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Estudiantes{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", nota=" + nota +
                '}';
    }
}
