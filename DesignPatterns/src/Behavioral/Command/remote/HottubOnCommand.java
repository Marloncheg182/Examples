package Behavioral.Command.remote;


/**
 * Created by Dell on 6/19/2015.
 */
public class HottubOnCommand implements Command {
    Hottub hottub;

    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    public void execute() {
        this.hottub.on();
        this.hottub.heat();
        this.hottub.bubblesOn();
    }
}
