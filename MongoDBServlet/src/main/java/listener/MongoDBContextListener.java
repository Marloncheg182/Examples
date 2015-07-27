package listener;


import com.mongodb.MongoClient;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.net.UnknownHostException;

/**
 * Created by Dell on 7/27/2015.
 */
public class MongoDBContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext context = servletContextEvent.getServletContext();
        MongoClient mongo = new MongoClient(
                context.getInitParameter("MONGODB_HOST"),
                Integer.parseInt(context.getInitParameter("MONGODB_PORT")));
        System.out.println("MongoClient initialized successfully");
        servletContextEvent.getServletContext().setAttribute("MONGO_CLINT", mongo);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        MongoClient mongo  = (MongoClient)servletContextEvent.getServletContext()
                .getAttribute("MONGO_CLIENT");
        mongo.close();
        System.out.println("MongoClient closed successfully");
    }
}
