package Behavioral.Strategy;

/**
 * Created by Dell on 6/18/2015.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
