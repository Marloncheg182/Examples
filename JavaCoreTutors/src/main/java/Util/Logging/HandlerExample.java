package Util.Logging;

import java.io.IOException;
import java.util.logging.*;

/**
 * Created by Oleg Romanenchuk on 9/27/2015.
 */
public class HandlerExample {
    private static final Logger LOGGER = Logger.getLogger(HandlerExample.class.getName());

    public static void main(String[] args) {
        Handler consoleHandler = null;
        Handler fileHandler = null;
        try {
            consoleHandler = new ConsoleHandler();
            fileHandler = new FileHandler("./simplelogs.log");

            LOGGER.addHandler(consoleHandler);
            LOGGER.addHandler(fileHandler);

            consoleHandler.setLevel(Level.ALL);
            fileHandler.setLevel(Level.ALL);
            LOGGER.setLevel(Level.ALL);

            LOGGER.config("Configuration done.");

            LOGGER.removeHandler(consoleHandler);
            LOGGER.log(Level.FINE, "Fine logged");
        }catch (IOException exception){
            LOGGER.log(Level.SEVERE, "Error occur in FileHandler.", exception);
        }
        LOGGER.fine("Finest example on LOGGER handler completed");
    }
}
