package mvc.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Past;
import java.util.Date;

/**
 * Created by Dell on 6/14/2015.
 */

public class User {
    private String name;

    @DateTimeFormat(pattern = "MM/dd/yyyy")
    @Past
    @Year(2000)
    private Date date;

    @Phone
    private String phone;

    public User() {
        this.name = name;
        this.date = date;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

