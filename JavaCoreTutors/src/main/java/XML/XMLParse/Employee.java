package XML.XMLParse;

/**
 * Created by O1e6 <NsN> on 11/19/2015.
 */
public class Employee {
    private String ID;
    private String Firstname;
    private String Lastname;
    private int age;
    private double salary;

    public Employee(String ID, String firstname, String lastname, int age, double salary) {
        this.ID = ID;
        Firstname = firstname;
        Lastname = lastname;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {

    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ID='" + ID + '\'' +
                ", Firstname='" + Firstname + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
