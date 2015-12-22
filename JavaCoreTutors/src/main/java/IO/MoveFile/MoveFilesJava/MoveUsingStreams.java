package IO.MoveFile.MoveFilesJava;

import java.io.*;

/**
 * Created by O1e6 <NsN> on 11/23/2015.
 */
public class MoveUsingStreams {
    public static void main(String[] args) {
        InputStream in = null;
        OutputStream out = null;
        try {
            File oldFile = new File("C:\\Users\\oldFile.txt");
            File newFile = new File("C:\\users\\newFile.txt");

            in = new FileInputStream(oldFile);
            out = new FileOutputStream(newFile);

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) > 0){
                out.write(buffer, 0, bytesRead);
            }

            in.close();
            out.close();

            oldFile.delete();
            System.out.println("The File was successfully moved to the new folder");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
