package Behavioral.Command.remote;



/**
 * Created by Dell on 6/19/2015.
 */
public class LivingroomLightOffCommand implements Command {
    Light light;

    public LivingroomLightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.off();
    }
}
