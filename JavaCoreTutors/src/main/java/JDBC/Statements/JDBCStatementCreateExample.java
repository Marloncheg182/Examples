package JDBC.Statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Oleg Romanenchuk on 8/13/2015.
 */
public class JDBCStatementCreateExample {
    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_CONNECTION = "jdbc:mysql:localhost//33033/examples";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    public static void main(String[] args) {

        try {
            createTableSQL();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    private static void createTableSQL() throws SQLException{
        Connection connection = null;
        Statement statement = null;

        String createTableSQL = "CREATE TABLE USER(" + "USER_ID NUMBER(5) NOT NULL, " + "USERNAME VARCHAR(20) NOT NULL, "
                + "CREATED_BY VARCHAR(20) NOT NULL, " + "CREATED_DATE DATE NOT NULL, " + "PRIMARY KEY (USER_ID) " +")";
        try {
            connection = getDBConnection();
            statement = connection.createStatement();

            System.out.println(createTableSQL);

            statement.execute(createTableSQL);

            System.out.println("Table is created");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally {
            if (statement !=null){
                statement.close();
            }
            if (connection !=null){
                connection.close();
            }
        }
    }
    private static Connection getDBConnection(){
        Connection connection = null;
        try {
            Class.forName(DB_DRIVER);
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try {
            connection = DriverManager.getConnection(DB_CONNECTION,DB_USER,DB_PASSWORD);
            return connection;
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return connection;
    }
}
