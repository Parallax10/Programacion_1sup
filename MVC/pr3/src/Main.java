import vista.VistaBiblioteca;
import controlador.ControladorBiblioteca;
import modelo.DatabaseManager;

public class Main {
    public static void main(String[] args) {
        DatabaseManager dbManager = new DatabaseManager();
        VistaBiblioteca vista = new VistaBiblioteca();
        ControladorBiblioteca controlador = new ControladorBiblioteca(vista, dbManager);
        vista.setVisible(true);
    }
}
 