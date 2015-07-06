package Behavioral.Strategy;

/**
 * Created by Dell on 6/18/2015.
 */
public class RubberDuck extends Duck{
    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber duck!");
    }
}
