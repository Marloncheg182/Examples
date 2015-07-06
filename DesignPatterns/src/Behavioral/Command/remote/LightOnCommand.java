package Behavioral.Command.remote;



/**
 * Created by Dell on 6/19/2015.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.on();
    }
}
