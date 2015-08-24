package JDBC.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Oleg Romanenchuk on 8/15/2015.
 */
public class PreparedStatementCreateExample {
    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_CONNECTION = "jdbc:mysql:localhost//33033/examples";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    public static void main(String[] args) {
        try {
            createTable();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    private static void createTable()throws SQLException{
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        String createTableSQL = "CREATE TABLE USER(" + "USER_ID NUMBER(5) NOT NULL, "
                + "USERNAME VARCHAR(20) NOT NULL, "
                + "CREATED_BY VARCHAR(20) NOT NULL, "
                + "CREATED_DATE DATE NOT NULL, " + "PRIMARY KEY (USER_ID) "
                + ")";
        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(createTableSQL);

            System.out.println(createTableSQL);

            preparedStatement.executeUpdate();

            System.out.println("Table \"user\" is created!");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally {
            if (preparedStatement !=null){
                preparedStatement.close();
            }
            if (connection != null){
                preparedStatement.close();
            }
        }
    }
    private static Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName(DB_DRIVER);
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try {
            connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
            return connection;
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return connection;
    }
}
