package IO.ArrayOfBytesToFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by Oleg Romanenchuk on 8/11/2015.
 */
public class ArrayOfBytesToFile {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;

        File file = new File("c:\\testings.text");

        byte[] bFile = new byte[(int)file.length()];
        try {

            // convert file into array of bytes
            fileInputStream = new FileInputStream(file);
            fileInputStream.read(bFile);
            fileInputStream.close();

            //convert array of bytes into file
            FileOutputStream fileOutputStream = new FileOutputStream("c:\\testing2.txt");
            fileOutputStream.write(bFile);
            fileOutputStream.close();

            System.out.println("Done");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
