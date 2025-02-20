import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int []array={5,9,8,4,3,1,2};
        int pos=0;
        for(int j=array.length;j!=0;j--) {
            for (int i = 0; i < array.length-1; i++) {

                if (array[i] > array[i + 1]) {
                    pos=array[i];
                    array[i]=array[i+1];
                    array[i+1]=pos;
                }
            }
        }
        System.out.println(Arrays.toString(array));
            }

        }
