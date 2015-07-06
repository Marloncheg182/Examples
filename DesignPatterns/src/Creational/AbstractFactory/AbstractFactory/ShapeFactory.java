package Creational.AbstractFactory.AbstractFactory;

import Creational.AbstractFactory.AbstractFactory.AbstractFactory;

/**
 * Created by Dell on 6/20/2015.
 */
public class ShapeFactory extends AbstractFactory{
    // use fabric method getShape, to get an object of type Shape


    @Override
    public Shape getShape(String shapeType)
    {
        if (shapeType == null)
        {
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else  if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
      @Override
    Color getColor(String color) {
        return null;
    }
}
