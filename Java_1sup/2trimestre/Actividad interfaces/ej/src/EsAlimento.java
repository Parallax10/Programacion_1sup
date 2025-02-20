import java.time.LocalDate;

public interface EsAlimento {
    void SetCaducidad(LocalDate caducidad);
    LocalDate GetCaducidad();
    int GetCalorias();
}
