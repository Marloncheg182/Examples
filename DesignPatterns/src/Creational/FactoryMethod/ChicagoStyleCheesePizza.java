package Creational.FactoryMethod;

/**
 * Created by Dell on 6/18/2015.
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish and Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    void cut()
    {
        System.out.println("Cutting the pizza into square slice");
    }
}
