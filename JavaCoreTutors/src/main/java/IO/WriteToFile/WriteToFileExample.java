package IO.WriteToFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by O1e6 <NsN> on 17.11.2015.
 * Little class for writing into File, using some kind a io package with
 * the whole functionality.
 * We are going to use some different types of functionality to evaluate, which will increase more performance
 * and usability in future tasks...
 * @version 1.0
 */
//TODO some changes for future using of nio packages and some classes like Path, Files e.t.c.

public class WriteToFileExample {
    private static final String FILEPATH = "C:\\testFile.txt";

    public static void main(String[] args) throws IOException {
        String str1 = "Preparing data, before writing to file";
        String str2 = "Some kind an example text to fill the empty space, must be changed after(i guess)";

        List<String> list = new ArrayList<>();
        list.add(str1);
        list.add(str2);

        useFileOutputStream(str1, FILEPATH);
        useBufferedFileOutputStream(list, FILEPATH);
        useByBufferedFileWriter(list, FILEPATH);
        useFileWriter(str2, FILEPATH);
        useBufferedOutPutStream(list, FILEPATH);
    }

    /**
     * Static method of Writing, using the FileWriter class
     *
     * @param content
     * @param filePath
     * @throws IOException
     * @see Writer as an abstract class for basica implementation...
     * All connections must be closed immediately,after using of main writing thread for safety
     */
    public static void useFileWriter(String content, String filePath) {
        Writer writer = null;
        try {
            writer = new FileWriter(filePath);
            writer.write(content);
        } catch (IOException e) {
            System.err.println("Error writing the file: ");
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    System.err.println("Error closing the file :");
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Writing of file, using the BufferedWriter class
     *
     * @param content
     * @param filePath
     * @throws IOException
     */
    public static void useByBufferedFileWriter(List<String> content, String filePath) {
        File file = new File(filePath);
        Writer fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);

            for (String line : content) {
                line += System.getProperty("line.separator");
                bufferedWriter.write(line);

            }
        } catch (IOException e) {
            System.err.println("Error writing the file : ");
            e.printStackTrace();

        } finally {
            if (bufferedWriter != null && fileWriter != null) {
                try {
                    bufferedWriter.close();
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * OutputStream method, using the FileOutputStream
     *
     * @param content
     * @param filePath
     * @throws FileNotFoundException , IOException
     */
    public static void useFileOutputStream(String content, String filePath) {
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(new File(filePath));
            outputStream.write(content.getBytes(), 0, content.length());
        } catch (FileNotFoundException e) {
            System.err.println("Error Opening the file : ");
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Error writing the file : ");
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Method for writing via BufferedWriter and adapter OutputStream, glued with FileOutputStream
     *
     * @param content
     * @param filePath
     * @throws IOException
     * @see Writer as an abstract class for basica implementation...
     * All connections must be closed immediately,after using of main writing thread for safety
     */
    public static void useBufferedFileOutputStream(List<String> content, String filePath) {
        Writer writer = null;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filePath), "utf-8"));
            for (String line : content) {
                line += System.getProperty("line.separator");
                writer.write(line);
            }

        } catch (IOException e) {

        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (Exception e) {
                }
            }
        }
    }

    /**
     * Writing to file , using the BufferedOutputStream and adapter FileOutputStream
     * @param content
     * @param filePath
     * @exception IOException
     */
    public static void useBufferedOutPutStream(List<String> content, String filePath) {
        BufferedOutputStream bout = null;
        try {
            bout = new BufferedOutputStream(new FileOutputStream(filePath));
            for (String line : content) {
                line += System.getProperty("line.separator");
                bout.write(line.getBytes());
            }
        } catch (IOException e) {

        } finally {
            if (bout != null) {
                try {
                    bout.close();
                } catch (Exception e) {
                }
            }
        }
    }
}
