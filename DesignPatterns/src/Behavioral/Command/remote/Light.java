package Behavioral.Command.remote;

/**
 * Created by Dell on 6/19/2015.
 */
public class Light {
    String location = "";

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(this.location + " light is on");
    }

    public void off() {
        System.out.println(this.location + " light is off");
    }
}
