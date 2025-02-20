public class Main {

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) throws Exception {

        int contador;
        for (contador = 0; contador < 10; contador++) {
        int i,j,k,n;
        n=6;
        int numrandom = (int) (Math.random() * 6);

        String color=ANSI_RESET;
        switch (numrandom){
            case 1:
                color=ANSI_BLUE;
            break;
            case 2:
                color=ANSI_GREEN;
                break;
            case 3:
                color=ANSI_YELLOW;
                break;
            case 4:
                color=ANSI_PURPLE;
                break;
            case 5:
                color=ANSI_CYAN;
                break;
            case 6:
                color=ANSI_RED;
                break;
        }
        for(i=1; i<n+(n/2); i++){
            for(j=n+(n/2); j>i; j--){
                System.out.print(" ");}
            for(k=1; k<=2*i-1; k++){
                System.out.print(color +"*"+ ANSI_RESET);}
            System.out.println("");
        }
        for(i=1; i<n-(n/2); i++){
            for(j=n+(n/2); j>1; j--){
                System.out.print(" ");}
            for(k=n/2; k<=(n/2)+1; k++){
                System.out.print("*");}
            System.out.println("");
        } Thread.sleep(500);
        System.out.println("  ***************");
        System.out.println(" *"+ANSI_RED+" FELIZ"+ANSI_BLUE +" NAVIDAD"+ ANSI_RESET+" *");

         System.out.println("  ***************");

            Thread.sleep(500);
        }
    }
}