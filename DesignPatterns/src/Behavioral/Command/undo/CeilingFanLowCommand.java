package Behavioral.Command.undo;

/**
 * Created by Dell on 6/19/2015.
 */
public class CeilingFanLowCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        this.prevSpeed = this.ceilingFan.getSpeed();
        this.ceilingFan.low();
    }

    public void undo() {
        if(this.prevSpeed == 3) {
            this.ceilingFan.high();
        } else if(this.prevSpeed == 2) {
            this.ceilingFan.medium();
        } else if(this.prevSpeed == 1) {
            this.ceilingFan.low();
        } else if(this.prevSpeed == 0) {
            this.ceilingFan.off();
        }

    }
}
