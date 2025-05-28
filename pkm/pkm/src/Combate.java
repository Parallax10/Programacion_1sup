public class Combate {
    public static int simularCombate(Pokemon p1, Pokemon p2) {
        int potencia1 = p1.calcularPotencialAtaque() + p1.getVelocidad();
        int potencia2 = p2.calcularPotencialAtaque() + p2.getVelocidad();
        return Integer.compare(potencia1, potencia2);
    }
}
