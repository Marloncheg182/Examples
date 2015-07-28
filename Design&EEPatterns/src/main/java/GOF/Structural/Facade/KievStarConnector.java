package GOF.Structural.Facade;

import GOF.Structural.Facade.StationClasses.Signal;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public class KievStarConnector {
    public static Signal getKievStarSignal(){
        return null;
    }

    public void getKievStarIncoming(String stationName, Signal signal){}

    public void getKievStarOutgoing(String stationName, Signal signal){}

    public void getRedirectionFromKievStar(String stationName,Signal signal){}

}