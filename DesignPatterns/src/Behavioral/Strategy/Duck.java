package Behavioral.Strategy;

/**
 * Created by Dell on 6/18/2015.
 */
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
// This is the main class Duck, which will be a base model for all ducks.
// This class incapsulates the linked variables flyBehaviour, quackBehavior
// from interfaces FlyBehaviour, QuackBehavior/
// Those interfaces contain the general methods fly and quack, which will be
// inherited and implemented in classes, which implements this interfaces
// In this case, when we create an object of subclass (extended Duck, he will
// get a variables flyBehaviour, quackBehavior and implement methods from behavior
// classes.