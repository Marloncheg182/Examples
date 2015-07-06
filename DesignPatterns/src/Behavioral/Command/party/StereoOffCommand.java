package Behavioral.Command.party;

/**
 * Created by Dell on 6/19/2015.
 */
public class StereoOffCommand implements Command {
    Stereo stereo;

    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    public void execute() {
        this.stereo.off();
    }

    public void undo() {
        this.stereo.on();
    }
}
