package hello;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;

/**
 * Created by Oleg Romanenchuk on 8/19/2015.
 */
@Component
public class CountryRepository {
    private static final List<Country> countries = new ArrayList<Country>();

    @PostConstruct
    public void initData(){
        Country spain = new Country();
        spain.setName("Spain");
        spain.setCapital("Madrid");
        spain.setCurrency(Currency.EUR);
        spain.setPopulation(46704314);

        countries.add(spain);

        Country poland = new Country();
        poland.setName("Poland");
        poland.setCapital("Warsaw");
        poland.setCurrency(Currency.PLN);
        poland.setPopulation(38186860);

        countries.add(poland);

        Country greatBritain = new Country();
        greatBritain.setName("United Kingdom");
        greatBritain.setCapital("London");
        greatBritain.setCurrency(Currency.GBP);
        greatBritain.setPopulation(63705000);

        countries.add(greatBritain);
    }
    public Country findCountry(String name){
        Assert.notNull(name);

        Country result = null;
        for (Country country : countries) {
            if (name.equals(country.getName())){
                result = country;
            }
        }
        return result;
    }
}
