package dao;

import model.Profile;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Dell on 7/26/2015.
 */
public class ProfileDAOImpl implements ProfileDAO{

    private Connection connection;
    private PreparedStatement preparedStatement;

    private String SQL_SELECT = "SELECT name, address FROM userLogin WHERE email = ? AND password = ?";
    private String SQL_INSERT = "INSERT INTO userLogin (name,email,password,address) VALUES (?,?,?,?)";

    @Override
    public int createProfile(Profile profile) {
        int result = 0;
        try {
            preparedStatement = connection.prepareStatement(SQL_INSERT);
            preparedStatement.setString(1, profile.getName());
            preparedStatement.setString(2, profile.getEmail());
            preparedStatement.setString(3, profile.getPassword());
            preparedStatement.setString(4, profile.getAddress());
            result = preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return result;
    }

    @Override
    public Profile loginProfile(Profile profile) {
        try {
            preparedStatement = connection.prepareStatement(SQL_INSERT);
            preparedStatement.setString(1, profile.getEmail());
            preparedStatement.setString(2, profile.getPassword());
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                profile.setName(resultSet.getString("name"));
                profile.setAddress(resultSet.getString("adress"));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return profile;
    }
}
