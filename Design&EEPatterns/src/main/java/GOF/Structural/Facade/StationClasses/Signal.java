package GOF.Structural.Facade.StationClasses;

import GOF.Structural.Facade.StationClasses.Session;
import GOF.Structural.Facade.StationClasses.SessionException;

import java.sql.Wrapper;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 * I've written this interface, which have been created from example
 * of JDBC Connection, but i adapted it for Phone Station Connectior
 */


public interface Signal extends AutoCloseable{
    /**
     * Opens a <code>Session</code> object for phone call transmission
     * open -  takes returns the transmission, returned <code>Session<</code>
     * close - finishes the transmission, returned <code>Session<</code>
     * @return a new default <code>Session</code> object
     * @exception SessionException if a signal access error occurs
     * or this method is called on a closed signal
     */
    Session open() throws SessionException;
    void close() throws SessionException;

}
