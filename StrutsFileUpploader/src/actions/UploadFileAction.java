package actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.util.ServletContextAware;
import util.FilesUtil;

import javax.servlet.ServletContext;
import java.io.File;
import java.io.IOException;

/**
 * Created by Dell on 7/26/2015.
 */

public class UploadFileAction extends ActionSupport implements ServletContextAware {

    private static final long serialVersionUID = -4748500436762141116L;

    @Override
    public String execute(){
        System.out.println("File Name is:"+getFileFileName());
        System.out.println("File ContentType is:"+getFileContentType());
        System.out.println("Files Directory is:"+filesPath);
        try {
            FilesUtil.saveFile(getFile(), getFileFileName(), context.getRealPath("") + File.separator + filesPath);
        } catch (IOException e) {
            e.printStackTrace();
            return INPUT;
        }
        return SUCCESS;

    }

    private File file;
    private String fileContentType;
    private String fileFileName;
    private String filesPath;
    private ServletContext context;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getFileContentType() {
        return fileContentType;
    }

    public void setFileContentType(String fileContentType) {
        this.fileContentType = fileContentType;
    }

    public String getFileFileName() {
        return fileFileName;
    }

    public void setFileFileName(String fileFileName) {
        this.fileFileName = fileFileName;
    }

    public void setFilesPath(String filesPath) {
        this.filesPath = filesPath;
    }

    @Override
    public void setServletContext(ServletContext ctx) {
        this.context=ctx;
    }

}