package logs;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.MemoryHandler;

/**
 * Created by O1e6 <NsN> on 11/30/2015.
 */
public class MemoryHandlerExample {
    public static void main(String[] args) {
        MemoryHandlerExample example = new MemoryHandlerExample();
        try {
            example.testMethod();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void testMethod() throws Exception{
        Logger logger = Logger.getLogger(MemoryHandlerExample.class.getName());
        FileHandler fileHandler = new FileHandler("myapp.log");
        MemoryHandler memoryHandler = new MemoryHandler(fileHandler, 10, Level.SEVERE);
        logger.addHandler(memoryHandler);
        logger.info("Info message");
        logger.warning("Warning message");

        logger.severe("Severe message");
    }
}
