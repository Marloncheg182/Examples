package NIO;

import java.net.URI;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.spi.FileSystemProvider;

/**
 * Created by Oleg Romanenchuk on 8/16/2015.
 */
public class WorkingWithNIOPath {
    public static void main(String[] args) {
        defineAbsolutePath();
        defineRelativePathRoot();
        defineRelativePathToWorkingFolder();
        UsingFileSystemGetDefault();
        UsingSystemProperty();
    }

    private static void defineAbsolutePath(){
        Path absolutePath1 = Paths.get("D:/Internet downloads/", "Структуры данных в картинках.pdf");
        Path absolutePath2 = Paths.get("D:/","Internet downloads/", "Структуры данных в картинках.pdf");

        System.out.println(absolutePath1);
        System.out.println(absolutePath2);
    }
    private static void defineRelativePathRoot(){
        Path relativePath = FileSystems.getDefault().getPath("Internet downloads", "Структуры данных в картинках.pdf");

        System.out.println(relativePath.toAbsolutePath().toString());
    }

    private static void defineRelativePathToWorkingFolder()
    {
        Path relativePath = Paths.get("Internet downloads", "Структуры данных в картинках.pdf");
        System.out.println(relativePath.toAbsolutePath().toString());
    }
    private static void definePathFromURI()
    {
        URI uri = URI.create("file://Internet download/Структуры данных в картинках.pdf");
        String scheme = uri.getScheme();
        if (scheme == null)throw new IllegalArgumentException("Missing scheme");

        if (scheme.equalsIgnoreCase("file"))
            System.out.println(FileSystems.getDefault().provider().getPath(uri).toAbsolutePath().toString());
        for (FileSystemProvider provider : FileSystemProvider.installedProviders()) {
            if (provider.getScheme().equalsIgnoreCase(scheme)){
                System.out.println(provider.getPath(uri).toAbsolutePath().toString());
                break;
            }
        }
    }
    private static void UsingFileSystemGetDefault(){
        FileSystem fileSystem = FileSystems.getDefault();
        Path path1 = fileSystem.getPath("Internet download/Структуры данных в картинках.pdf");
        Path path2 = fileSystem.getPath("D:/Internet downloads/", "Структуры данных в картинках.pdf");

        System.out.println(path1.toAbsolutePath().toString());
        System.out.println(path2.toAbsolutePath().toString());
    }

    private static void UsingSystemProperty(){
        Path path = FileSystems.getDefault().getPath(System.getProperty("user.home"), "downloads", "somefile.txt");
        System.out.println(path.toAbsolutePath().toString());
    }
}
