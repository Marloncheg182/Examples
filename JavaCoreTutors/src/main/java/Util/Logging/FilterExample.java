package Util.Logging;

import java.util.logging.Filter;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/**
 * Created by Oleg Romanenchuk on 9/27/2015.
 */
public class FilterExample implements Filter {
    private static final Logger LOGGER = Logger.getLogger(FilterExample.class.getName());

    public static void main(String[] args) {
        LOGGER.setFilter(new FilterExample());
        LOGGER.severe("This is SEVERE message");
        LOGGER.warning("This is important warning message");
    }

    @Override
    public boolean isLoggable(LogRecord record) {
        if (record == null)
        return false;

        String message = record.getMessage()==null?"":record.getMessage();
        if (message.contains("important"))
            return true;
        return false;
    }
}
