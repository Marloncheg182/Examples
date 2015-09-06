package controller;

import delegate.LoginDelegate;
import viewBean.LoginBean;

import java.sql.SQLException;

/**
 * Created by Oleg Romanenchuk on 8/31/2015.
 */
public class StrutsController implements ModelDriven<LoginBean>{

    private LoginDelegate loginDelegate;

    public LoginBean loginBean;

    public LoginBean getLoginBean() {
        return loginBean;
    }

    public void setLoginBean(LoginBean loginBean) {
        this.loginBean = loginBean;
    }

    public LoginDelegate getLoginDelegate() {
        return loginDelegate;
    }

    public void setLoginDelegate(LoginDelegate loginDelegate) {
        this.loginDelegate = loginDelegate;
    }
    public String execute() throws SQLException
    {
        String target = "";
        boolean isValidUser = loginDelegate.isValidUser(loginBean.getUsername(), loginBean.getPassword());
        if (isValidUser)
        {
            System.out.println("User Login Successful");
            ServletActionContext.getRequest().setAttribute("loggedInUser", loginBean.getUsername());
            target = "SUCCESS";
        }
        else
        {
            ServletActionContext.getRequest().setAttribute("message", "Invalid credentials!!");
            target = "Failure";
        }
        return target;
    }

    public LoginDelegate getLoginDelegate()
    {
        return this.loginDelegate;
    }

    public void setLoginDelegate(LoginDelegate loginDelegate)
    {
        this.loginDelegate = loginDelegate;
    }

    @Override
    public LoginBean getModel()
    {
        return loginBean;
    }

}
