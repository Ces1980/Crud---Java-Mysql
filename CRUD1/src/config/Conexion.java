package config;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {

    Connection con;

    public Conexion() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registro", "root", "123456");
            JOptionPane.showMessageDialog(null, "Conexión exitosa");
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "ERROR EN LA CONEXIÓN..... " + e.getMessage());

        }
    }

    public Connection getConnection() {
        return con;
    }
}
