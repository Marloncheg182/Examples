package IO.FileToArrayOfBytes;

import java.io.File;
import java.io.FileInputStream;

/**
 * Created by Oleg Romanenchuk on 8/11/2015.
 */
public class FileToArrayOfBytes {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;

        File file = new File("c:\\testingFile.txt");
        byte[] bFile = new byte[(int) file.length()];
        try {
            //convert file into array of bytes
            fileInputStream = new FileInputStream(file);
            fileInputStream.read(bFile);
            fileInputStream.close();

            for (int i = 0; i < bFile.length; i++) {
                System.out.println((char) bFile[i]);
            }
            System.out.println("Done");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
