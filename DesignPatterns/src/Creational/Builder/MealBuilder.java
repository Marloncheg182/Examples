package Creational.Builder;

/**
 * Created by Dell on 6/20/2015.
 */
public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal2 = new Meal();
        meal2.addItem(new ChickenBurger());
        meal2.addItem(new Pepsi());
        return meal2;
    }

}
