package Behavioral.Command.remote;

import Behavioral.Command.*;

/**
 * Created by Dell on 6/19/2015.
 */
public class GarageDoor {
    String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println(this.location + " garage Door is Up");
    }

    public void down() {
        System.out.println(this.location + " garage Door is Down");
    }

    public void stop() {
        System.out.println(this.location + " garage Door is Stopped");
    }

    public void lightOn() {
        System.out.println(this.location + " garage light is on");
    }

    public void lightOff() {
        System.out.println(this.location + " garage light is off");
    }
}
