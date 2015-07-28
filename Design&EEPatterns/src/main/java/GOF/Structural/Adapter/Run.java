package GOF.Structural.Adapter;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public class Run {
    public static void main(String[] args) {
        testClassAdapter();
        testObjectAdapter();
    }

    private static void testObjectAdapter() {
        Adapter switcher = new ObjectAdapterImpl();
        UsbConnector first = getUSB(switcher, 1);
        UsbConnector second = getUSB(switcher, 2);
        UsbConnector third = getUSB(switcher, 3);
        System.out.println(first.getUsbVersions());
        System.out.println(second.getUsbVersions());
        System.out.println(third.getUsbVersions());
    }

    private static void testClassAdapter(){
      Adapter adapter = new AdapterClassImpl();
        UsbConnector first = getUSB(adapter, 1);
        UsbConnector second = getUSB(adapter, 2);
        UsbConnector third = getUSB(adapter, 3);
        System.out.println(first.getUsbVersions());
        System.out.println(second.getUsbVersions());
        System.out.println(third.getUsbVersions());
    }

    private static UsbConnector getUSB(Adapter adapter, int d){
        switch (d){
            case 1 :
                return adapter.geFirstVersion();
            case 2 :
                return adapter.getSecondVersion();
            case 3 :
                return adapter.getThirdVersion();
            default:
                return adapter.getThirdVersion();
        }
    }
}
