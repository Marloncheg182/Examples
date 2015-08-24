package JDBC.Statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Oleg Romanenchuk on 8/13/2015.
 */
public class JDBCStatementUpdateExample {
    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_CONNECTION = "jdbc:mysql:localhost//33033/examples";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";
    public static void main(String[] args) {

        try {

            updateRecordIntoDbUserTable();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

    }

    private static void updateRecordIntoDbUserTable() throws SQLException {

        Connection connection = null;
        Statement statement = null;

        String updateTableSQL = "UPDATE USER"
                + " SET USERNAME = 'oleg_new' "
                + " WHERE USER_ID = 1";

        try {
            connection = getDBConnection();
            statement = connection.createStatement();

            System.out.println(updateTableSQL);

            // execute update SQL stetement
            statement.execute(updateTableSQL);

            System.out.println("Record is updated to USER table!");

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        } finally {

            if (statement != null) {
                statement.close();
            }

            if (connection != null) {
                connection.close();
            }

        }

    }

    private static Connection getDBConnection() {

        Connection connection = null;

        try {

            Class.forName(DB_DRIVER);

        } catch (ClassNotFoundException e) {

            System.out.println(e.getMessage());

        }

        try {

            connection = DriverManager.getConnection(
                    DB_CONNECTION, DB_USER, DB_PASSWORD);
            return connection;

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return connection;

    }

}