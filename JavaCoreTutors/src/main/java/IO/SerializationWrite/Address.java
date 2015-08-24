package IO.SerializationWrite;

import java.io.Serializable;

/**
 * Created by Oleg Romanenchuk on 8/12/2015.
 */
public class Address implements Serializable {

    String street;
    String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return new StringBuffer(" Street : ")
                .append(this.street)
                .append(" Country : ")
                .append(this.country).toString();
    }
}
