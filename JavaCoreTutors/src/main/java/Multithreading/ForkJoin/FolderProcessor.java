package Multithreading.ForkJoin;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

/**
 * Created by Oleg Romanenchuk on 8/17/2015.
 */
public class FolderProcessor extends RecursiveTask<List<String>> {

    private static final long serialVersionUID = 1L;

    private final String path;

    private final String extension;

    public FolderProcessor(String extension, String path) {
        this.extension = extension;
        this.path = path;
    }

    @Override
    protected List<String> compute() {
        List<String>list = new ArrayList<String>();
        List<FolderProcessor>tasks = new ArrayList<FolderProcessor>();
        File file = new File(path);
        File content[] = file.listFiles();
        if (content !=null)
        {
            for (int i = 0; i < content.length; i++){
                if (content[i].isDirectory())
                {
                    FolderProcessor task = new FolderProcessor(content[i].getAbsolutePath(), extension);
                    task.fork();
                    tasks.add(task);
                }
                else {
                    if (checkFile(content[i].getName()))
                    {
                        list.add(content[i].getAbsolutePath());
                    }
                }
            }
        }
        if (tasks.size()> 50)
        {
            System.out.printf("%s: %d tasks ran.\n", file.getAbsolutePath(), tasks.size());
        }
        addResultsFromTasks(list,tasks);
        return list;
    }
    private void addResultsFromTasks(List<String>list, List<FolderProcessor>tasks)
    {
        for (FolderProcessor item : tasks) {
            list.addAll(item.join());
        }
    }
    private boolean checkFile(String name){
        return name.endsWith(extension);
    }
}
