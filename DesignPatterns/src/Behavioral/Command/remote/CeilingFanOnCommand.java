package Behavioral.Command.remote;

/**
 * Created by Dell on 6/19/2015.
 */
public class CeilingFanOnCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        this.ceilingFan.high();
    }
}
