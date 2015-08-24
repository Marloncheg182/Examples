package JDBC.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Oleg Romanenchuk on 8/15/2015.
 */
public class PreparedStatementDeleteExample {
    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_CONNECTION = "jdbc:mysql:localhost//33033/examples";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    public static void main(String[] args) {
        try {
            deleteRecordFromTable();

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    private static void deleteRecordFromTable()throws SQLException{
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        String deleteSQL = "DELETE USER WHERE USER_I = ?";
        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(deleteSQL);
            preparedStatement.setInt(1, 1002);

            preparedStatement.executeUpdate();

            System.out.println("Record is deleted!");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally {
            if (preparedStatement != null){
                preparedStatement.close();
            }
            if (connection !=null){
                connection.close();
            }
        }
    }
    private  static Connection getConnection(){
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
