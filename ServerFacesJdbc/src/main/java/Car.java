/**
 * @author Oleg Romanenchuk
 */
public class Car {

    private Integer car_id;
    private String cname;
    private String color;
    private Integer speed;
    private String manufactured_country;

    public Car() {
    }

    public Car(Integer car_id, String cname, String color, Integer speed, String manufactured_country) {
        this.car_id = car_id;
        this.cname = cname;
        this.color = color;
        this.speed = speed;
        this.manufactured_country = manufactured_country;
    }

    public Integer getCar_id() {
        return car_id;
    }

    public void setCar_id(Integer car_id) {
        this.car_id = car_id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public String getManufactured_country() {
        return manufactured_country;
    }

    public void setManufactured_country(String manufactured_country) {
        this.manufactured_country = manufactured_country;
    }
}
