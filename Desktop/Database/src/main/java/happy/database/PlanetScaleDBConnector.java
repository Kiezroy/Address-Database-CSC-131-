package happy.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PlanetScaleDBConnector {
    private static Connection conn = null;

    public static Connection getConnection(String host, int port, String database, String user, String password) {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Set connection properties
            String url = "jdbc:mysql://" + host + ":" + port + "/" + database + "?user=" + user + "&password=" + password + "&useSSL=true&requireSSL=true";

            // Establish the connection
            conn = DriverManager.getConnection(url);

            // Return the connection
            return conn;
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }
        return null;
    }

    public static void closeConnection() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
