package Patterns.Factory;

/**
 * Created by Oleg Romanenchuk on 8/16/2015.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar(CarType.SMALL));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
    }
}
