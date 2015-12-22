package logs;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

/**
 * Created by O1e6 <NsN> on 11/30/2015.
 */
public class SetFormatterForLoggerHandler {
    public static void main(String[] args) throws IOException {
        boolean append = false;
        FileHandler handler = new FileHandler("default.log", append);
        Logger logger = Logger.getLogger("com.mylogs.api");
        logger.addHandler(handler);
        handler.setFormatter(new SimpleFormatter());
        logger.info("simple formatter - info message");
        handler.setFormatter(new XMLFormatter());
        logger.info("xml formatter - info message");
    }
}
