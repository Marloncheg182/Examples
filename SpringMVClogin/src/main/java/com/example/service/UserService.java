package com.example.service;

import java.sql.SQLException;

/**
 * Created by Oleg Romanenchuk on 9/2/2015.
 */
public interface UserService {
    public boolean isValidUser(String username, String password) throws SQLException;
}
