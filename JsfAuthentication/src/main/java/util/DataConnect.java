package util;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 * Created by Dell on 7/26/2015.
 */
public class DataConnect {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:33033/examples", "root", "root");
            return connection;
        } catch (Exception e) {
            System.out.println("Database.getConnection() Error -->" + e.getMessage());
            return null;
        }
    }

    public static void close(Connection connection) {
        try {
            connection.close();
        } catch (Exception e) {
        }
    }
}
