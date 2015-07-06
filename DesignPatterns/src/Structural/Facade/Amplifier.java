package Structural.Facade;

/**
 * Created by Dell on 6/19/2015.
 */
public class Amplifier {
    String description;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;

    public Amplifier(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(this.description + " on");
    }

    public void off() {
        System.out.println(this.description + " off");
    }

    public void setStereoSound() {
        System.out.println(this.description + " stereo mode on");
    }

    public void setSurroundSound() {
        System.out.println(this.description + " surround sound on (5 speakers, 1 subwoofer)");
    }

    public void setVolume(int level) {
        System.out.println(this.description + " setting volume to " + level);
    }

    public void setTuner(Tuner tuner) {
        System.out.println(this.description + " setting tuner to " + this.dvd);
        this.tuner = tuner;
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println(this.description + " setting DVD player to " + dvd);
        this.dvd = dvd;
    }

    public void setCd(CdPlayer cd) {
        System.out.println(this.description + " setting CD player to " + cd);
        this.cd = cd;
    }

    public String toString() {
        return this.description;
    }
}
