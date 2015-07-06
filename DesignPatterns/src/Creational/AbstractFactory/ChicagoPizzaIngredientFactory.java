package Creational.AbstractFactory;

/**
 * Created by Dell on 6/19/2015.
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    // This interface realizes a building schema for Chicago template, using
    // the interfaces ingredients.
    public ChicagoPizzaIngredientFactory() {
    }

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        Veggies[] veggies = new Veggies[]{new BlackOlives(), new Spinach(), new Eggplant()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FrozenClams();
    }
}