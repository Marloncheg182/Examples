package NIO.DeleteFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Oleg Romanenchuk on 9/22/2015.
 */
public class JavaDeleteFile {
    private static final String FILE_PATH = "D:\\test.txt";

    public static void main(String[] args) {
        try {
            JavaDeleteFile.deleteFileNIO(FILE_PATH);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private static void deleteFileNIO(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        Files.delete(path);
    }
}
