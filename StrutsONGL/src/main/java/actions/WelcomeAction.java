package actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import model.MyJavaBean;


/**
 * Created by Dell on 7/26/2015.
 */

public class WelcomeAction extends ActionSupport implements ModelDriven<MyJavaBean>{
    public String execute(){
        return SUCCESS;
    }

    private MyJavaBean bean = new MyJavaBean();


    @Override
    public MyJavaBean getModel() {
        return bean;
    }
}
