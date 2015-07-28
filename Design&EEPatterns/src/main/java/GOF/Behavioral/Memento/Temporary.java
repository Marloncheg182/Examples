package GOF.Behavioral.Memento;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class Temporary {
    private Object object;

    public void save(FileWriterUtil writerUtil){
        this.object = writerUtil.save();
    }

    public void undo(FileWriterUtil writerUtil){
        writerUtil.cancel(object);
    }
}
