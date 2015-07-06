package Structural.Facade;

/**
 * Created by Dell on 6/19/2015.
 */
public class PopcornPopper {
    String description;

    public PopcornPopper(String description) {
        this.description = description;
    }

    public void on() {
        System.out.println(this.description + " on");
    }

    public void off() {
        System.out.println(this.description + " off");
    }

    public void pop() {
        System.out.println(this.description + " popping popcorn!");
    }

    public String toString() {
        return this.description;
    }
}
