package actions;



import org.apache.log4j.Logger;
import com.opensymphony.xwork2.Action;
import org.apache.struts2.convention.annotation.*;


/**
 * @author Oleg Romanenchuk
 */

public class HomeAction implements Action {
        private static final Logger logger = Logger.getLogger(HomeAction.class);

    public String execute(){
        logger.info("inside HomeAction execute method");
        return SUCCESS;
    }

}
