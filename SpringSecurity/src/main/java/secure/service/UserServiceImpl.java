package secure.service;

import org.springframework.stereotype.Service;
import secure.entity.User;

/**
 * Created by Dell on 6/15/2015.
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public User getUser(String login) {
        User user = new User();
        user.setLogin(login);
        user.setPassword("7110eda4d09e062aa5e4a390b0a572ac0d2c0220"); // ?????????? ? SHA1 ? ??????? online ??????? SHA1 online generator
        return user;
    }
}
