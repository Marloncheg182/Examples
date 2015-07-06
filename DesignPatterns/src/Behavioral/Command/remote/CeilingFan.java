package Behavioral.Command.remote;

/**
 * Created by Dell on 6/19/2015.
 */
public class CeilingFan {
    String location = "";
    int level;
    public static final int HIGH = 2;
    public static final int MEDIUM = 1;
    public static final int LOW = 0;

    public CeilingFan(String location) {
        this.location = location;
    }

    public void high() {
        this.level = 2;
        System.out.println(this.location + " ceiling fan is on high");
    }

    public void medium() {
        this.level = 1;
        System.out.println(this.location + " ceiling fan is on medium");
    }

    public void low() {
        this.level = 0;
        System.out.println(this.location + " ceiling fan is on low");
    }

    public void off() {
        this.level = 0;
        System.out.println(this.location + " ceiling fan is off");
    }

    public int getSpeed() {
        return this.level;
    }
}
