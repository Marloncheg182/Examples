package IO.DeleteTemporaryFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by Oleg Romanenchuk on 8/12/2015.
 */
public class DeleteTempFileExample {
    public static void main(String[] args) {
        try {
            //create a temp file
            File temp = File.createTempFile("tempFile", ".tmp");

            //delete temporary file, when program will be finished
            temp.deleteOnExit();


        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
