package GOF.Behavioral.Iterator;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class Run {
    public static void main(String[] args) {
        ChannelCollection channels = new ChannelCollectionImpl();
        ChannelIterator iterator = channels.iterator(ChannelType.ALL);
        while (iterator.hasNext()){
            Channel c = iterator.next();
            System.out.println(c.toString());
        }
        System.out.println("******");

        ChannelIterator englishIterator = channels.iterator(ChannelType.ENGLISH);
        while (englishIterator.hasNext()){
            Channel c = englishIterator.next();
            System.out.println(c.toString());
        }
    }

    private static ChannelCollection setChannels(){
        ChannelCollection collection = new ChannelCollectionImpl();
        collection.addChannel(new Channel(100.1, ChannelType.ENGLISH));
        collection.addChannel(new Channel(100.5, ChannelType.GERMAN));
        collection.addChannel(new Channel(101.0, ChannelType.RUSSIAN));
        collection.addChannel(new Channel(102.0, ChannelType.UKRAINIAN));
        return collection;
    }
}
