package IO.BufferedWriter;

import java.io.*;

/**
 * Created by Oleg Romanenchuk on 8/11/2015.
 */
public class BufferedWriterExample {
    public static void main(String[] args) {
        try {
            String content = "This is the content to write";

            File file = new File("/user/dell/filename.txt");

//            if file doesn't exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
