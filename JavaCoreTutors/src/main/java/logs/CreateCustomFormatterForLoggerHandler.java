package logs;

import java.util.logging.FileHandler;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/**
 * Created by O1e6 <NsN> on 11/30/2015.
 */
public class CreateCustomFormatterForLoggerHandler {
    public static void main(String[] args) throws Exception {
      boolean append = false;
        FileHandler handler = new FileHandler("default.log",append);
        Logger logger = Logger.getLogger("com.mylogs.api");
        logger.addHandler(handler);
        handler.setFormatter(new MyCustomFormatter());
        logger.info("custom formatter - info message");
    }

    private static class MyCustomFormatter extends Formatter {
        @Override
        public String format(LogRecord record) {
            StringBuffer sb = new StringBuffer();
            sb.append("Prefixn");
            sb.append(record.getMessage());
            sb.append("Suffixn");
            sb.append("n");
            return sb.toString();
        }
    }
}
