import java.util.ArrayList;
import java.util.List;

class Zoologico {
    private String nombre;
    private List<Zona> zonas = new ArrayList<>();
    private List<Instalacion> instalaciones = new ArrayList<>();
    private List<Animal> animales = new ArrayList<>();
    private List<Trabajador> trabajadores = new ArrayList<>();
    private List<Asignacion> asignaciones = new ArrayList<>();

    public Zoologico(String nombre) {
        this.nombre = nombre;
    }

    public void agregarZona(Zona zona) {
        zonas.add(zona);
    }
    public void agregarInstalacion(Instalacion instalacion) {
        instalaciones.add(instalacion);
    }
    public void agregarAnimal(Animal animal) {
        animales.add(animal);
    }
    public void agregarTrabajador(Trabajador trabajador) {
        trabajadores.add(trabajador);
    }
    public void agregarAsignacion(Asignacion asignacion) {
        asignaciones.add(asignacion);
    }

    public void listarInstalaciones() {
        for (Instalacion i : instalaciones) {
            System.out.println("Instalación: " + i.getNumero() + ", Año: " + i.getAñoInstalacion() + ", Descripción: " + i.getDescripcion() + ", Zona: " + i.getZona().getNombre());
        }
    }

    public void listarAnimales() {
        for (Animal a : animales) {
            System.out.println("Animal: " + a.getNombre() + ", Especie: " + a.getEspecie() + ", Nacido en: " + a.getAnioNacimiento() + ", Instalación: " + a.getInstalacion().getNumero() + ", Zona: " + a.getInstalacion().getZona().getNombre());
        }
    }

    public void listarZonasPorTrabajador(String dni) {
        for (Asignacion a : asignaciones) {
            if (a.getTrabajador().getDni().equals(dni)) {
                System.out.println("Trabajador: " + a.getTrabajador().getNombre() + ", Especialidad: " + a.getTrabajador().getEspecialidad());
                System.out.println("Zona: " + a.getZona().getNombre() + ", Horario: " + a.getHorario());
            }
        }
    }
}
