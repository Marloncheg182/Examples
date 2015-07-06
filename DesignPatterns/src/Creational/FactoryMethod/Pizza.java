package Creational.FactoryMethod;

import java.util.ArrayList;

/**
 * Created by Dell on 6/18/2015.
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("  " + toppings.get(i));
        }
    }
        void bake(){
        System.out.println("Bake for 25 minutes at 350 degrees");

    }
        void cut() {
            System.out.println("Cutting the pizza into diagonal slice");
        }
    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}

// This pattern provide creation of object, using factory method

// In this case, abstract class Pizza contains the general model of product
// Different Pizza products are a concrete Product models
// Class PizzaStore is a creator class, contains all building methods,
// and important factory method "abstract Pizza createPizza"
// which overrided in sub-classes - NY and Chicago Stores.
// This subclasses will select a model of a concrete Product

// In this pattern we deleagete the creation of concrete Pizza to
// subclasses like NYPizzaStore, and this class will implement the
// concrete model of creation, using overrided methods from base Store class.
