package IO.CreateTemporaryFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by Oleg Romanenchuk on 8/12/2015.
 */
public class CreateTempFileExample {
    public static void main(String[] args)
    {

        try{

            //create a temp file
            File temp = File.createTempFile("temp-file-name", ".tmp");

            System.out.println("Temp file : " + temp.getAbsolutePath());

        }catch(IOException e){

            e.printStackTrace();

        }

    }
}