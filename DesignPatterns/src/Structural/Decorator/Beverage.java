package Structural.Decorator;

/**
 * Created by Dell on 6/18/2015.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription()
    {
        return description;
    }
    public abstract double cost();
}


// This pattern implement is used to give new options in existed model
// Beverage is an abstract class model for subclasses with concrete exemplars
// They implement methods and inject the overriding to realize this methods
// CondimentDecorator is a main Decorator abstract class, which will be extended
// by concrete Decorators. These decorators implement all methods and build a model.
// When we create an exemplar of Beverage, using model of concrete sub-class,
// we cover this model by Decorators, using NEW operator.