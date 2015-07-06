package service;

import entity.User;

/**
 * Created by Dell on 6/17/2015.
 */
public interface UserService {
    User getUser(String login);
}
