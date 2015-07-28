package GOF.Structural.Facade;

import GOF.Structural.Facade.StationClasses.Signal;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public class ConnectorFacade {
    public static void getCall(OperatorType operatorType, CallType callType, String stationName) {
        Signal open = null;
        switch (operatorType) {
            case MTS:
                open = MTSConnector.getMTSSignal();
                MTSConnector mtsConnector = new MTSConnector();
                switch (callType) {
                    case INCOMING:
                        mtsConnector.getMTSIncoming(stationName, open);
                        break;
                    case OUTGOING:
                        mtsConnector.getMTSOutgoing(stationName, open);
                        break;
                    case REDIRECTION:
                        mtsConnector.getRedirectionFromMTS(stationName, open);
                        break;
                }
                break;
            case KIEVSTAR:
                open = KievStarConnector.getKievStarSignal();
                KievStarConnector kievStarConnector = new KievStarConnector();
                switch (callType) {
                    case INCOMING:
                        kievStarConnector.getKievStarIncoming(stationName, open);
                        break;
                    case OUTGOING:
                        kievStarConnector.getKievStarOutgoing(stationName, open);
                        break;
                    case REDIRECTION:
                        kievStarConnector.getRedirectionFromKievStar(stationName, open);
                        break;
                }
                break;
            case LIFE:
                open = LifeConnector.getLifeSignal();
                LifeConnector lifeConnector = new LifeConnector();
                switch (callType) {
                    case INCOMING:
                        lifeConnector.getLifeIncoming(stationName, open);
                        break;
                    case OUTGOING:
                        lifeConnector.getLifeOutgoing(stationName, open);
                        break;
                    case REDIRECTION:
                        lifeConnector.getRedirectionFromLife(stationName, open);
                        break;
                }
                break;

    }
}

public static enum OperatorType {
    MTS, KIEVSTAR, LIFE
}

public static enum CallType {
    INCOMING, OUTGOING, REDIRECTION
}
}