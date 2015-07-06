package Creational.AbstractFactory;

/**
 * Created by Dell on 6/18/2015.
 */
public class ClamPizza extends Pizza{
    PizzaIngredientFactory ingridientFactory;

    public ClamPizza(PizzaIngredientFactory ingridientFactory) {
        this.ingridientFactory = ingridientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingridientFactory.createDough();
        sauce = ingridientFactory.createSauce();
        cheese = ingridientFactory.createCheese();
        clam = ingridientFactory.createClam();
    }
}
