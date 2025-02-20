import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
       Integer[]arraycompleta={1,2,2,2,3,3,4,5,5,5,6,6};
       Set<Integer>Sinduplicados=new LinkedHashSet<>(Arrays.asList(arraycompleta));
       Integer[]sinduplicadosarray= Sinduplicados.toArray(new Integer[0]);
       System.out.println(Arrays.toString(arraycompleta));
       System.out.println(Arrays.toString(sinduplicadosarray));
    }
}