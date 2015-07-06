package J2EE.CompositeEntity;

/**
 * Created by Dell on 6/21/2015.
 */
public class CompositeEntityLoader {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data1");
        client.printData();
        client.setData("Second Test", "Data2");
        client.printData();
    }
}
