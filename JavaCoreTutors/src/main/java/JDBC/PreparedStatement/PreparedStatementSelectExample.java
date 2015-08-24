package JDBC.PreparedStatement;

import java.sql.*;

/**
 * Created by Oleg Romanenchuk on 8/15/2015.
 */
public class PreparedStatementSelectExample {
    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_CONNECTION = "jdbc:mysql:localhost//33033/examples";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    public static void main(String[] args) {
        try {
            selectRecordFromTable();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
    private static void selectRecordFromTable()throws SQLException{
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        String selectSQL = "SELECT USER_I, USERNAME FROM BUSER WHERE USER_ID = ?";
        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(selectSQL);
            preparedStatement.setInt(1, 1002);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                String userid = resultSet.getString("USER_ID");
                String username = resultSet.getString("USERNAME");

                System.out.println("userid : " + userid);
                System.out.println("username : " + username);
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally {
            if (preparedStatement !=null){
                preparedStatement.close();
            }
            if (connection !=null){
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
            connection = DriverManager.getConnection(DB_CONNECTION, DB_USER,DB_PASSWORD);
            return connection;
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return connection;
    }
}
