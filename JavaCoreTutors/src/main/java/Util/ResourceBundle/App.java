package Util.ResourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Logger;

/**
 * Created by Oleg Romanenchuk on 9/17/2015.
 */
public class App {
    private static final Logger logger = Logger.getLogger("App");

    public static void main(String[] args) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle(
                "SystemMessages", Locale.getDefault());
        logger.info(resourceBundle.getString("first_name") + ": Oleg");
        logger.info(resourceBundle.getString("last_name") + ": Romanenchuk");

        resourceBundle = ResourceBundle.getBundle("SystemMessages", Locale.forLanguageTag("en"));
        logger.info(resourceBundle.getString("first_name") + ": Oleg");
        logger.info(resourceBundle.getString("last_name") + ": Romanenchuk");

        resourceBundle = ResourceBundle.getBundle("SystemMessage", Locale.GERMAN);
        logger.info(resourceBundle.getString("first_name") + ": Oleg");
        logger.info(resourceBundle.getString("last_name") + ": Romanenchuk");
    }
}
