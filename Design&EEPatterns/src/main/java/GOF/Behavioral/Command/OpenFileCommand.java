package GOF.Behavioral.Command;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class OpenFileCommand implements Command {

    private FileSystemReceiver receiver;

    public OpenFileCommand(FileSystemReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.openFile();
    }
}
