package Creational.FactoryMethod;

/**
 * Created by Dell on 6/18/2015.
 */
public abstract class PizzaStore {

        public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    abstract Pizza createPizza(String type);
}
