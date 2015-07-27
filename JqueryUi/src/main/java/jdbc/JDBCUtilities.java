package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Dell on 7/26/2015.
 * JDBC Singleton for Connection
 */
public class JDBCUtilities {

    private static Connection connection = null;

    public static Connection getConnection(){
        if (connection !=null)
            return connection;
     else {
            String dbURL = "jdbc.mysql://localhost/examples";
            try {
                Class.forName("com.mysql.jdbc.Driver");

                connection = DriverManager.getConnection(dbURL, "root", "root");
            }catch (Exception e){
                e.printStackTrace();
            }
            return connection;
        }
    }
}
