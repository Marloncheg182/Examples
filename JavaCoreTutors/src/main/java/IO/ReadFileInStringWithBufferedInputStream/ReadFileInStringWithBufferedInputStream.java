package IO.ReadFileInStringWithBufferedInputStream;

import java.io.*;

/**
 * Created by O1e6 <NsN> on 11/29/2015.
 */
public class ReadFileInStringWithBufferedInputStream {
    public static void main(String[] args) {
        File file = new File("inputfile.txt");
        BufferedInputStream bin = null;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            bin = new BufferedInputStream(fis);

            byte[] contents = new byte[1024];

            int bytesRead = 0;
            String s;

            while ((bytesRead = bin.read(contents)) != -1) {
                s = new String(contents, 0, bytesRead);
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e);
        } catch (IOException ioe) {
            System.out.println("Exception while reading file " + ioe);
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (bin != null){
                    bin.close();
                }
            }catch (IOException ioe){
                System.out.println("Error while reading file " + ioe);
            }
        }
    }
}
