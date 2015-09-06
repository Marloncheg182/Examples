package delegate;

import java.sql.SQLException;

/**
 * Created by Oleg Romanenchuk on 8/31/2015.
 */
public class LoginDelegate {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public boolean isValidUser(String username, String password) throws SQLException {
        return userService.isValidUser(username, password);
    }
}