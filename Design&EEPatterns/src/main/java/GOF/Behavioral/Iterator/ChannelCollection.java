package GOF.Behavioral.Iterator;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public interface ChannelCollection {
    public void addChannel(Channel c);

    public void removeChannel(Channel c);

    public ChannelIterator iterator(ChannelType type);
}
