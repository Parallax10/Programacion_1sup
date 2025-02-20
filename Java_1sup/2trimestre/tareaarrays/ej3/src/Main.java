import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
int[]array1={1,2,3,4,5,6,7,8,9};
int [] resultado=paresImpares(array1);
System.out.println(Arrays.toString(resultado));

    }

    public static int[] paresImpares(int[]array){
        int pares = 0;
        int impares = array.length-1;
        int []resultado =new int[array.length];
        for(int i=0; i<array.length; i++){
            if(array[i]%2==0){
                resultado [pares++]=array[i];
            }else{
        resultado [impares--]=array[i];
    }
}
        return resultado;
    }
}