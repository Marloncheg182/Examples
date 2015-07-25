package exception;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Oleg Romanenchuk
 */
public class MyAction extends ActionSupport {
    @Override
    public String execute(){
        throw new NullPointerException("Data missing");
    }
}
