package Behavioral.Command.undo;

/**
 * Created by Dell on 6/19/2015.
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        this.speed = 0;
    }

    public void high() {
        this.speed = 3;
        System.out.println(this.location + " ceiling fan is on high");
    }

    public void medium() {
        this.speed = 2;
        System.out.println(this.location + " ceiling fan is on medium");
    }

    public void low() {
        this.speed = 1;
        System.out.println(this.location + " ceiling fan is on low");
    }

    public void off() {
        this.speed = 0;
        System.out.println(this.location + " ceiling fan is off");
    }

    public int getSpeed() {
        return this.speed;
    }
}
