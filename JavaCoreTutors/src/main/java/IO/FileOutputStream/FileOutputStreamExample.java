package IO.FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Oleg Romanenchuk on 9/27/2015.
 */
public class FileOutputStreamExample {
    private static final String OUTPUT_FILE = "C:\\TestFiles\\testFile.txt";

    public static void main(String[] args) {
        String content = "Hello";
        byte[]bytes = content.getBytes();
        try(FileOutputStream outputStream = new FileOutputStream(OUTPUT_FILE)){
            outputStream.write(bytes);

            outputStream.write(bytes[0]);

            outputStream.write(bytes,4,10);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
