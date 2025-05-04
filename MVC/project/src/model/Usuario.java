package model;

import java.time.LocalDate;

public class Usuario {
    private String dni;
    private String nombre;
    private String telefono;
    private LocalDate fechaRegistro;

    public Usuario(String dni, String nombre, String telefono, LocalDate fechaRegistro) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.fechaRegistro = fechaRegistro;
    }

    // Getters y Setters
    public String getDni() { return dni; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }
    public LocalDate getFechaRegistro() { return fechaRegistro; }

    @Override
    public String toString() {
        return nombre + " (" + dni + ")";
    }
}