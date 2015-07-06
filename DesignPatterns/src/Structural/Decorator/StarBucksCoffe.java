package Structural.Decorator;

/**
 * Created by Dell on 6/18/2015.
 */
public class StarBucksCoffe {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());

        Beverage beverage4 = new Decaf();
        beverage4 = new Milk(beverage4);
        beverage4 = new Mocha(beverage4);
        System.out.println(beverage4.getDescription()
                + " $" + beverage4.cost());

        // Typical adapter realization like autoboxing
        Beverage beverage5 = new HouseBlend();
        beverage5 = new Soy(new Mocha(new Whip(new Milk(beverage5))));
        System.out.println(beverage5.getDescription()
        + " $" + beverage5.cost());
    }
}
