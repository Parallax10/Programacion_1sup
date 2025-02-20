public class EJ2 {
    public static void main(String[] args) {
        System.out.println(TEXTO("Hola","soy","goku"));
        System.out.println(TEXTO("Pinocho","era","un","niño","de","madera"));
        System.out.println(TEXTO("que","sueño","quiero","cafe"));
    }
    static String TEXTO(String... texto){
        String texr="";
        String espcio=" ";
        for (int i = 0; i < texto.length; i++){
            texr += texto[i]+espcio;

        }
       return texr;

    }
}
