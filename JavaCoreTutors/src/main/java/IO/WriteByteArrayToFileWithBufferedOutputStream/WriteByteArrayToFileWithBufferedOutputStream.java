package IO.WriteByteArrayToFileWithBufferedOutputStream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by O1e6 <NsN> on 11/29/2015.
 */
public class WriteByteArrayToFileWithBufferedOutputStream {
    public static void main(String[] args) {
        String filename = "output.txt";
        String output = "Hello message";
        BufferedOutputStream bos = null;
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream(filename);
            bos = new BufferedOutputStream(fos);

            bos.write(output.getBytes());
        }catch (FileNotFoundException fnfe){
            System.out.println("File not found " + fnfe);
        }catch (IOException ioe ){
            System.out.println("Error while writing " + ioe);
        }
        finally {
            try {
                if (bos !=null){
                    bos.flush();
                    bos.close();
                }
            }catch (Exception e){
                System.out.println("Error while closing streaems " + e);
            }
        }
    }
}
