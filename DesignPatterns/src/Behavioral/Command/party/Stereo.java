package Behavioral.Command.party;

/**
 * Created by Dell on 6/19/2015.
 */
public class Stereo {
    String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(this.location + " stereo is on");
    }

    public void off() {
        System.out.println(this.location + " stereo is off");
    }

    public void setCD() {
        System.out.println(this.location + " stereo is set for CD input");
    }

    public void setDVD() {
        System.out.println(this.location + " stereo is set for DVD input");
    }

    public void setRadio() {
        System.out.println(this.location + " stereo is set for Radio");
    }

    public void setVolume(int volume) {
        System.out.println(this.location + " Stereo volume set to " + volume);
    }
}
