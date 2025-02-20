import java.util.HashMap;
import java.util.Random;

public class Diccionario {
    HashMap<String, String> diccionario = new HashMap<>();

    public Diccionario() {

    }

    public void nuevopar(String español, String ingles) {
        diccionario.put(español, ingles);
    }


    public String traduce(String español) {

            String palabratraducida=diccionario.get(español);

        return palabratraducida;
    }


    public String palabraAleatoria(){
        Random rand = new Random();
        int aleatoria = rand.nextInt(diccionario.size());
        String[] num =diccionario.keySet().toArray(new String[0]);

        return num[aleatoria];
    }

    public void primeraLetraTraduccion(String español) {
            char inicial = diccionario.get(español).charAt(0);
            System.out.println(inicial+"...");


    }
}




