package actions;

import beans.User;
import com.opensymphony.xwork2.Action;
import org.apache.struts2.convention.annotation.*;

import org.apache.struts2.convention.annotation.Result;

/**
 * @author Oleg Romanenchuk
 */

@org.apache.struts2.convention.annotation.Action(value = "loginObject")
@Namespace(value = "/")
@ResultPath(value = "/")
@Results({ @Result(name = "success", location = "homeObject.jsp"),
        @Result(name = "input", location = "loginObject.jsp") })
public class LoginObjectBackedAction implements Action {

    @Override
    public String execute() throws Exception {
        if("oleg".equals(getUser().getUserID()) && "admin".equals(getUser().getPassword())){
            getUser().setUserName("Oleg Romanenchuk");
            return SUCCESS;
        }else{
            return INPUT;
        }
    }

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}