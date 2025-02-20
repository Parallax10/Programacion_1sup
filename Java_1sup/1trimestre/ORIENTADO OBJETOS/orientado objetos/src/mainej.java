public class mainej {
    public static void main(String[] args) {
        producto tomate = new producto("tomate", 12, 33);
        producto lavadora = new producto("lavadora", 30, 12);
        tomate.calculartotal();
        lavadora.calculartotal();
    }
}
