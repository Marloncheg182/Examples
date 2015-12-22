package logs;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by O1e6 <NsN> on 11/30/2015.
 */
public class LogMethodCall {
    public static void main(String[] args) throws Exception{
        LogMethodCall call = new LogMethodCall();
        call.method("arg1", new String("arg2"));
    }

    private boolean method(String arg1, String arg2) throws Exception{
        boolean append = false;
        FileHandler handler = new FileHandler("default.log", append);
        Logger logger = Logger.getLogger("com.mylogs.api");
        logger.setLevel(Level.FINEST);
        logger.addHandler(handler);

        logger.entering(this.getClass().getName(), "method", new Object[]{arg1, arg2});
        boolean result = true;
        logger.exiting(this.getClass().getName(), "method", new Boolean(result));
        return result;
    }


}
