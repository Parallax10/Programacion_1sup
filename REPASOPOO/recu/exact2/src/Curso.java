import java.io.Serializable;

public class Curso implements Evaluable {
    String codigoCurso;
    String nombreCurso;
    Estudiantes estudiante;

    public Curso(String codigoCurso, String nombreCurso) {
        this.codigoCurso = codigoCurso;
        this.nombreCurso = nombreCurso;
        this.estudiante = null;
    }
    public void inscribirEstudiante(Estudiantes estudiante) {
        this.codigoCurso = getCodigoCurso();
        this.nombreCurso = getNombreCurso();
        this.estudiante = estudiante;
    }
    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public Estudiantes getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiantes estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "codigoCurso='" + codigoCurso + '\'' +
                ", nombreCurso='" + nombreCurso + '\'' +
                ", estudiante=" + estudiante +
                '}';
    }


    @Override
    public void evaluar(Estudiantes estudiantes, double calificacion) {
    estudiantes.setNota(calificacion);
    }
}
