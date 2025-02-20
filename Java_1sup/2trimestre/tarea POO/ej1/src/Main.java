public class Main {
    public static void main(String[] args){
        Superheroe Spiderman = new Superheroe("Spiderman");
        Spiderman.descripcion = "Spiderman";
        Spiderman.capa= Boolean.parseBoolean("False");
        System.out.println(Spiderman.mostrar());

        Dimension DimensionesSpiderman =new Dimension(2.5,5,6);
        DimensionesSpiderman.calcularvolumen();
        System.out.println(DimensionesSpiderman.mostrarmedidas());

        Coleccion Marvel= new Coleccion("Marvel",Spiderman);
        System.out.println("Coleccion: "+Marvel.getNombreColeccion());

        Figura Spider =new Figura("1523a131",108.5,Spiderman,DimensionesSpiderman);
        System.out.println(Spider.mostrar());

    }
}