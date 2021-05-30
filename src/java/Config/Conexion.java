package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public Connection getConexion() {

        try {
            
           // Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/alertaCovid? serverTimezone=UTC", "root", "123");
            return conexion;

        } catch (SQLException e) {
            System.out.println(e.toString());
            return null;

        }

    }

}
