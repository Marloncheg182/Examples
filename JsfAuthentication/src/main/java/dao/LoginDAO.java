package dao;

import util.DataConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Dell on 7/26/2015.
 */
public class LoginDAO {
    public static boolean validate(String user, String password){
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = DataConnect.getConnection();
            preparedStatement = connection.prepareStatement("SELECT uname, password FROM users WHERE uname = ? AND password = ?");
            preparedStatement.setString(1, user);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Login error -->" + e.getMessage());
            return false;
        } finally {
            DataConnect.close(connection);
        }
        return false;
    }
}
