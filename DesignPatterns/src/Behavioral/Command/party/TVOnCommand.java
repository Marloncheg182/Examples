package Behavioral.Command.party;

/**
 * Created by Dell on 6/19/2015.
 */
public class TVOnCommand implements Command {
    TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    public void execute() {
        this.tv.on();
        this.tv.setInputChannel();
    }

    public void undo() {
        this.tv.off();
    }
}
