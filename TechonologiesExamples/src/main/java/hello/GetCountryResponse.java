package hello;

/**
 * Created by Oleg Romanenchuk on 8/19/2015.
 */
public class GetCountryResponse {
    private String name;
    private Country country;

    public GetCountryResponse() {
    }

    public GetCountryResponse(Country country, String name) {
        this.country = country;
        this.name = name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
