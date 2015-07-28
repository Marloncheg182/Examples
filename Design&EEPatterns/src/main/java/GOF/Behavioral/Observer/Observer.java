package GOF.Behavioral.Observer;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public interface Observer {

    public void update();

    public void setSubject(Subject subject);
}
