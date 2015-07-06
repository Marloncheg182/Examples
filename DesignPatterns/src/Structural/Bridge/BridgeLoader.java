package Structural.Bridge;

/**
 * Created by Dell on 6/20/2015.
 */
public class BridgeLoader {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircle(), 100,100, 10);
        Shape greenCircle = new Circle(new GreenCircle(), 100,100, 10);

        redCircle.draw();
        greenCircle.draw();
    }
}
