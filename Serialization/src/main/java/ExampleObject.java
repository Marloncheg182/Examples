import java.io.Serializable;

/**
 * @author Oleg Romanenchuk
 */
public class ExampleObject implements Serializable {
    private static final long serialVersionUID = -299482035708790407L;

    private String name;
    private String gender;
    private int age;
    private String role;
    private String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "ExampleObject{" +
                "Name='" + this.name + '\'' +
                ", Gender='" + this.gender + '\'' +
                ", Age=" + this.age +
                ", Role='" + this.role + '\'' +
                '}';
    }
}
