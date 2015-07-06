package Creational.FactoryMethod;

/**
 * Created by Dell on 6/18/2015.
 */
public class ChicagoPizzaStore extends PizzaStore {
    Pizza pizza;

    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        } else if (type.equals("clam")) {
            pizza = new ChicagoStyleClamPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();

        } else {
            System.out.println("Error: invalid type of pizza");

        }
        return null;
    }

}
