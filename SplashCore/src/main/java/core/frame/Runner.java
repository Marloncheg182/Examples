package core.frame;

import javax.swing.*;

/**
 * Created by Oleg Romanenchuk on 8/18/2015.
 */
public class Runner {
    public static void main(String[] args) {
        SplashFrame splash = new SplashFrame();
        splash.engine.load();
        splash.setVisible(true);
        splash.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        splash.setLocationByPlatform(true);
    }
}

