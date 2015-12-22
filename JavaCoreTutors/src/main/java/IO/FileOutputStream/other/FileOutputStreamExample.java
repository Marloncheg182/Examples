package IO.FileOutputStream.other;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Oleg Romanenchuk on 10/7/2015.
 */
public class FileOutputStreamExample {
    private static final String OUTPUT_FILE = "C:\\Users\\testFile.txt";

    public static void main(String[] args) {
        String content = "Hello Java";
        byte[] bytes = content.getBytes();
        try (FileOutputStream out = new FileOutputStream(OUTPUT_FILE)) {
            out.write(bytes);
            out.write(bytes[0]);
            out.write(bytes,4,10);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
