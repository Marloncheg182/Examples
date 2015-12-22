package IO.WriteCharToFileWithDataOutputStream;

import java.io.*;

/**
 * Created by O1e6 <NsN> on 11/29/2015.
 */
public class WriteCharToFileWithDataOutputStream {
    public static void main(String[] args) {
        String filename = "output.txt";

        FileOutputStream fos = null;
        DataOutputStream dos = null;
        try {
            fos = new FileOutputStream(filename);
            dos = new DataOutputStream(fos);
            char c = 'A';
            dos.writeChar(c);
        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found " + fnfe);
        } catch (IOException ioe) {
            System.out.println("Error while writing " + ioe);
        } finally {
            try {
                if (dos != null) {
                    dos.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (Exception e) {
                System.out.println("Error while closing " + e);
            }
        }
    }
}
