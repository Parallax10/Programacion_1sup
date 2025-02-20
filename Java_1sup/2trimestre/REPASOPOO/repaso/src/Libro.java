public class Libro extends Producto{
    String AtributoISBN,Titulo,Autor;
    int añoPublicacion;
    boolean disponible;

    public Libro(String atributoISBN, String titulo, String autor, int añoPublicacion, boolean disponible) {
        AtributoISBN = atributoISBN;
        Titulo = titulo;
        Autor = autor;
        this.añoPublicacion = añoPublicacion;
        disponible = disponible;
    }

    public String getAtributoISBN() {
        return AtributoISBN;
    }

    public void setAtributoISBN(String atributoISBN) {
        AtributoISBN = atributoISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public void prestarLibro() {
        setDisponible(false);
    }
    public void devolverLibro() {
        setDisponible(true);
    }
}
