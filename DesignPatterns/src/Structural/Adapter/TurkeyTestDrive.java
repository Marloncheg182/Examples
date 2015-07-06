package Structural.Adapter;

/**
 * Created by Dell on 6/19/2015.
 */
public class TurkeyTestDrive {
    public TurkeyTestDrive() {
    }

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        DuckAdapter duckAdapter = new DuckAdapter(duck);

        for (int i = 0; i < 10; ++i) {
            System.out.println("The DuckAdapter says...");
            duckAdapter.gobble();
            duckAdapter.fly();
        }

    }
}