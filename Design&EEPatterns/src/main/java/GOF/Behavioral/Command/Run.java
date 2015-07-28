package GOF.Behavioral.Command;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class Run {
    public static void main(String[] args) {
        FileSystemReceiver receiver = FileSystemReceiverUtil.getFileSystem();
        OpenFileCommand open = new OpenFileCommand(receiver);
        FileExecutor fileExecutor = new FileExecutor(open);
        fileExecutor.execute();
        WriteFileCommand write = new WriteFileCommand(receiver);
        fileExecutor = new FileExecutor(write);
        fileExecutor.execute();
        CloseFileCommand close = new CloseFileCommand(receiver);
        fileExecutor = new FileExecutor(close);
        fileExecutor.execute();
    }
}
