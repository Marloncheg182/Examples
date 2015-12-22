package logs;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Created by O1e6 <NsN> on 11/30/2015.
 */
public class SequencedLogFile {
    public static final int FILE_SIZE = 1024;

    public static void main(String[] args) {
        Logger logger = Logger.getLogger(SequencedLogFile.class.getName());
        try {
            FileHandler handler = new FileHandler("simple.log", FILE_SIZE, 1, true);
            handler.setFormatter(new SimpleFormatter());
            logger.addHandler(handler);
            logger.setUseParentHandlers(false);
        }catch (IOException e){
            logger.warning("Failed to initialize logger handler.");
        }
        logger.info("Logging info message.");
        logger.warning("Logging warn message.");
    }
}
