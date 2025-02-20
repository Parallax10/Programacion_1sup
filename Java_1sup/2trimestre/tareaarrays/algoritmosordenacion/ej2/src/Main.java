import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5,420};
        System.out.println("array original: " + Arrays.toString(array));
        ordenar(array, 0, array.length - 1);
        System.out.println("array ordenado: " + Arrays.toString(array));
    }
    public static void ordenar(int[] array, int menor, int mayor) {
        if (menor < mayor) {
            int pivote = comprobarmenor(array, menor, mayor);
            ordenar(array, menor, pivote - 1);
            ordenar(array, pivote + 1, mayor);
        }
    }


    private static int comprobarmenor(int[] array, int menor, int mayor) {
        int pivote = array[menor];
        int i = menor + 1;

        for (int j = i ; j <= mayor; j++) {
            if (array[j] < pivote) {
                cambiar(array, i, j);
                i++;
            }
        }
        cambiar(array, menor, i - 1);
        return i - 1;
    }

    private static void cambiar(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


}