package dao.utility;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author Oleg Romanenchuk
 */
public class ConnectionUtility {
    private static ConnectionUtility connectionUtility = null;

    private Connection connection = null;

    private ConnectionUtility(){

    }
    public static ConnectionUtility getInstance() throws IOException, ClassNotFoundException, SQLException {
        synchronized (ConnectionUtility.class){
            if (connectionUtility == null)
            {
                Properties properties = new Properties();
                properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("connection.properties"));
                connectionUtility = new ConnectionUtility();
                Class.forName("com.mysql.jdbc.Driver");
                connectionUtility.setConnection(DriverManager.getConnection("jdbc:mysql://localhost:33033/examples", properties));

            }
            return connectionUtility;
        }
    }

    public Connection getConnection() throws ClassNotFoundException, SQLException, IOException{
        if (connection.isClosed()){

            Properties properties = new Properties();
            properties.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("connection.properties"));

            Class.forName("com.mysql.jdbc.Driver");
            connectionUtility.setConnection(DriverManager.getConnection("jdbc:mysql://localhost:33033/examples", properties));

        }
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}

