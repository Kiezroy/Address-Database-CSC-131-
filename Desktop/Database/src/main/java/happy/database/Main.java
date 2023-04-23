package happy.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection conn = DriverManager.getConnection(
            "jdbc:mysql://aws.connect.psdb.cloud/addressbook?sslMode=VERIFY_IDENTITY",
            "f267yyd9m4x0qnn5szpw",
            "pscale_pw_2RFVL7jNESTmcLKSHMHL2Ik9mRfxDqdaYNwvW0y33dV")) {
            
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
