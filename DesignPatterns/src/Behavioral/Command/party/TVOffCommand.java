package Behavioral.Command.party;

/**
 * Created by Dell on 6/19/2015.
 */
public class TVOffCommand implements Command {
    TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        this.tv.off();
    }

    public void undo() {
        this.tv.on();
    }
}

