package Structural.Adapter;

/**
 * Created by Dell on 6/19/2015.
 */
public class WildTurkey implements Turkey {
    public WildTurkey() {
    }

    public void gobble() {
        System.out.println("Gobble gobble");
    }

    public void fly() {
        System.out.println("I\'m flying a short distance");
    }
}
