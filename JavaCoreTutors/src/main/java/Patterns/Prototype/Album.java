package Patterns.Prototype;

public class Album implements PrototypeCapable{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Album clone() throws CloneNotSupportedException {
        System.out.println("Cloning Album pbject..");
        return (Album)super.clone();
    }

    @Override
    public String toString() {
        return "Album{}";
    }
}
