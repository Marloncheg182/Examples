package Structural.Facade;

/**
 * Created by Dell on 6/19/2015.
 */
public class Projector {
    String description;
    DvdPlayer dvdPlayer;

    public Projector(String description, DvdPlayer dvdPlayer) {
        this.description = description;
        this.dvdPlayer = dvdPlayer;
    }

    public void on() {
        System.out.println(this.description + " on");
    }

    public void off() {
        System.out.println(this.description + " off");
    }

    public void wideScreenMode() {
        System.out.println(this.description + " in widescreen mode (16x9 aspect ratio)");
    }

    public void tvMode() {
        System.out.println(this.description + " in tv mode (4x3 aspect ratio)");
    }

    public String toString() {
        return this.description;
    }
}
