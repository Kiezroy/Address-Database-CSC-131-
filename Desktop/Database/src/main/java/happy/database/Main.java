package happy.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (Connection conn = DriverManager.getConnection(
            "jdbc:mysql://aws.connect.psdb.cloud/addressbook?sslMode=VERIFY_IDENTITY",
            "2s8kzmqoh2x6eqtthca6",
            "pscale_pw_gZHQbFQ7wYSiSPFpa94ebriZ2QgcNXZqQy37XBn6IfF")) {
            
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
