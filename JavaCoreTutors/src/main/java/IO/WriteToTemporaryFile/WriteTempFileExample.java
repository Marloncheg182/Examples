package IO.WriteToTemporaryFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Oleg Romanenchuk on 8/12/2015.
 */
public class WriteTempFileExample {
    public static void main(String[] args) {
        try {
            File temp = File.createTempFile("tempfile", ".tmp");
            BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
            bw.write("This is a temporary file");
            bw.close();

            System.out.println("Done");

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
