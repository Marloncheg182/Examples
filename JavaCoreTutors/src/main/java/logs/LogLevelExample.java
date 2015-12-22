package logs;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by O1e6 <NsN> on 11/30/2015.
 */
public class LogLevelExample {
    private static Logger logger = Logger.getLogger(LogLevelExample.class.getName());

    public static void main(String[] args) {
        logger.setLevel(Level.INFO);
        logger.severe("This message will be logged.");

        logger.setLevel(Level.SEVERE);
        logger.warning("This message won't be logged.");

        logger.setLevel(Level.OFF);
        logger.info("All log is turned off.");

        logger.setLevel(Level.ALL);
        logger.info("Information message.");
        logger.warning("Warning message.");
        logger.severe("Severe message.");
    }
}
