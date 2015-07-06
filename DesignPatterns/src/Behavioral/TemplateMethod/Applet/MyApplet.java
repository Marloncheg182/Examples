package Behavioral.TemplateMethod.Applet;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Dell on 6/19/2015.
 */
public class MyApplet extends Applet {
    String message;

    public void init(){
        message = "Hello World, I'm alive!";
        repaint();
    }
    public void start(){
        message = "Now I'm starting up...";
    }
    public void stop(){
        message = "Oh, no I'm being stopped...";
    }
    public void destroy(){
        message = "I'm destroyed...";
    }
    public void paint(Graphics graphics){
        graphics.drawString(message, 5, 15);
    }
}
