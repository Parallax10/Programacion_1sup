public class Main {
    public static void main(String[] args) {
        System.out.println("Numeros" +" "+ suma(1,2,3,4,5));
        System.out.println("Numeros" +" "+ suma(12,33,52,12));
        System.out.println("Numeros" +" "+ suma(5,3,5,1,3));
    }
    static int suma(int... numeros){
        int sumar=0;
        for (int i = 0; i < numeros.length; i++){

           sumar += numeros[i];
        }
        return sumar;
    }
}