public static void main(String[] args) {

    universidad uni = new universidad("universidad de sevilla");

    universidad.Departamento informatica = uni.new Departamento("Informática");
    universidad.Departamento electronica = uni.new Departamento("Electronica");

    System.out.println("Evento 1:");
    informatica.organizarEvento("Taller de juegos", 5);

    System.out.println("\nEvento 2:");
    electronica.organizarEvento("Arduino basico", 8);
}