package Patterns.Prototype;

public class Show implements PrototypeCapable{
    private String name = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PrototypeCapable clone() throws CloneNotSupportedException {
        System.out.println("Cloning Show object..");
        return (Show)super.clone();
    }

    @Override
    public String toString() {
        return "Show{}";
    }
}
