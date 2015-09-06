package service.impl;

import service.UserService;

import java.sql.SQLException;

/**
 * Created by Oleg Romanenchuk on 8/31/2015.
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
