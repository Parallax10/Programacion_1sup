public class Main {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico("Mi Zoológico");
        Zona felinos = new Zona("01FEL", "Felinos", 400);
        zoo.agregarZona(felinos);

        Instalacion inst1 = new Instalacion(143, "Jaula amplia con dos árboles", 2012, felinos);
        zoo.agregarInstalacion(inst1);

        Animal simba = new Animal("SI-01", "Simba", "León", 2015, inst1);
        Animal nala = new Animal("NA-12", "Nala", "Leona", 2016, inst1);
        zoo.agregarAnimal(simba);
        zoo.agregarAnimal(nala);

        Trabajador ana = new Trabajador("33445566H", "Ana García Rojas", "Veterinaria");
        zoo.agregarTrabajador(ana);

        Asignacion asignacion1 = new Asignacion(ana, felinos, "Lunes y miércoles de 9 a 12");
        zoo.agregarAsignacion(asignacion1);

        zoo.listarInstalaciones();
        zoo.listarAnimales();
        zoo.listarZonasPorTrabajador("33445566H");
    }
}