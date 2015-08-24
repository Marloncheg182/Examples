package Patterns.Prototype;

/**
 * Created by Oleg Romanenchuk on 8/16/2015.
 */
public class Movie implements PrototypeCapable {
    private  String name = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Movie clone() throws CloneNotSupportedException {
        System.out.println("Cloning Movie object..");
        return (Movie)super.clone();
    }

    @Override
    public String toString() {
        return "Movie{}";
    }
}
