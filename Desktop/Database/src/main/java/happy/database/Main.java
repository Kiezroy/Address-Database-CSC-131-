package happy.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection conn = DriverManager.getConnection(
            "jdbc:mysql://aws.connect.psdb.cloud/addressbook?sslMode=VERIFY_IDENTITY",
            "enaxg1h5k70p71vq5hu9",
            "pscale_pw_bcUiXhoZs6LodtF3N0lcO2fcC21lbAKN3nBlXlPSjj9")) {
            
            // Print a message if the connection was successful
            if (!conn.isClosed()) {
                System.out.println("Connection to the database was successful!");
            }
            
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}
