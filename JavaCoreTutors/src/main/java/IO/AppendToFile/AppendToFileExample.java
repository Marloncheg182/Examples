package IO.AppendToFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Oleg Romanenchuk on 8/11/2015.
 */
public class AppendToFileExample {
    public static void main(String[] args) {
        try {
            String data = "This content will append to the end of the file";

            File file = new File("javaio-appendfile.txt");

            //if file doesn't exists, then create it
            FileWriter fileWriter = new FileWriter(file.getName(), true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();

            System.out.println("Done");

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
