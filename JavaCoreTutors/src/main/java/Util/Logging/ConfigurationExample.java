package Util.Logging;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * Created by Oleg Romanenchuk on 9/27/2015.
 */
public class ConfigurationExample {
    private static final LogManager LOG_MANAGER = LogManager.getLogManager();
    private static final Logger LOGGER = Logger.getLogger("confLogger");
    static {
        try {
            LOG_MANAGER.readConfiguration(new FileInputStream("./simplefile.properties"));
        }catch (IOException e){
            LOGGER.log(Level.SEVERE, "Error in loading configuration",e);
        }
    }

    public static void main(String[] args) {
        LOGGER.fine("Fine message logged");
    }
}
