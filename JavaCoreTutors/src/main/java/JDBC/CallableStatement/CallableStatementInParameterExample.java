package JDBC.CallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;

/**
 * Created by Oleg Romanenchuk on 8/15/2015.
 */
public class CallableStatementInParameterExample {
    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_CONNECTION = "jdbc:mysql:localhost//33033/examples";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    public static void main(String[] args) {
        try {
            call();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }


    private static void call()throws SQLException{
        Connection connection = null;
        CallableStatement callableStatement = null;

        String insertStoreProc = "{call insertUSER(?,?,?)}";
        try {
            connection = getConnection();
            callableStatement = connection.prepareCall(insertStoreProc);
            callableStatement.setInt(1, 1002);
            callableStatement.setString(2, "oleg");
            callableStatement.setString(3, "system");
            callableStatement.executeUpdate();

            System.out.println("Record is inserted into USER table!");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }finally {
            if (callableStatement != null){
                callableStatement.close();
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
            connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
            return connection;
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return connection;

    }
}
