package Behavioral.Command.undo;

/**
 * Created by Dell on 6/19/2015.
 */
public class Light {
    String location;
    int level;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        this.level = 100;
        System.out.println("Light is on");
    }

    public void off() {
        this.level = 0;
        System.out.println("Light is off");
    }

    public void dim(int level) {
        this.level = level;
        if(level == 0) {
            this.off();
        } else {
            System.out.println("Light is dimmed to " + level + "%");
        }

    }

    public int getLevel() {
        return this.level;
    }
}
