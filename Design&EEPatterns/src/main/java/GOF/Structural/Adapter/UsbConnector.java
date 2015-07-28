package GOF.Structural.Adapter;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public class UsbConnector {

    private double usbVersions;

    public UsbConnector(double usbv) {
        this.usbVersions = usbv;
    }

    public double getUsbVersions() {
        return usbVersions;
    }

    public void setUsbVersions(double usbVersions) {
        this.usbVersions = usbVersions;
    }
}
