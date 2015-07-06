package Behavioral.Command.party;

/**
 * Created by Dell on 6/19/2015.
 */
public class StereoOnWithCDCommand implements Command {
    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        this.stereo.on();
        this.stereo.setCD();
        this.stereo.setVolume(11);
    }

    public void undo() {
        this.stereo.off();
    }
}

