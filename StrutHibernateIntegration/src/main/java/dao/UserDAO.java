package dao;

import model.User;

/**
 * @author Oleg Romanenchuk
 */
public interface UserDAO {
    User getUserByCredentials(String userId, String password);
}
