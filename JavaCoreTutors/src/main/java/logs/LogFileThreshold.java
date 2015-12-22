package logs;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

/**
 * Created by O1e6 <NsN> on 11/30/2015.
 */
public class LogFileThreshold {
    public static final int FILE_SIZE = 1024;

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LogFileThreshold.class.getName());
        try {
            FileHandler handler = new FileHandler("sample.log", FILE_SIZE, 1, true);
            logger.addHandler(handler);
        }catch (IOException e){
            logger.warning("Failed to initialize logger handler.");
        }
        logger.info("Test info");
        logger.warning("Test warning");
        logger.severe("Test severe");
    }
}
