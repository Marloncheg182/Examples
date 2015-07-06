package Behavioral.Command.party;

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
        this.hottub.setTemperature(104);
        this.hottub.circulate();
    }

    public void undo() {
        this.hottub.off();
    }
}

