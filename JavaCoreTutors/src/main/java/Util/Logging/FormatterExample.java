package Util.Logging;

import java.io.IOException;
import java.util.logging.*;

/**
 * Created by Oleg Romanenchuk on 9/27/2015.
 */
public class FormatterExample {
    private static final Logger LOGGER = Logger.getLogger(FormatterExample.class.getName());

    public static void main(String[] args) {
        Handler fileHandler = null;
        Formatter simpleFormatter = null;
        try {
            fileHandler = new FileHandler("./simplefile.log");
            simpleFormatter = new SimpleFormatter();

            LOGGER.addHandler(fileHandler);

            LOGGER.info("Finnest message: Logger with DEFAULT FORMATTER");

            fileHandler.setFormatter(simpleFormatter);

            fileHandler.setLevel(Level.ALL);
            LOGGER.setLevel(Level.ALL);

            LOGGER.finest("Finnest message: Logger with SIMPLE FORMATTER");
        }catch (IOException e){
            LOGGER.log(Level.SEVERE, "Error occur in File " + e);
        }
    }
}
