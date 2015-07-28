package GOF.Structural.Facade;

import GOF.Structural.Facade.StationClasses.Signal;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public class LifeConnector {
    public static Signal getLifeSignal(){
        return null;
    }

    public void getLifeIncoming(String stationName, Signal signal){}

    public void getLifeOutgoing(String stationName, Signal signal){}

    public void getRedirectionFromLife(String stationName,Signal signal){}
}