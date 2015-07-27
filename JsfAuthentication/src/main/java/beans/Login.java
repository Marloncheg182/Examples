package beans;

import dao.LoginDAO;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;
import java.io.Serializable;

/**
 * Created by Dell on 7/26/2015.
 */
@ManagedBean
@SessionScoped
public class Login implements Serializable{

    private String password;
    private String message;
    private String user;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String validateUsernamePassword(){
        boolean valid = LoginDAO.validate(user, password);
        if (valid){
            HttpSession session = SessionBean.getSession();
            session.setAttribute("username", user);
            return "admin";
        } else {
            FacesContext.getCurrentInstance().addMessage(
                    null, new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Invalid Name and Password", "Please enter the correct name and password"));
            return "login";
        }
    }

    public String logout(){
        HttpSession session = SessionBean.getSession();{
            session.invalidate();
            return "login";
        }
    }
}
