package GOF.Structural.Adapter;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public class Switch {
    public UsbConnector getUsbConnector(){
        return new UsbConnector(1.0);
    }
}
