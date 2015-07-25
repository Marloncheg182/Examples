package exception;

import com.opensymphony.xwork2.ActionSupport;

import java.io.IOException;

/**
 * @author Oleg Romanenchuk
 */
public class SpecialAction extends ActionSupport {
    @Override
    public String execute() throws IOException {
        throw new IOException("IO exception occured");
    }
}
