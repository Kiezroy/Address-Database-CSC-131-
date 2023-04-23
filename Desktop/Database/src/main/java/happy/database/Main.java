package happy.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection conn = DriverManager.getConnection(
            "jdbc:mysql://aws.connect.psdb.cloud/addressbook?sslMode=VERIFY_IDENTITY",
            "3jlke4r0babpcd8hmfn9",
            "pscale_pw_Ij5BGNbGcOjpltbUBBNTAs7wHohNnan3wqbhhZXdXd7")) {
            
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
