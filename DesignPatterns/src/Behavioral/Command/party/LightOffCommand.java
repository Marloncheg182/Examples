package Behavioral.Command.party;

/**
 * Created by Dell on 6/19/2015.
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.off();
    }

    public void undo() {
        this.light.on();
    }
}
