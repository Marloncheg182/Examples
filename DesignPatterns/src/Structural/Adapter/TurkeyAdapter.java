package Structural.Adapter;

/**
 * Created by Dell on 6/19/2015.
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        this.turkey.gobble();
    }

    public void fly() {
        for(int i = 0; i < 5; ++i) {
            this.turkey.fly();
        }

    }
}

