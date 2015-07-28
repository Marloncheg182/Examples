package GOF.Behavioral.Command;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class FileSystemReceiverUtil {

    public static FileSystemReceiver getFileSystem(){
        String osName = System.getProperty("os.name");
        System.out.println("Underlying os" + osName);
        if (osName.contains("Windows")){
            return new WindowsFileSystemReceiver();
        }else {
            return new UnixFileSystemReceiver();
        }
    }
}
