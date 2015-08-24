package JDBC.PreparedStatement;

import java.sql.*;
import java.util.*;
import java.util.Date;

/**
 * Created by Oleg Romanenchuk on 8/15/2015.
 */
public class PreparedStatementInsertExample {
    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_CONNECTION = "jdbc:mysql:localhost//33033/examples";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    public static void main(String[] args) {
        try {
            insertRecordIntoTable();
        }catch (SQLException e ){
            System.out.println(e.getMessage());
        }
    }

    private static void insertRecordIntoTable()throws SQLException{
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        String insertTableSQL = "INSERT INTO USER"
                + "(USER_ID, USERNAME, CREATED_BY, CREATED_DATE) VALUES"
                + "(?,?,?,?)";
        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(insertTableSQL);

            preparedStatement.setInt(1,11);
            preparedStatement.setString(2, "oleg");
            preparedStatement.setString(3, "system");
            preparedStatement.setTimestamp(4, getCurrentTimeStamp());

            preparedStatement.executeUpdate();

            System.out.println("Recod is inserted into USER table!");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally {
            if (preparedStatement !=null){
                preparedStatement.close();
            }
            if (connection != null){
                connection.close();
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

    private static Timestamp getCurrentTimeStamp(){
        java.util.Date today = new Date();
        return new Timestamp(today.getTime());
    }
}
