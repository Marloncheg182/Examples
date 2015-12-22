package IO.BufferedWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Oleg Romanenchuk on 9/17/2015.
 */
public class SimpleBufferedWriterExample {
    public static void main(String[] args) {

        String greetings = "Hello!";
        String description = "I am written into a file";

        try {
            BufferedWriter writer = new BufferedWriter(
                    new FileWriter(new File("textfile.txt")));

            writer.write(greetings);
            writer.newLine();
            writer.write(description);
            writer.close();
            System.out.println("End");

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}