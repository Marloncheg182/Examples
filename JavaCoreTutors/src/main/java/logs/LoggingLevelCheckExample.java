package logs;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by O1e6 <NsN> on 11/30/2015.
 */
public class LoggingLevelCheckExample {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LoggingLevelCheckExample.class.getName());
        logger.setLevel(Level.WARNING);

        if (logger.isLoggable(Level.INFO)){
            logger.info("Application Info Message");
        }

        if (logger.isLoggable(Level.WARNING)){
            logger.warning("Application Warning Information");
        }
        if (logger.isLoggable(Level.SEVERE)){
            logger.severe("Info Severe Information");
        }
    }
}
