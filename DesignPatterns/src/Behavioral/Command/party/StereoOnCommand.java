package Behavioral.Command.party;

/**
 * Created by Dell on 6/19/2015.
 */
public class StereoOnCommand implements Command {
    Stereo stereo;

    public StereoOnCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        this.stereo.on();
    }

    public void undo() {
        this.stereo.off();
    }
}
