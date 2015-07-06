package Creational.FactoryMethod;

/**
 * Created by Dell on 6/18/2015.
 */
public class NYPizzaStore extends PizzaStore {
    Pizza pizza;
        @Override
    Pizza createPizza(String type) {
            if (type.equals("cheese")) {
                pizza = new NYStyleCheesePizza();
            } else if (type.equals("veggie")) {
                pizza = new NYStyleVeggiePizza();
            } else if (type.equals("clam")) {
                pizza = new NYStyleClamPizza();
            } else if (type.equals("pepperoni")) {
                pizza = new NYStylePepperoniPizza();

        } else {
                System.out.println("Error: invalid type of pizza");

            }
            return null;
    }
}
