package IO.ReadCharFromFileWithDataInputStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by O1e6 <NsN> on 11/29/2015.
 */
public class ReadCharFromFileWithDataInputStream {
    public static void main(String[] args) {
        String filename = "input.txt";

        FileInputStream fis = null;
        DataInputStream dis = null;
        try {
            fis = new FileInputStream(filename);
            dis = new DataInputStream(fis);
            char c = dis.readChar();
            System.out.println("Char read: " + c);
        } catch (FileNotFoundException fe) {
            System.out.println("File not found " + fe);
        } catch (IOException ioe) {
            System.out.println("Error while reading " + ioe);
        } finally {
            try {
                if (dis != null){
                    dis.close();
                }
                if (fis != null){
                    fis.close();
                }
            }catch (Exception e){
                System.out.println("Error while closing the stream " + e);
            }
        }
    }
}
