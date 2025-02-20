import java.util.ArrayList;

public class Socio {
    String Idsocio,nombre,direccion,telefono;
    ArrayList<Libro> libros;
    public void prestarLibro(Libro libro) {
       libros.add(libro);
       libro.prestarLibro();
    }
    public void devolverLibro(Libro libro) {
        if (libros.contains(libro)) {
            libros.remove(libro);
            libro.devolverLibro();
        }else{
            System.out.println("No se puede devolver el libro porque no existe");
        }
    }

    public Socio(String idsocio, String nombre, String direccion, String telefono) {
        Idsocio = idsocio;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.libros = new ArrayList<>();
    }

    public String getIdsocio() {
        return Idsocio;
    }

    public void setIdsocio(String idsocio) {
        Idsocio = idsocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public static ArrayList<Libro> getLibro() {
        return this.libros;
    }

    public void setLibro(ArrayList<Libro> libros) {
        this.libros=libros;
    }
}
