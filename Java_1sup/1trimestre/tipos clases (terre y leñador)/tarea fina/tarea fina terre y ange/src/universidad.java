public class universidad {
    private String nombre;

    public universidad(String nombre) {
        this.nombre = nombre;
    }

    //anidada estática
    public static class Evento {
        private String nombre;
        private int duracionHoras;
        private String departamentoOrganizador;
        private double costo;

        public Evento(String nombre, int duracionHoras, String departamentoOrganizador, double costo) {
            this.nombre = nombre;
            this.duracionHoras = duracionHoras;
            this.departamentoOrganizador = departamentoOrganizador;
            this.costo = costo;
        }

        public void mostrarInformacion() {
            System.out.println("evento: " + nombre);
            System.out.println("duración: " + duracionHoras + " horas");
            System.out.println("departamento organizador: " + departamentoOrganizador);
            System.out.println("costo: " + costo+"€");
        }
    }

    //no estática
    public class Departamento {
        private String nombre;

        public Departamento(String nombre) {
            this.nombre = nombre;
        }

        public void organizarEvento(String nombreEvento, int duracionHoras) {

            //local
            class CalculadoraCosto {
                private final double TARIFA_POR_HORA = 50.0;

                public double calcularCosto() {
                    return duracionHoras * TARIFA_POR_HORA;
                }
            }

            CalculadoraCosto calculadora = new CalculadoraCosto();
            double costo = calculadora.calcularCosto();

            Evento evento = new Evento(nombreEvento, duracionHoras, this.nombre, costo);

            //anónima
            Descripcion descripcion = new Descripcion() {
                @Override
                public String generarDescripcion() {
                    return "El evento \"" + nombreEvento + "\" organizado por el Departamento de " + Departamento.this.nombre
                            + " tiene una duración de " + duracionHoras + " horas y un costo de: " + costo + "€";
                }
            };

            evento.mostrarInformacion();
            System.out.println("Descripción: " + descripcion.generarDescripcion());
        }
    }

    interface Descripcion {
        String generarDescripcion();
    }
}