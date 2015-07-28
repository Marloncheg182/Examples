package GOF.Behavioral.Iterator;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class Channel {
    private double frequency;
    private ChannelType TYPE;

    public Channel(double frequency, ChannelType type) {
        this.frequency = frequency;
        this.TYPE = type;
    }

    public double getFrequency() {
        return frequency;
    }

    public ChannelType getTYPE() {
        return TYPE;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "frequency=" + frequency +
                ", TYPE=" + TYPE +
                '}';
    }
}
