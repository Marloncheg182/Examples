package GOF.Structural.Flyweight;

import java.awt.*;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public interface Shape {
    public void draw(Graphics g, int x, int y, int width, int height,
                     Color color);
}
