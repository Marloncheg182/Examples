package Structural.Flyweight;

import java.awt.*;

/**
 * Created by Dell on 6/20/2015.
 */
// Context of drawing, is transferred by client to primitive for drawing
public final class Context {
    public final int x;
    public final int y;
    public final Color color;

    public Context(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
}
