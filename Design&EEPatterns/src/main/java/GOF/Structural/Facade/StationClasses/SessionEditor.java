package GOF.Structural.Facade.StationClasses;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public class SessionEditor implements Session {
    private Session session;

    public SessionEditor(Session session) {
        this.session = session;
    }

    @Override
    public void close() throws Exception {
        this.session.close();
    }
    // method not finished yet
    @Override
    public Session getSignal() throws SessionException {
        return session.getSignal();
    }
}
