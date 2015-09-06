package com.example.delegate;

import com.example.service.UserService;

import java.sql.SQLException;

/**
 * Created by Oleg Romanenchuk on 9/2/2015.
 */
public class LoginDelegate {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    public boolean isValidatorUser(String username, String password) throws SQLException{
        return userService.isValidUser(username, password);
    }


}
