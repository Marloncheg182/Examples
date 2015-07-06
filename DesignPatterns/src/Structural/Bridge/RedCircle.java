package Structural.Bridge;

/**
 * Created by Dell on 6/20/2015.
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red,radius: " + radius + ", x: " + x + ", " + y + "] ");
    }
}
