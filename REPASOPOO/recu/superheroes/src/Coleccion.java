import java.util.ArrayList;

public class Coleccion {
    String nombreColeccion;
    ArrayList<Figura> figuras;

    public Coleccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
        figuras = new ArrayList<>();
    }

    public void  AñadirFigura(Figura nfigura){
        figuras.add(nfigura);
    }

    public void SubirPrecio(double precio, int id){
    Figura figura = figuras.get(id);
    figura.subirPrecio(precio);
    }

    public void conCapa(){
        for (int i = 0; i < figuras.size(); i++) {
            Figura figura = figuras.get(i);
            if (figura.getSuperheroe().isCapa()){
                System.out.println(figura.getSuperheroe());
            }
        }
    }
    public void masValioso(){
        Figura max = figuras.get(0);
        for (int i = 0; i < figuras.size(); i++) {
            Figura figura = figuras.get(i);
            if (figura.getPrecio()>max.getPrecio()){
                max = figura;
            }
        }
        System.out.println("La mas cara es"+max);

    }
    public void getValorColeccion(){
       double valor=0;
        for (int i = 0; i < figuras.size(); i++) {
           Figura figura = figuras.get(i);
           valor=valor+ figura.getPrecio();
       }
        System.out.println("La coleccion cuesta:"+valor);
    }
    public void getVolumen(){
        double volumen=0;
        for (int i = 0; i < figuras.size(); i++) {
            Figura figura = figuras.get(i);
            volumen=volumen+ figura.dimension.getVolumen();
        }
        volumen=volumen+200;
        System.out.println("Ocupara"+volumen+"aproximadamente");
    }


    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    @Override
    public String toString() {
        return "Coleccion{" +
                "nombreColeccion='" + nombreColeccion + '\'' +
                ", figuras=" + figuras +
                '}';
    }
}
