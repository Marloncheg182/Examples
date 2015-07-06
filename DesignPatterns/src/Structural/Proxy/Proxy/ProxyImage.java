package Structural.Proxy.Proxy;

/**
 * Created by Dell on 6/20/2015.
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage ==null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
