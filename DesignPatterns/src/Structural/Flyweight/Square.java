package Structural.Flyweight;

/**
 * Created by Dell on 6/20/2015.
 */

// Separated flyweight is a square
// The inner statement - the weight and height.
public class Square implements Primitive {
    private int height, widht;


    public Square(int height, int widht) {
        this.height = height;
        this.widht = widht;
    }

    @Override
    public void draw(Context context) {

    }
}
