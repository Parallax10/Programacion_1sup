public class ANIMALES {
    INSTALACIONES INSTALACIONES;
    String nombre,especie,codigo;
    int añoNacimiento;

    public ANIMALES(INSTALACIONES INSTALACIONES, String nombre, String especie, String codigo, int añoNacimiento) {
        this.INSTALACIONES = INSTALACIONES;
        this.nombre = nombre;
        this.especie = especie;
        this.codigo = codigo;
        this.añoNacimiento = añoNacimiento;
    }

    public INSTALACIONES getINSTALACIONES() {
        return INSTALACIONES;
    }

    public void setINSTALACIONES(INSTALACIONES INSTALACIONES) {
        this.INSTALACIONES = INSTALACIONES;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }
}
