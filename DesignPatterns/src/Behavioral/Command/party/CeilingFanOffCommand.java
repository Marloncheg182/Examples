package Behavioral.Command.party;

/**
 * Created by Dell on 6/19/2015.
 */
public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        this.prevSpeed = this.ceilingFan.getSpeed();
        this.ceilingFan.off();
    }

    public void undo() {
        switch(this.prevSpeed) {
            case 1:
                this.ceilingFan.low();
                break;
            case 2:
                this.ceilingFan.medium();
                break;
            case 3:
                this.ceilingFan.high();
                break;
            default:
                this.ceilingFan.off();
        }

    }
}
