public class Estudiante {
    private int id;
    private String nombre;
    private double promedio;

    public Estudiante(int id, String nombre, double promedio) {
        if (id <= 0) {
            System.out.println("El ID debe ser un número mayor que 0");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("El nombre no puede estar vacío");
        }
        if (promedio < 0 || promedio > 10) {
            System.out.println("El promedio debe estar entre 0 y 10");
        }

        this.id = id;
        this.nombre = nombre;
        this.promedio = promedio;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setNombre(String nombre) {
        if (nombre == null) {
            System.out.println("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
    }

    public void setPromedio(double promedio) {
        if (promedio < 0 || promedio > 10) {
            System.out.println("El promedio debe estar entre 0 y 10");
        }
        this.promedio = promedio;
    }

    public boolean aprobado() {
        return promedio >= 5;
    }

    public void mostarinfo() {
        String aprobado = aprobado() ? "Sí" : "No";
        System.out.println("ID: "+id+" Nombre: " + nombre +" Promedio: "+promedio +" Aprobado: "+ aprobado);
    }
}




