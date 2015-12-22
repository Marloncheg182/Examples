package NIO.WriteToFile;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by O1e6 <NsN> on 17.11.2015.
 */
public class WriteToFileNIO {
    private static final String FILEPATH = "C:\\testFile.txt";

    public static void main(String[] args) throws IOException {
        String str1 = "1";
        String str2 = "2";

        List<String> list = new ArrayList<>();
        list.add(str1);
        list.add(str2);

        bufferedWrite(list, FILEPATH);
        simpleWrite(str1, FILEPATH);
        writeWithOutputStream(str2, FILEPATH);
        writheWithBufferedOutputStream(list, FILEPATH);
        simpleWriteListOfString(list, FILEPATH);
    }

    /**
     * @param content
     * @param filePath
     * @throws UnsupportedEncodingException
     * @throws IOException
     */
    public static void simpleWrite(String content, String filePath) throws UnsupportedEncodingException, IOException {
        Path fileP = Paths.get(filePath);
        Files.write(fileP, content.getBytes("utf-8"));
    }

    /**
     * @param content
     * @param filePath
     */
    public static void bufferedWrite(List<String> content, String filePath) {
        Path fileP = Paths.get(filePath);
        Charset charset = Charset.forName("utf-8");
        try (BufferedWriter writer = Files.newBufferedWriter(fileP, charset)) {
            for (String line : content) {
                writer.write(line, 0, line.length());
                writer.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param content
     * @param filePath
     */
    public static void writeWithOutputStream(String content, String filePath) {
        Path fileP = Paths.get(filePath);
        try (OutputStream outputStream = Files.newOutputStream(fileP)) {
            outputStream.write(content.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param content
     * @param filePath
     */
    public static void writheWithBufferedOutputStream(List<String> content, String filePath) {
        Path fileP = Paths.get(filePath);
        try (BufferedOutputStream outputStream = new BufferedOutputStream(Files.newOutputStream(fileP))) {

            for (String line : content) {
                outputStream.write(line.getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param content
     * @param filePath
     */
    public static void simpleWriteListOfString(List<String> content, String filePath) {
        Path fileP = Paths.get(filePath);
        Charset charset = Charset.forName("utf-8");
        try {
            Files.write(fileP, content, charset);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


