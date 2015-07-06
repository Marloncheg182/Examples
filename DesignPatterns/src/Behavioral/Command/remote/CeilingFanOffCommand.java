package Behavioral.Command.remote;



/**
 * Created by Dell on 6/19/2015.
 */
public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        this.ceilingFan.off();
    }
}
