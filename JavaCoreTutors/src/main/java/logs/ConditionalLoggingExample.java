package logs;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by O1e6 <NsN> on 11/30/2015.
 */
public class ConditionalLoggingExample {
    private Logger logger =Logger.getLogger(ConditionalLoggingExample.class.getName());

    public static void main(String[] args) {
        ConditionalLoggingExample example = new ConditionalLoggingExample();
        example.method();
    }

    private void method() {
        if (logger.isLoggable(Level.INFO)){
            logger.info("Entering executeMetod() at : " + new Date());
        }
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.println("");
            }
            if (logger.isLoggable(Level.INFO)){
                logger.info("Exiting executeMethod() at : " + new Date());
            }
        }
    }
}
