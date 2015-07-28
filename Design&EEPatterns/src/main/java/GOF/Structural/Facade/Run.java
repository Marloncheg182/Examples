package GOF.Structural.Facade;

import GOF.Structural.Facade.StationClasses.Signal;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public class Run {
    public static void main(String[] args) {
        String stationName1 = "MTS GPRS";
        String stationName2 = "KIEVSTAR GPRS";
        String stationName3 = "LIFE GPRS";

        Signal signal = MTSConnector.getMTSSignal();
        MTSConnector mtsConnector = new MTSConnector();
        mtsConnector.getMTSIncoming(stationName1, signal);

        Signal signal1 = KievStarConnector.getKievStarSignal();
        KievStarConnector kievStarConnector = new KievStarConnector();
        kievStarConnector.getKievStarIncoming(stationName2, signal);

        Signal signal3 = LifeConnector.getLifeSignal();
        LifeConnector lifeConnector = new LifeConnector();
        lifeConnector.getLifeIncoming(stationName3, signal);

        ConnectorFacade.getCall(ConnectorFacade.OperatorType.MTS,
                ConnectorFacade.CallType.INCOMING, stationName1);
        ConnectorFacade.getCall(ConnectorFacade.OperatorType.KIEVSTAR,
                ConnectorFacade.CallType.OUTGOING, stationName2);
        ConnectorFacade.getCall(ConnectorFacade.OperatorType.LIFE,
                ConnectorFacade.CallType.REDIRECTION, stationName3);
    }
}
