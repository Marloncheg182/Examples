package GOF.Behavioral.Command;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class WriteFileCommand implements Command {

    private FileSystemReceiver receiver;

    public WriteFileCommand(FileSystemReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.writeFile();
    }
}
