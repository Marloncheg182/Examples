package action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Oleg Romanenchuk
 */
public class Welcome extends ActionSupport {

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    @Override
    public void validate() {
        if ("oleg".equalsIgnoreCase(getUsername()) && "admin".equalsIgnoreCase(getPassword())){
         addActionMessage("Welcome Admin!");
        } else{
            if (!"oleg".equalsIgnoreCase(getUsername())){
                addActionError("User name is not valid");
            }
            if (!"admin".equalsIgnoreCase(getPassword())){
                addActionError("Password is not valid");
            }
        }

    }

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
