package JDBC.Start;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by Oleg Romanenchuk on 8/13/2015.
 */
public class MySQLConnection {
    public static void main(String[] args) {
        System.out.println("Connecting to MySQL");
        try{
            Class.forName("com.mysql.jdbc.Driver");

        }catch (ClassNotFoundException e){
            System.out.println("Driver wasn't found");
            e.printStackTrace();
            return;
        }

        System.out.println("Driver registered!");
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql:localhost//33033/examples", "root", "root");

        }catch (SQLException e){
            System.out.println("Connection failed! Check url or name/password");
            e.printStackTrace();
            return;
        }
        if(connection !=null){
            System.out.println("Database connected!");
        }else {
            try {
                connection.close();
                System.out.println();
                System.out.println("Connection was closed");
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
