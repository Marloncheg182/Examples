package Behavioral.Strategy;

/**
 * Created by Dell on 6/18/2015.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
