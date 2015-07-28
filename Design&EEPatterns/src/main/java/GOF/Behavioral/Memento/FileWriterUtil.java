package GOF.Behavioral.Memento;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class FileWriterUtil {

    private String fileName;
    private StringBuilder content;

    public FileWriterUtil(String fileName) {
        this.fileName = fileName;
        this.content = new StringBuilder();
    }

    @Override
    public String toString() {
        return this.content.toString();
    }

    public void write(String s){
        content.append(s);
    }

    public Memento save(){
        return new Memento(this.fileName, this.content);
    }

    public void cancel(Object o){
    Memento memento = (Memento)o;
        this.fileName = memento.filename;
        this.content = memento.content;
    }

    private class Memento {
        private String filename;
        private StringBuilder content;

        public Memento(String filename, StringBuilder content){
            this.filename = fileName;
            this.content = new StringBuilder(content);
        }
    }
}
