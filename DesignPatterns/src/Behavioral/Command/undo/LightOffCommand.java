package Behavioral.Command.undo;

/**
 * Created by Dell on 6/19/2015.
 */
public class LightOffCommand implements Command {
    Light light;
    int level;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.level = this.light.getLevel();
        this.light.off();
    }

    public void undo() {
        this.light.dim(this.level);
    }
}
