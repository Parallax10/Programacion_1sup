public class Ej3 {
    public static void main(String[] args) {
        System.out.println("El mayor es" +" "+ suma(1,2,3,4,5));
        System.out.println("El mayor es" +" "+ suma(12,33,52,12));
        System.out.println("El mayor es" +" "+ suma(5,3,5,1,3));
    }
    static int suma(int... numeros){
        int mayor=0;
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] > mayor){
                mayor = numeros[i];
            }

        }
        return mayor;
    }
}
