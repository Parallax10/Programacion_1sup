import Controlador.Batalla;
import Model.Arquero;
import Model.DAO.PersonajeDAO;
import Model.DatabaseConnection;
import Model.Guerrero;
import Model.Personaje;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Personaje p1=new Personaje("Castro",30,5);
        Personaje p2=new Personaje("Manuel",40,3);
        Guerrero guerrero=new Guerrero(p1);
        Arquero arquero=new Arquero(p2);
        Batalla batalla=new Batalla();
        batalla.Pelea(p1,p2);

        try(Connection conn= DatabaseConnection.getConnection()){
            PersonajeDAO pd=new PersonajeDAO();
            pd.guardarPersonaje(conn,p1);
            System.out.println("pito");

        }catch (SQLException e){
            System.out.println("zorra");
            e.printStackTrace();
        }

    }
}