package dao.impl;

import dao.UserDao;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Oleg Romanenchuk on 8/31/2015.
 */
public class UserDaoImpl implements UserDao
        {

        DataSource dataSource;

public DataSource getDataSource()
        {
        return this.dataSource;
        }

public void setDataSource(DataSource dataSource)
        {
        this.dataSource = dataSource;
        }

public boolean isValidUser(String username, String password) throws SQLException
        {
        String query = "Select count(1) from user where username = ? and password = ?";
        PreparedStatement pstmt = dataSource.getConnection().prepareStatement(query);
        pstmt.setString(1, username);
        pstmt.setString(2, password);
        ResultSet resultSet = pstmt.executeQuery();
        if (resultSet.next())
        return (resultSet.getInt(1) > 0);
        else
        return false;
        }

        }

