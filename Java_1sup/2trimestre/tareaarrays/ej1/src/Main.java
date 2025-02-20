import java.util.Arrays;

import static java.lang.System.arraycopy;

public class Main {
    public static void main(String[] args) {
int [] array={1,2,3,4,5,6,7,8};
int [] miniarray1=new int [4];
int [] miniarray2=new int [4];
int contador=miniarray1.length;
int contadora=0;
for (int i = 0;i<= miniarray1.length-1;i++){
    contador=contador-1;
    arraycopy(array,contador,miniarray1,contadora,1);
    contadora++;
}
        for (int i = 0;i<= miniarray2.length-1;i++){
            contador--;
            arraycopy(array,contador,miniarray2,contadora,1);
            contadora++;
        }

    System.out.println(Arrays.toString(miniarray1));
    System.out.println(Arrays.toString(miniarray2));
int [] fusion=new int [array.length];
arraycopy(miniarray1,0,fusion,0,4);
arraycopy(miniarray2,0,fusion,4,4);
System.out.println(Arrays.toString(fusion));
    }
}