package secure.service;

import secure.entity.User;

/**
 * Created by Dell on 6/15/2015.
 */
public interface UserService {
    User getUser(String login);
}
