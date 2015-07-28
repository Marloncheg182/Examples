package GOF.Behavioral.Command;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class CloseFileCommand implements Command {

    private FileSystemReceiver receiver;

    public CloseFileCommand(FileSystemReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.closeFile();
    }
}
