package JDBC.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Oleg Romanenchuk on 8/15/2015.
 */
public class PreparedStatementBatchUpdateExample {
    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_CONNECTION = "jdbc:mysql:localhost//33033/examples";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    public static void main(String[] args) {
        try {

            batchInsertRecordsIntoTable();

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

    }

    private static void batchInsertRecordsIntoTable() throws SQLException {

        Connection dbConnection = null;
        PreparedStatement preparedStatement = null;

        String insertTableSQL = "INSERT INTO USER"
                + "(USER_ID, USERNAME, CREATED_BY, CREATED_DATE) VALUES"
                + "(?,?,?,?)";

        try {
            dbConnection = getDBConnection();
            preparedStatement = dbConnection.prepareStatement(insertTableSQL);

            dbConnection.setAutoCommit(false);

            preparedStatement.setInt(1, 101);
            preparedStatement.setString(2, "oleg123");
            preparedStatement.setString(3, "system");
            preparedStatement.setTimestamp(4, getCurrentTimeStamp());
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 102);
            preparedStatement.setString(2, "oleg456");
            preparedStatement.setString(3, "system");
            preparedStatement.setTimestamp(4, getCurrentTimeStamp());
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 103);
            preparedStatement.setString(2, "oleg789");
            preparedStatement.setString(3, "system");
            preparedStatement.setTimestamp(4, getCurrentTimeStamp());
            preparedStatement.addBatch();

            preparedStatement.executeBatch();

            dbConnection.commit();

            System.out.println("Record is inserted into USER table!");

        } catch (SQLException e) {

            System.out.println(e.getMessage());
            dbConnection.rollback();

        } finally {

            if (preparedStatement != null) {
                preparedStatement.close();
            }

            if (dbConnection != null) {
                dbConnection.close();
            }

        }

    }

    private static Connection getDBConnection() {

        Connection dbConnection = null;

        try {

            Class.forName(DB_DRIVER);

        } catch (ClassNotFoundException e) {

            System.out.println(e.getMessage());

        }

        try {

            dbConnection = DriverManager.getConnection(
                    DB_CONNECTION, DB_USER, DB_PASSWORD);
            return dbConnection;

        } catch (SQLException e) {

            System.out.println(e.getMessage());

        }

        return dbConnection;

    }

    private static java.sql.Timestamp getCurrentTimeStamp() {

        java.util.Date today = new java.util.Date();
        return new java.sql.Timestamp(today.getTime());

    }

}