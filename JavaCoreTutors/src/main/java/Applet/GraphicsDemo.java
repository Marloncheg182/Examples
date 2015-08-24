package Applet;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Oleg Romanenchuk on 8/19/2015.
 */
public class GraphicsDemo extends Applet {
    public void paint(Graphics graphics)
    {
        graphics.setColor(Color.red);
        graphics.drawString("Welcome", 50, 50);
        graphics.drawLine(20, 30, 20, 300);
        graphics.drawRect(70, 100, 30, 30);
        graphics.fillRect(170, 100, 30, 30);
        graphics.drawOval(70, 200, 30, 30);

        graphics.setColor(Color.pink);
        graphics.fillOval(170,200,30,30);
        graphics.drawArc(90,150,30,30,30,270);
        graphics.fillArc(270,150,30,30,0,180);
    }
}
