package IO.FileReaderExample;

import java.io.*;

/**
 * Created by 1 on 10.11.2015.
 */
public class FileReaderSecondExample {
    private static final String OUTPUT_FILE = "C:\\Testfile.txt";

    public static void main(String[] args) {
        String str = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(new File(OUTPUT_FILE)), 1024)) {

            while ((str = reader.readLine()) != null){
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
