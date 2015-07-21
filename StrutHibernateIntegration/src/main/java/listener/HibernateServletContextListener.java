package listener;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import java.net.URL;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author Oleg Romanenchuk
 */
public class HibernateServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        URL url = HibernateServletContextListener.class.getResource("/hibernate.cfg.xml");
        Configuration configuration = new Configuration();
        configuration.configure(url);
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).build();
        SessionFactory factory = configuration.buildSessionFactory(serviceRegistry);
        servletContextEvent.getServletContext().setAttribute("SessionFactory", factory);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
         SessionFactory sessionFactory = (SessionFactory)servletContextEvent
                 .getServletContext().getAttribute("SessionFactory");
        sessionFactory.close();
    }
}
