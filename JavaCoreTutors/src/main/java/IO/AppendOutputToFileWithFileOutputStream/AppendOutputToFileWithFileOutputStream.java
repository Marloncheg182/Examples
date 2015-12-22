package IO.AppendOutputToFileWithFileOutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by O1e6 <NsN> on 11/25/2015.
 */
public class AppendOutputToFileWithFileOutputStream {
    public static void main(String[] args) {
        String s = "Java Example";
        File file = new File("outputfile.txt");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file, true);
            fos.write(s.getBytes());
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error while doing a write operation " + e.getMessage());
        }finally {
            try {
                if (fos!=null){
                    fos.close();
                }
            } catch (IOException e) {
                System.out.println("Error while closing the operation");
            }
        }
    }
}
