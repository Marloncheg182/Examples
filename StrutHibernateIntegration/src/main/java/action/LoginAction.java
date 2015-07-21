package action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import dao.UserDAO;
import dao.UserDAOImpl;
import model.User;
import org.apache.struts2.util.ServletContextAware;
import org.hibernate.SessionFactory;

import javax.servlet.ServletContext;

/**
 * @author Oleg Romanenchuk
 */
public class LoginAction implements Action, ModelDriven<User>, ServletContextAware {

    private User user = new User();
    private ServletContext ctx;

    @Override
    public String execute() throws Exception {
        SessionFactory sessionFactory = (SessionFactory)ctx.getAttribute("SessionFactory");
        UserDAO userDAO = new UserDAOImpl(sessionFactory);
        User userDB = userDAO.getUserByCredentials(user.getId(), user.getPassword());
        if (userDB == null)
        return ERROR;
        else {
            user.setEmail(userDB.getEmail());
            user.setName(userDB.getName());
            return SUCCESS;
        }
    }

    @Override
    public User getModel() {
        return user;
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.ctx = servletContext;
    }
}
