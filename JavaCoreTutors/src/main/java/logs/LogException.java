package logs;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by O1e6 <NsN> on 11/30/2015.
 */
public class LogException {
    private static Logger logger = Logger.getLogger(LogException.class.getName());

    public static void main(String[] args) {

        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        df.setLenient(false);


        try {


// Set wrong date


            Date date = df.parse("23/11/1989");



            System.out.println("Date = " + date);

        } catch (ParseException e) {




            // Create log message


            if (logger.isLoggable(Level.SEVERE)) {


                logger.log(Level.SEVERE, "Error parsing date", e);


            }

        }
    }
}
