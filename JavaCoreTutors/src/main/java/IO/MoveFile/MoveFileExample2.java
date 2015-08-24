package IO.MoveFile;

import java.io.*;

/**
 * Created by Oleg Romanenchuk on 8/11/2015.
 */
public class MoveFileExample2 {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;
        try {
            File afile = new File("c:\\folderA\\Afile.txt");
            File bfile = new File("c:\\folderB\\Afile.txt");

            is = new FileInputStream(afile);
            os = new FileOutputStream(bfile);

            byte[] buffer = new byte[1024];

            int length;
            // copy the file content in bytes
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }

            is.close();
            os.close();

            //delete the original file
            afile.delete();

            System.out.println("File is copied successful!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
