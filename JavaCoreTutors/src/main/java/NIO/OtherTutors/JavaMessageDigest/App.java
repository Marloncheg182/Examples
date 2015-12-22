package NIO.OtherTutors.JavaMessageDigest;

import java.math.BigInteger;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Oleg Romanenchuk on 9/16/2015.
 */
public class App {
    private static final Logger logger = Logger.getLogger("App");

    private static final String FILE1 = "file1ToHash.txt";
    private static final String FILE2 = "file2ToHash.txt";
    private static final String FILE3 = "file3ToHash.txt";

    private static final String MD5 = "MD5";
    private static final String SHA1 = "SHA-1";
    private static final String SHA256 = "SHA-256";

    public URI getFileURI(String fileName) throws Exception{
        URI result = this.getClass().getClassLoader().getResource(fileName).toURI();

        return result;
    }

    public static void main(String[] args) {
        try{
            App app = new App();
            MessageDigest messageDigest = MessageDigest.getInstance(App.MD5);

            Path path1 = Paths.get(app.getFileURI(App.FILE1));
            byte[] file1Bytes = Files.readAllBytes(path1);
            Path path2 = Paths.get(app.getFileURI(App.FILE2));
            byte[] file2Bytes = Files.readAllBytes(path2);
            Path path3 = Paths.get(app.getFileURI(App.FILE3));
            byte[] file3Bytes = Files.readAllBytes(path3);

            byte[] digestedFIle1Bytes = messageDigest.digest(file1Bytes);

            messageDigest.reset();

            byte[] digestedFile2Bytes = messageDigest.digest(file2Bytes);

            logger.info("Byte representation of File1 content: "
            + (new BigInteger(1, digestedFIle1Bytes)).toString(32));
            logger.info("Byte representation of File2 content: "
            + (new BigInteger(1, digestedFile2Bytes)).toString(32));
            logger.info(MessageDigest.isEqual(digestedFIle1Bytes, digestedFile2Bytes)? "Identical hashes" : "Different hashes");

            messageDigest.reset();

            byte[]digestedFile3Bytes = messageDigest.digest(file3Bytes);

            logger.info("Byte representation of File3 content: "
            + (new BigInteger(1, digestedFile3Bytes)).toString(32));
            logger.info(MessageDigest.isEqual(digestedFIle1Bytes, digestedFile2Bytes)? "Identical hashes" : "Different hashes");
        }catch (Exception e){
            logger.log(Level.SEVERE, e.getMessage());
            e.printStackTrace(System.err);
        }
    }
}
