package beans;

import javax.xml.bind.annotation.XmlType;

/**
 * Created by Dell on 7/27/2015.
 */
@XmlType(namespace = "http://www.myexample.ua/email")
public class Email {
    private String login;
    private String password;
    private String address;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
