package GOF.Structural.Facade;

import GOF.Structural.Facade.StationClasses.Signal;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class MTSConnector {
    public static Signal getMTSSignal(){
        return null;
    }

    public void getMTSIncoming(String stationName, Signal signal){}

    public void getMTSOutgoing(String stationName, Signal signal){}

    public void getRedirectionFromMTS(String stationName,Signal signal){}

}
