package model;

public class Libro {
    private int idLibro;
    private String titulo;
    private String autor;
    private boolean disponible;

    public Libro(int idLibro, String titulo, String autor, boolean disponible) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    // Getters y Setters
    public int getIdLibro() { return idLibro; }
    public void setIdLibro(int idLibro) { this.idLibro = idLibro; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }
    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    @Override
    public String toString() {
        return titulo + " - " + autor + (disponible ? " (Disponible)" : " (Prestado)");
    }
}