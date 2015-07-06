package Behavioral.Strategy;

/**
 * Created by Dell on 6/18/2015.
 */
public class MiniDuckSimulator {
    public static void main(String[] args) {

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performQuack();
        model.performQuack();
    }
}
