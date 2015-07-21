package action;

import dao.UserDAO;
import model.User;
import org.apache.log4j.Logger;
import org.apache.struts2.dispatcher.DefaultActionSupport;
import org.apache.struts2.portlet.interceptor.PortletPreferencesAware;

import javax.portlet.PortletPreferences;
import java.io.IOException;
import java.sql.SQLException;


/**
 * @author Oleg Romanenchuk
 */
public class Registration extends DefaultActionSupport implements PortletPreferencesAware{
    private static Logger logger = Logger.getLogger(Registration.class);
    private static final long serialVersionUID = 1L;
    private PortletPreferences preferences;
    private String id;
    private String name;
    private String password;
    private String email;

    public PortletPreferences getPreferences() {
        return preferences;
    }

    public void setPreferences(PortletPreferences preferences) {
        this.preferences = preferences;
    }

    @Override
    public void setPortletPreferences(PortletPreferences pfs) {
       this.preferences = pfs;
    }

    @Override
    public String execute() throws Exception {
        try {
            User user = new User();
            user.setId(id);
            user.setName(name);
            user.setPassword(password);
            user.setEmail(email);
            user = UserDAO.getInstance().createUser(user);
            logger.debug("User was registered");
            return "SUCCESS";
        } catch (SQLException | IOException | ClassNotFoundException | IllegalAccessException e) {
            logger.debug("Registration was failed with errors" + e);
            return "FAILURE";
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
