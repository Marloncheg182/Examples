package logs;

import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;

/**
 * Created by O1e6 <NsN> on 11/30/2015.
 */
public class NoParentLoggerExample {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(NoParentLoggerExample.class.getName());
        logger.setUseParentHandlers(false);
        logger.addHandler(new ConsoleHandler());
        logger.info("Logging an info message.");
    }
}
