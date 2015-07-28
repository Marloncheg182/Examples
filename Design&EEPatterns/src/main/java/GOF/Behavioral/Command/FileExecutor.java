package GOF.Behavioral.Command;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class FileExecutor {

    private Command command;

    public FileExecutor(Command command) {
        this.command = command;
    }

    public void execute(){
        this.command.execute();
    }
}
