package Util.Logging;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Oleg Romanenchuk on 9/27/2015.
 */
public class LoggerExample {
    private static final Logger LOGGER = Logger.getLogger(LoggerExample.class.getName());

    public static void main(String[] args)throws SecurityException, IOException{
        LOGGER.info("Logger Name: " + LOGGER.getName());
        LOGGER.warning("Can cause ArrayIndexOutOfBoundsException");

        int[]a = {1,2,3};
        int index = 4;
        LOGGER.config("index is set to " + index);
        try {
            System.out.println(a[index]);
        }catch (ArrayIndexOutOfBoundsException e){
            LOGGER.log(Level.SEVERE, "Exception occur", e);
        }

    }
}
