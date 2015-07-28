package GOF.Behavioral.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class ChannelCollectionImpl implements ChannelCollection {

    private List<Channel> channels;

    public ChannelCollectionImpl() {
        channels = new ArrayList<>();
    }

    @Override
    public void addChannel(Channel c) {
        this.channels.add(c);

    }

    @Override
    public void removeChannel(Channel c) {
        this.channels.remove(c);

    }

    @Override
    public ChannelIterator iterator(ChannelType type) {
        return new IteratorImpl(type, this.channels);
    }

    private class IteratorImpl implements ChannelIterator{
        private ChannelType type;
        private List<Channel> channelList;
        private int position;

        public IteratorImpl(ChannelType tp, List<Channel> channel) {
            this.type = tp;
            this.channelList = channel;
        }

        @Override
        public boolean hasNext() {
            while (position < channelList.size()){
                Channel c = channelList.get(position);
                if (c.getTYPE().equals(type) || type.equals(ChannelType.ALL)){
                    return true;
                } else
                    position++;
            }
            return false;
        }

        @Override
        public Channel next() {
            Channel c = channelList.get(position);
            position++;
            return c;
        }
    }
}
