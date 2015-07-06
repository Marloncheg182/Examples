package Creational.AbstractFactory;

/**
 * Created by Dell on 6/18/2015.
 */
public class ChicagoPizzaStore extends PizzaStore {
    public ChicagoPizzaStore() {
    }

    protected Pizza createPizza(String item) {
        Object pizza = null;
        ChicagoPizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        if(item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            ((Pizza)pizza).setName("Chicago Style Cheese Pizza");
        } else if(item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            ((Pizza)pizza).setName("Chicago Style Veggie Pizza");
        } else if(item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            ((Pizza)pizza).setName("Chicago Style Clam Pizza");
        } else if(item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            ((Pizza)pizza).setName("Chicago Style Pepperoni Pizza");
        }

        return (Pizza)pizza;
    }
}