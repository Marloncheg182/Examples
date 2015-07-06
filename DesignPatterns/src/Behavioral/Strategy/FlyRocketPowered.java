package Behavioral.Strategy;

/**
 * Created by Dell on 6/18/2015.
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
