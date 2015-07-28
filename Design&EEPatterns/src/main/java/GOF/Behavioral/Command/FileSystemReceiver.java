package GOF.Behavioral.Command;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public interface FileSystemReceiver {
    void openFile();
    void writeFile();
    void closeFile();
}
