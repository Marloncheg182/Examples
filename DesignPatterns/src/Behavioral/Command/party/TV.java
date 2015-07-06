package Behavioral.Command.party;

/**
 * Created by Dell on 6/19/2015.
 */
public class TV {
    String location;
    int channel;

    public TV(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(this.location + " TV is on");
    }

    public void off() {
        System.out.println(this.location + " TV is off");
    }

    public void setInputChannel() {
        this.channel = 3;
        System.out.println(this.location + " TV channel is set for DVD");
    }
}
