package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.service.UserService;

import java.sql.SQLException;

/**
 * Created by Oleg Romanenchuk on 9/2/2015.
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public boolean isValidUser(String username, String password) throws SQLException {
        return userDao.isValidUser(username, password);
    }
}
