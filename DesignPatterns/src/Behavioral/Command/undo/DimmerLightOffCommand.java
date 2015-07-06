package Behavioral.Command.undo;

/**
 * Created by Dell on 6/19/2015.
 */
public class DimmerLightOffCommand implements Command {
    Light light;
    int prevLevel;

    public DimmerLightOffCommand(Light light) {
        this.light = light;
        this.prevLevel = 100;
    }

    public void execute() {
        this.prevLevel = this.light.getLevel();
        this.light.off();
    }

    public void undo() {
        this.light.dim(this.prevLevel);
    }
}
