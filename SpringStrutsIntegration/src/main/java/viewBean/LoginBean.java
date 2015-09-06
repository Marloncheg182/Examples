package viewBean;
/**
 * Created by Oleg Romanenchuk on 8/31/2015.
 */
public class LoginBean {

    private String username;

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "LoginBean{" +
                "password='" + password + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
