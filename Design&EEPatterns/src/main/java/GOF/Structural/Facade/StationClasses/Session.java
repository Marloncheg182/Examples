package GOF.Structural.Facade.StationClasses;

import java.sql.Wrapper;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */

public interface Session extends AutoCloseable {
    /**
     * Opens a <code>Session</code> object for phone call transmission
     * getSignal -  takes returns the transmission, returned <code>Session<</code>
     * @return a new default <code>Session</code> object
     * @exception SessionException if a signal access error occurs
     * or this method is called on a closed signal
     */
    Session getSignal() throws SessionException;
}
