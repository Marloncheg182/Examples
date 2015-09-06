package com.example.dao.impl;

import com.example.dao.UserDao;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Oleg Romanenchuk on 9/2/2015.
 */
public class UserDaoImpl implements UserDao{

    DataSource dataSource;

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public boolean isValidUser(String username, String password) throws SQLException {

        String query = "Select count(1) from user where username = ? and password = ?";
        PreparedStatement statement = dataSource.getConnection().prepareStatement(query);
        statement.setString(1, username);
        statement.setString(2, password);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next())
 return (resultSet.getInt(1)>0);

        return false;
    }
}
