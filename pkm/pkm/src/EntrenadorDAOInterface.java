import java.util.List;

public interface EntrenadorDAOInterface {
    void agregarEntrenador(Entrenador entrenador);
    List<Entrenador> obtenerEntrenadores();
    void actualizarEntrenador(Entrenador entrenador);
    void eliminarEntrenador(int id);
    Entrenador buscarEntrenadorPorId(int id);
}
