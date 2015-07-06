package Creational.AbstractFactory;

/**
 * Created by Dell on 6/18/2015.
 */
public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingridientFactory;

    public CheesePizza(PizzaIngredientFactory ingridientFactory) {
        this.ingridientFactory = ingridientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preaparing " + name);
        dough = ingridientFactory.createDough();
        sauce = ingridientFactory.createSauce();
        cheese = ingridientFactory.createCheese();

    }
}
