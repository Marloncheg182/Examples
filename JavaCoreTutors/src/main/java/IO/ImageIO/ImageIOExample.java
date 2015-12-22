package IO.ImageIO;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by Oleg Romanenchuk on 9/22/2015.
 */
public class ImageIOExample {
    public static void main(String[] args) {
        imageIOWrite();
    }

    private static void imageIOWrite() {
        BufferedImage bimage = null;
        try {
            File initialImage = new File("C://Users/Dell/Desktop/image.jpg");
            bimage = ImageIO.read(initialImage);

            ImageIO.write(bimage, "gif", new File("C://Users/Dell/Desktop/image.gif"));
            ImageIO.write(bimage, "jpg", new File("C://Users/Dell/Desktop/image.png"));
            ImageIO.write(bimage, "bmp", new File("C://Users/Dell/Desktop/image.bmp"));

        }catch (IOException e){
            System.out.println("Exception occurred :" + e.getMessage());
        }
        System.out.println("Images were written successfully.");

}
}
