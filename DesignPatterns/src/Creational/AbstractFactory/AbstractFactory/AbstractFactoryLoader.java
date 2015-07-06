package Creational.AbstractFactory.AbstractFactory;

/**
 * Created by Dell on 6/20/2015.
 */
public class AbstractFactoryLoader {
    public static void main(String[] args) {
        // get Shape Factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        // get an object of Shape Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        // call draw method to Shape Circle
        shape1.draw();

        // get an object of Shape Rectangle
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        // call draw method to Shape Rectangle
        shape2.draw();

        // get an object of Shape Square
        Shape shape3 = shapeFactory.getShape("SQUARE");

        // call draw method to Shape SQUARE
        shape3.draw();

        // get Color Factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        // get an object of Color Red
        Color color1 = colorFactory.getColor("RED");

        // call fill method of Red
        color1.fill();

        // get an object of Color Green
        Color color2 = colorFactory.getColor("GREEN");

        // call fill method of Green
        color2.fill();

        // get an object of Color Blue
        Color color3 = colorFactory.getColor("BLUE");

        // call fill method of Blue
        color3.fill();
    }
}
