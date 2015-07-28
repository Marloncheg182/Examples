package GOF.Structural.Adapter;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public interface Adapter {

    public UsbConnector geFirstVersion();

    public UsbConnector getSecondVersion();

    public UsbConnector getThirdVersion();
}
