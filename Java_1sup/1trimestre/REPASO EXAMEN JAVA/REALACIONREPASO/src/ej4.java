public class ej4 {
    public static void main(String[] args) {
        int matriz1 [][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}

        };
        int matriz2 [][]={
                {9,8,7},
                {6,5,4},
                {3,2,1,}
        };
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j]*matriz2[i][j]+"\t");
            }
        }
    }
}
