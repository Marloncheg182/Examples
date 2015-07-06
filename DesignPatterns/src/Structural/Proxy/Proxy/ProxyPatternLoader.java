package Structural.Proxy.Proxy;

/**
 * Created by Dell on 6/20/2015.
 */
public class ProxyPatternLoader {
    public static void main(String[] args) {
        Image image = new ProxyImage("Proxy.png");

        // image will be loaded from disk
        image.display();
        System.out.println("");

        // image will not be loaded from disk
        image.display();
    }
}
