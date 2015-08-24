package IO.CopyFile;

import java.io.*;

/**
 * Created by Oleg Romanenchuk on 8/11/2015.
 */
public class CopyFileExample {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;
        try {
            File afile = new File("Afile.txt");
            File bfile = new File("Bfile.txt");

            is = new FileInputStream(afile);
            os = new FileOutputStream(bfile);

            byte[] buffer = new byte[1024];

            int length;
            //copy the file content in bytes
            while ((length =is.read(buffer))>0){
                os.write(buffer, 0, length);
            }

            is.close();
            os.close();

            System.out.println("File is copied successful!");

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
