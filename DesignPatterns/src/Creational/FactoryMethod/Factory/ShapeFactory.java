package Creational.FactoryMethod.Factory;

/**
 * Created by Dell on 6/20/2015.
 */
public class ShapeFactory extends Factory{
    // use fabric method getShape, to get an object of type Shape
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

}
