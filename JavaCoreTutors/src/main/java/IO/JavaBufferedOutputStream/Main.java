package IO.JavaBufferedOutputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by Oleg Romanenchuk on 9/17/2015.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Logger logger = new Logger("log.txt");
            logger.log("Log message 1");
            logger.log("Log message 2");
            logger.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }
}
