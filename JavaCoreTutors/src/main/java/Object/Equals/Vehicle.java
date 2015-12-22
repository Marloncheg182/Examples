package Object.Equals;

/**
 * Created by Oleg Romanenchuk on 9/22/2015.
 */
public class Vehicle {
    private String model;
    private int yearOfProduction;
    private String manufacturer;

    public Vehicle() {
    }

    public Vehicle(String model, int yearOfProduction, String manufacturer) {
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.manufacturer = manufacturer;
    }


    public boolean equals(Vehicle v) {
        if (v == null)return false;

        return ((this.model).equals(v.model))
                &&(this.yearOfProduction == v.yearOfProduction)
                &&(this.manufacturer).equals(v.manufacturer);
    }
}
