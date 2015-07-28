package GOF.Structural.Adapter;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public class AdapterClassImpl extends Switch implements Adapter {
    @Override
    public UsbConnector geFirstVersion() {
        return getUsbConnector();
    }

    @Override
    public UsbConnector getSecondVersion() {
        UsbConnector connector = getUsbConnector();
        return modify(connector,1.0);
    }

    @Override
    public UsbConnector getThirdVersion() {
        UsbConnector connector = getUsbConnector();
        return modify(connector,2.0);
    }

    private UsbConnector modify(UsbConnector c, double d){
        return new UsbConnector(c.getUsbVersions() + d);
    }
}
