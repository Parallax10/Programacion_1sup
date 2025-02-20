public class Universidad {
    private String nombre;

    public Universidad() {

    }
    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public static class Departamento {
        private String nombre;

        public Departamento() {

        }

        public Departamento(String nombre) {
            this.nombre = nombre;
        }

        public double calcularPromedioNotas(int [] notas) {
            class calcularPromedio {
                public double calcular() {
                    int media = 0;
                    for (int i = 0; i < notas.length; i++) {
                        media += notas[i];
                    }
                    return (double) (media / notas.length);
                }
            }
            calcularPromedio c = new calcularPromedio();
            return c.calcular();

        }
    }
}