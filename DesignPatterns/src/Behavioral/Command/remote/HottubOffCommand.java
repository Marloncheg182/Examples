package Behavioral.Command.remote;



/**
 * Created by Dell on 6/19/2015.
 */
public class HottubOffCommand implements Command {
    Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        this.hottub.cool();
        this.hottub.off();
    }
}
