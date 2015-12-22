package IO.AppendFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by O1e6 <NsN> on 11/23/2015.
 */
public class AppendFileJavaExample {
    private static String filePath = "C:\\words.txt";

    public static void main(String[] args) {
        try {
            String newData = " Java example";
            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter bwr = new BufferedWriter(fileWriter);
            bwr.write(newData);
            bwr.close();
            System.out.println("Content appended to file");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
