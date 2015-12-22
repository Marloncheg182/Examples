package NIO.OtherTutors.MappedByteBuffer;

import java.io.File;
import java.io.IOException;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.EnumSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Oleg Romanenchuk on 9/16/2015.
 */
public class App {
    private static final Logger logger = Logger.getLogger("App");

    private static final String FILE_READ = "rafRead.txt";

    private static final String FILE_WRITE = "C:\\Tmp\\rafWrite.txt";

    public static Path getFileURIFromClasspath(String fileName) {
        Path result = null;

        String classpath = System.getProperty("java.class.path");
        result = FileSystems.getDefault().getPath(classpath + File.separator + fileName);

        return result;
    }

    public static void main(String[] args) {
        CharBuffer charBuffer = null;
        String charEncoding = null;
        MappedByteBuffer mappedByteBuffer = null;

        try {
            charEncoding = System.getProperty("file.encoding");

//            Read file
            Path pathRead = App.getFileURIFromClasspath(App.FILE_READ);
            if (Files.exists(pathRead, new LinkOption[]{LinkOption.NOFOLLOW_LINKS})){
                try(FileChannel fileChannel = (FileChannel)Files.newByteChannel(pathRead, EnumSet.of(StandardOpenOption.READ))){
                    mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0, fileChannel.size());

                    if (mappedByteBuffer != null){
                        logger.info("Reading file...");
                        charBuffer = Charset.forName(charEncoding).decode(mappedByteBuffer);
                        logger.info("File content: " + charBuffer.toString());
                    }
                }catch (IOException ioe){
                    logger.log(Level.SEVERE, ioe.getMessage());
                    ioe.printStackTrace();
                }
            }

//            Write a file
            Path pathWrite = FileSystems.getDefault().getPath(App.FILE_WRITE);
            if (Files.notExists(pathWrite, new LinkOption[]{LinkOption.NOFOLLOW_LINKS})){
                Files.createFile(pathWrite);
                try(FileChannel fileChannel = (FileChannel)Files.newByteChannel(pathWrite, EnumSet.of(StandardOpenOption.READ, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING))){
                    mappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, charBuffer.length());

                    if (mappedByteBuffer != null){
                        logger.info("Writing to file...");
                        mappedByteBuffer.put(Charset.forName(charEncoding).encode(charBuffer));
                        logger.info("Done!");
                    }
                }catch (IOException ioe){
                    logger.log(Level.SEVERE, ioe.getMessage());
                    ioe.printStackTrace();
                }
            }
        }catch (Exception e){
            logger.log(Level.SEVERE, e.getMessage());
            e.printStackTrace(System.err);
        }
    }
}
