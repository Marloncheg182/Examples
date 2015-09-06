package com.example.dao;

import java.sql.SQLException;

/**
 * Created by Oleg Romanenchuk on 9/2/2015.
 */
public interface UserDao {
    public boolean isValidUser(String username, String password)throws SQLException;
}
