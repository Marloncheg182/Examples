package IO.FileWriter;

import java.io.File;

/**
 * Created by Oleg Romanenchuk on 9/17/2015.
 */
public class Main {
    public static void main(String[] args) {
        Logger log1 = new Logger("file1.txt");
        File f = new File("file2.txt");
        Logger log2 = new Logger(f);

        log1.log("This is written in the first file");
        log2.log("This is written in the second file");
        log1.log("This is appended to the first file");
        log2.log("This is appended to the second file");
    }
}