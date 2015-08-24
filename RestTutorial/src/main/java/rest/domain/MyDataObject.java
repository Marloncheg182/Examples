package rest.domain;

import java.util.Calendar;

/**
 * Created by Oleg Romanenchuk on 8/17/2015.
 */
public class MyDataObject {
    private Calendar time;
    private String message;

    public MyDataObject(Calendar time, String message) {
        this.message = message;
        this.time = time;
    }

    public MyDataObject() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Calendar getTime() {
        return time;
    }

    public void setTime(Calendar time) {
        this.time = time;
    }
}
