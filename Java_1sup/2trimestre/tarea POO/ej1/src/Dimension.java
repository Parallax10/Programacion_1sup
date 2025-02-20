public class Dimension {
    double alto,ancho,profundidad;
    int volumen;
    public Dimension() {
        this.alto = 0;
        this.ancho = 0;
        this.profundidad = 0;
    }

    public Dimension(double alto, double ancho, double profundidad) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    public double getAlto() {
        return alto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }
    public void calcularvolumen(){
        volumen = (int)(alto*ancho*profundidad);
    }
    public String mostrarmedidas(){
    return "Alto: "+alto+", ancho: "+ancho+", profundidad: "+profundidad + "Volumen: "+volumen;
    }
}
