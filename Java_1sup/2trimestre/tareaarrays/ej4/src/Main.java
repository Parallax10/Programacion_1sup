import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] arrayoriginal={1,2,3,4,5,6,7,8,9};

        int contadorpares=0;
        for (int i = 0; i < arrayoriginal.length; i++) {
            if(arrayoriginal[i]%2==0){
                contadorpares++;
            }
        }
        int [] pares= new int[contadorpares];
        int indicepares=0;
        for (int i = 0; i < pares.length; i++) {
            if(arrayoriginal[i]%2==0){
                pares[indicepares++]+=arrayoriginal[i];

            }
        }
        int [] paresrotados= new int[pares.length];
        for (int i = 0; i < pares.length; i++) {
            int nuevaposicion=(i-2+pares.length)%pares.length;
            paresrotados[nuevaposicion]=pares[i];
        }
        indicepares=0;
        for (int i = 0; i < arrayoriginal.length; i++) {
            if(arrayoriginal[i]%2==0){
                arrayoriginal[i]=paresrotados[indicepares++];
            }
        }
        System.out.println(Arrays.toString(arrayoriginal));
    }
}