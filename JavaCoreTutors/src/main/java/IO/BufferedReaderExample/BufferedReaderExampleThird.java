package IO.BufferedReaderExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by 1 on 10.11.2015.
 */
public class BufferedReaderExampleThird {
    private static final String OUTPUT_FILE = "C:\\Testfile.txt";

    public static void main(String[] args) {
        String str = "";

        Path filePath = Paths.get(OUTPUT_FILE);
        try (BufferedReader reader = Files.newBufferedReader(filePath, Charset.defaultCharset())) {

            while ((str = reader.readLine()) != null) {
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}