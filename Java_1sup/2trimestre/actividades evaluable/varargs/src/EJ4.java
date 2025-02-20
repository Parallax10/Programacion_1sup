public class EJ4 {
    public static void main(String[] args) {
        System.out.println("La Palabras es" +" "+ media(1,2,3,4,5));
        System.out.println("La Palabras es" +" "+ media(12,33,52,12));
        System.out.println("La Palabras es" +" "+ media(5,3,5,1,3));
    }
    static int media(int... numeros){
        int media =0;
        for (int i = 0; i < numeros.length; i++){
           media += numeros[i]/numeros.length;

        }
        return media;
    }
}
