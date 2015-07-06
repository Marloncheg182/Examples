package Behavioral.TemplateMethod;

/**
 * Created by Dell on 6/19/2015.
 */
public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    // prepareRecipe is a Template Method
    // because it's really a method
    // which serves like a template for
    // algorithms, in our case - Coffee preparing.

    abstract void brew();   // this method will be realized in sub-class

    abstract void addCondiments();   // this method will be realized in sub-class

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
}

