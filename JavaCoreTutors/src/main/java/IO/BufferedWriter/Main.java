package IO.BufferedWriter;

import java.io.IOException;

/**
 * Created by Oleg Romanenchuk on 9/18/2015.
 */
public class Main {
    public static void main(String[] args) {

        try {
            Logger log = new Logger("log1.txt");
            log.log("Test 1");
            log.log("Test 2");
            log.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}