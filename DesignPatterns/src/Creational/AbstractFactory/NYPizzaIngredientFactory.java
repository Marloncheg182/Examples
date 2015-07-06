package Creational.AbstractFactory;

/**
 * Created by Dell on 6/18/2015.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    // This interface realizes a building schema for NY template, using
    // the interfaces ingredients.
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(),new RedPepper() };
        return veggies;
    }
    @Override
    public Pepperoni createPepperoni(){
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
