package Applet.DrawImageinApplet;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by O1e6 <NsN> on 11/24/2015.
 */
public class DrawImage extends Applet {
    private static final long serialVersionUID = 2530894095587089544L;

    private Image image;

    public void init(){
        image = getImage(getDocumentBase(), "http://weknowyourdreams.com/image.php?pic=/images/space/space-09.jpg");
    }

    public void paint(Graphics graphics){
        graphics.drawImage(image, 0, 0 , this);
    }

}
