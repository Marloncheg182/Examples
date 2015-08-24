package JDBC.Statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Oleg Romanenchuk on 8/13/2015.
 */
public class JDBCStatementInsertExample {
    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_CONNECTION = "jdbc:mysql:localhost//33033/examples";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";
    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    public static void main(String[] args) {
        try {
            insertRecordIntoTable();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    private static void insertRecordIntoTable() throws SQLException{
        Connection connection = null;
        Statement statement = null;

        String insertTableSQL = "INSERT INTO USER" + "(USER_ID, USERNAME, CREATED_BY, CREATED_DATE) "
                + "VALUES" + "(1, 'oleg', 'system', " + "to_date('" + getCurrentTimeStamp() + "', 'yyyy/mm/dd hh24:mi:ss'))";
        try {
            connection = getDBConnection();
            statement = connection.createStatement();

            System.out.println(insertTableSQL);

            statement.executeUpdate(insertTableSQL);
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
            connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
            return connection;
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return connection;
    }

    private static String getCurrentTimeStamp(){
        Date today = new Date();
        return dateFormat.format(today.getTime());
    }


}
