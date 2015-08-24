package IO.GetTemporaryFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by Oleg Romanenchuk on 8/12/2015.
 */
public class GetTempFilePathExample {
    public static void main(String[] args) {
        try {
            //create a temp file
            File temp = File.createTempFile("temp-file-name", ".tmp");
            System.out.println("Temp file : " + temp.getAbsolutePath());

            //Get temporary file path
            String absolutePath = temp.getAbsolutePath();
            String tempFilePath = absolutePath.substring(0,absolutePath.lastIndexOf(File.separator));

            System.out.println("Temp file path : " + tempFilePath);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
