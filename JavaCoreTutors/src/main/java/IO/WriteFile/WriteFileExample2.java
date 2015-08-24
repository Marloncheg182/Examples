package IO.WriteFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Oleg Romanenchuk on 8/11/2015.
 */
public class WriteFileExample2 {
    public static void main(String[] args) {
        File file = new File("c:/newfile.txt");
        String content = "This is the text content";

        try (FileOutputStream fop = new FileOutputStream(file)) {
//            if file doesn't exists, then crate it
            if (!file.exists()) {
                file.createNewFile();
            }

//            get the content in bytes

            byte[] contentInBytes = content.getBytes();

            fop.write(contentInBytes);
            fop.flush();
            fop.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
