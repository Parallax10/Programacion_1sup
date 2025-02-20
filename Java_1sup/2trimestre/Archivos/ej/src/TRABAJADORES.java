public class TRABAJADORES {
    String especialidad,nombre,apellido,DNI;
    ASIGNACION asignacion;

    public TRABAJADORES(String especialidad, String nombre, String apellido, String DNI, ASIGNACION asignacion) {
        this.especialidad = especialidad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.asignacion = asignacion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public ASIGNACION getAsignacion() {
        return asignacion;
    }

    public void setAsignacion(ASIGNACION asignacion) {
        this.asignacion = asignacion;
    }
}
