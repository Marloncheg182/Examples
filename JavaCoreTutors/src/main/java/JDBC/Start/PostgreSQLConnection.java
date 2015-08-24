package JDBC.Start;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Oleg Romanenchuk on 8/13/2015.
 */
public class PostgreSQLConnection {
    public static void main(String[] args) {

        System.out.println("Connecting");
        try {
            Class.forName("org.postgresql.Driver");

        }catch (ClassNotFoundException e){
            System.out.println("Failed");
            e.printStackTrace();
            return;
        }
        System.out.println("Registered driver");

        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1/5400/test", "root", "root");
        }catch (SQLException e){
            System.out.println("Connection failed");
            e.printStackTrace();
            return;
        }
       if (connection != null){
           System.out.println("Connected");
       }else {
           System.out.println("Connection closed");
       }
    }
}
