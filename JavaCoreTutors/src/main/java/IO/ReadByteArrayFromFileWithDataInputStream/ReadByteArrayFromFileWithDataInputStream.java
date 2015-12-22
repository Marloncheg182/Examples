package IO.ReadByteArrayFromFileWithDataInputStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by O1e6 <NsN> on 11/29/2015.
 */
public class ReadByteArrayFromFileWithDataInputStream {
    public static void main(String[] args) {
        String filename = "input.txt";

        FileInputStream fis = null;
        DataInputStream dis = null;
        try {
            fis = new FileInputStream(filename);
            dis = new DataInputStream(fis);
            byte b[] = new byte[10];
            dis.read(b);
        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found " + fnfe);
        } catch (IOException ioe) {
            System.out.println("Error while writing " + ioe);
        } finally {
            try {
                if (dis != null){
                    dis.close();
                }
                if (fis != null){
                    fis.close();
                }
            }catch (Exception ex){
                System.out.println("Error while closing " + ex);
            }
        }
    }
}
