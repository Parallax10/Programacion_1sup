public class Main {
    public static void main(String[] args) {
        int contador,par,inpar;
        par=0;
        inpar=0;
        for (contador=0;contador<100;contador++){
           if (contador%2==0){
               par=par+contador;

           }else {
               inpar=inpar+contador;

           }

        }
        System.out.println("la suma de los pares es "+par);
        System.out.println("la suma de los inpares es "+inpar);
    }
}