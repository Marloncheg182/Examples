package hello;

/**
 * Created by Oleg Romanenchuk on 8/19/2015.
 */
public class Country {
    private String name;
    private String capital;
    private Currency currency;
    private int population;


    public Country() {
    }

    public Country(String capital, Currency currency, String name, int population) {
        this.capital = capital;
        this.currency = currency;
        this.name = name;
        this.population = population;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Country{" +
                "capital='" + capital + '\'' +
                ", name='" + name + '\'' +
                ", currency='" + currency + '\'' +
                ", population=" + population +
                '}';
    }
}
