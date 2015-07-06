package Structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dell on 6/20/2015.
 */

// Factory of flyweights
// Implements separations of them in dependence of their statements
public class PrimitiveFactory {

    private static Point onePoint;
    private static Map<Integer, Circle> circles;
    private static Map<Integer, Square> squares;

    static {
        circles = new HashMap<Integer, Circle>();
        squares = new HashMap<Integer, Square>();
    }

    public static synchronized Picture createPicture(Primitive... childrens) {
        return new Picture(childrens);
    }

    public static synchronized Circle createCircle(int radius) {
        if (circles.get(radius) == null) {
            circles.put(radius, new Circle(radius));
        }
        return circles.get(radius);
    }

    public static synchronized Square createSquare(int height, int width) {
        if (squares.get(height * 10 + width) == null) {
            squares.put(height * 10 + width, new Square(height, width));
        }
        return squares.get(height * 10 + width);
    }

    public static synchronized Point createPoint() {
        if (onePoint == null) {
            onePoint = new Point();
        }
        return onePoint;
    }
}
