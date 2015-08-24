package JDBC.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Oleg Romanenchuk on 8/15/2015.
 */
public class PreparedStatementUpdateExample {
    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_CONNECTION = "jdbc:mysql:localhost//33033/examples";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "root";

    public static void main(String[] args) {
        try {
            updateRecordTable();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void updateRecordTable() throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        String updateTableSQL = "UPDATE USER SET USERNAME = ? "
                + " WHERE USER_ID = ?";

        try {
            connection = getConnection();
            preparedStatement = connection.prepareStatement(updateTableSQL);

            preparedStatement.setString(1, "oleg_new");
            preparedStatement.setInt(2, 1002);

            preparedStatement.executeUpdate();

            System.out.println("Record is updated to USER table!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (connection != null)
                connection.close();
        }
    }

    private static Connection getConnection() {
    Connection connection = null;
    try {
        Class.forName(DB_DRIVER);
    } catch (ClassNotFoundException e) {
        System.out.println(e.getMessage());
    }
    try {
        connection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
        return connection;
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
    return connection;
}
}
