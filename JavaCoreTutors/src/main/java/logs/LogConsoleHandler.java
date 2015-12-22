package logs;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by O1e6 <NsN> on 11/30/2015.
 */
public class LogConsoleHandler {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LogConsoleHandler.class.getName());
        ConsoleHandler consoleHandler = new ConsoleHandler();
        logger.addHandler(consoleHandler);
        if (logger.isLoggable(Level.INFO)){
            logger.info("This is an information message");
        }
    }
}
