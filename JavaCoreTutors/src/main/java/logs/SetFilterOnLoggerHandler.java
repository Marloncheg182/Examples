package logs;

import java.io.IOException;
import java.util.logging.*;

/**
 * Created by O1e6 <NsN> on 11/30/2015.
 */
public class SetFilterOnLoggerHandler {
    public static void main(String[] args) throws IOException {
        boolean append = false;
        FileHandler handler = new FileHandler("default.log", append);
        handler.setFilter(new Filter() {
            @Override
            public boolean isLoggable(LogRecord record) {
                return record.getMessage().startsWith("IMPORTANT");
            }
        });

        Logger logger = Logger.getLogger("com.mylogs.api");
        logger.addHandler(handler);
        logger.setLevel(Level.FINEST);

        logger.info("info message");
        logger.info("IMPORTANT info message");
    }
}
