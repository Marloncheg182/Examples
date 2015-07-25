package action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Oleg Romanenchuk
 */
public class WelcomeActions extends ActionSupport {
    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    private String username;
    private String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
