final class Punto {
    // Atributos final para garantizar inmutabilidad
    private final double x;
    private final double y;

    // Constructor
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Métodos getter (no setter)
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Método para operaciones (ej: distancia a otro punto)
    public double distancia(Punto otro) {
        if (otro == null) {
            throw new IllegalArgumentException("El punto no puede ser null");
        }
        double dx = this.x - otro.x;
        double dy = this.y - otro.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Punto)) return false;
        Punto punto = (Punto) o;
        return Double.compare(punto.x, x) == 0 &&
                Double.compare(punto.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return 31 * Double.hashCode(x) + Double.hashCode(y);
    }

    @Override
    public String toString() {
        return "Punto(" + x + ", " + y + ")";
    }
}


class TestPunto {
    public static void main(String[] args) {

        Punto p1 = new Punto(3.0, 4.0);
        Punto p2 = new Punto(6.0, 8.0);

        System.out.println("Punto 1: " + p1.getX() + ", " + p1.getY());
        System.out.println("Punto 2: " + p2.getX() + ", " + p2.getY());

        System.out.println("Distancia entre puntos: " + p1.distancia(p2));

        Punto p3 = new Punto(3.0, 4.0);
        System.out.println("p1 equals p3? " + p1.equals(p3));


        System.out.println(p1);
    }
}