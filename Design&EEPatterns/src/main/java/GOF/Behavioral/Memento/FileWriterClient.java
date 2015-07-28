package GOF.Behavioral.Memento;

/**
 * Created by Oleg Romanenchuk on 7/28/2015.
 */
public class FileWriterClient {
    public static void main(String[] args) {
        Temporary temporary = new Temporary();
        FileWriterUtil writerUtil = new FileWriterUtil("example.exe");
        writerUtil.write("Write some data to file");
        System.out.println(writerUtil + "\n\n");

        temporary.save(writerUtil);

        writerUtil.write("Write another package of data");
        System.out.println(writerUtil + "\n\n");

        temporary.undo(writerUtil);

        System.out.println(writerUtil + "\n\n");
    }
}
