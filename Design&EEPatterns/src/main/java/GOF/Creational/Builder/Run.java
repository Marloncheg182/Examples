package GOF.Creational.Builder;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public class Run {
    Computer comp = new Computer.ComputerBuilder(
            "500 GB", "2 GB").setBluetoothEnabled(true)
            .setGraphicsCardEnabled(true).build();
}

