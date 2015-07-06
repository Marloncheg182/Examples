package Structural.Adapter;

/**
 * Created by Dell on 6/19/2015.
 */
public class DuckTestDrive {
    public DuckTestDrive() {
    }

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();
        System.out.println("\nThe Duck says...");
        testDuck(duck);
        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}

// We have a main Test Drive class, which creates an object MallardDuck and WildTurkey
// Mallard Duck implements the interface Duck and all his methods.
// TurkeyAdapter also implements this interface , but in this case we work with variable,
// linked on Turkey Interface, that's why TurkeyAdapter realizes Duck methods, but modifies
// them, added an adapter from Turkey.
// In this case, when we call for Turkey object we took the Turkey realizations.
