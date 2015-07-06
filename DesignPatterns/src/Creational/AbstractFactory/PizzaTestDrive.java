package Creational.AbstractFactory;

/**
 * Created by Dell on 6/19/2015.
 */
public class PizzaTestDrive {
    public PizzaTestDrive() {
    }

    public static void main(String[] args) {
        NYPizzaStore nyStore = new NYPizzaStore();
        ChicagoPizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");
        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza + "\n");
        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza + "\n");
        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza + "\n");
        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza + "\n");
        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza + "\n");
        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza + "\n");
        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza + "\n");
    }
}

// In this model we have a main Abstract Factory interface
// PizzaIngredientFactory, which provides a creation schema for all ingredients
// ChicagoIngredientFactory and NYIngredientFactory implements these methods
// These methods return the objects of products classes, which inherited
// from base ingredient classes and implement the main ingredient's interfaces
// These ingredient interfaces extends the Main Abstract Factory interface

// So
// ChicagoIngredientFactory and NYIngredientFactory implement PizzaIngredientFactory
// Interfaces Dough, Sauce, Cheese, Veggies, Peperoni, Clam it's a return exemplars
// for PizzaIngredientFactory. These interfaces is implemented by concrete Ingredient
// classes. The exemplars of this concrete Ingredients will be use in ChicagoIngredientFactory
// and NYIngredientFactory. Model PizzaStore - NYPizzaStore - ChicagoPizzaStore
// has a general schema for PizzaTypes

// When we order the CheesePizza in NYPizzaStore for example, this object links on
// IngredientFactory to build a model of this Pizza, which links us to
// NYIngredientFactory, and all ingredients will be taken as exemplars of ingredient
// classes. Class Pizza prepares this exemplar, which will be returned as pizza type
// in Main Drive class.