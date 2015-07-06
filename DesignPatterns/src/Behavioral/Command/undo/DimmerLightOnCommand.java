package Behavioral.Command.undo;

/**
 * Created by Dell on 6/19/2015.
 */
public class DimmerLightOnCommand implements Command {
    Light light;
    int prevLevel;

    public DimmerLightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.prevLevel = this.light.getLevel();
        this.light.dim(75);
    }

    public void undo() {
        this.light.dim(this.prevLevel);
    }
}
