package Structural.Flyweight;

/**
 * Created by Dell on 6/19/2015.
 */

// Circle - a separated flyweight. Inner statement is a radius.
public class Circle implements Primitive {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }



    @Override
    public void draw(Context context) {

    }
}
