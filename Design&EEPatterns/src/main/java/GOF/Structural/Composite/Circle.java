package GOF.Structural.Composite;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public class Circle implements Shape {
    @Override
    public void draw(String color) {
        System.out.println("Drawing circle with color " + color);
    }
}