package Creational.FactoryMethod.Factory;

/**
 * Created by Dell on 6/20/2015.
 */
public class FactoryPatternLoader {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // get an object of Circle and call its draw method
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        // call draw method of Circle
        shape1.draw();

        // get an object of Rectangle and call its draw method
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        // call draw method of Rectangle
        shape2.draw();

        // get an object of Square and call its draw method
        Shape shape3 = shapeFactory.getShape("SQUARE");

        // call draw method of Square
        shape3.draw();
    }
}
