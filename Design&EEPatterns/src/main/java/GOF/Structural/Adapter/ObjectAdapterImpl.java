package GOF.Structural.Adapter;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public class ObjectAdapterImpl implements Adapter{

    private Switch switcher = new Switch();
    @Override
    public UsbConnector geFirstVersion() {
        return switcher.getUsbConnector();
    }

    @Override
    public UsbConnector getSecondVersion() {
        UsbConnector c = switcher.getUsbConnector();
        return modify(c, 1.0);
    }

    @Override
    public UsbConnector getThirdVersion() {
        UsbConnector c = switcher.getUsbConnector();
        return modify(c, 2.0);
    }
    private UsbConnector modify(UsbConnector c, double d){
        return new UsbConnector(c.getUsbVersions() + d);
    }
}
