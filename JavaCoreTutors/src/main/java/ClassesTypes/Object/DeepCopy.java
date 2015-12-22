package ClassesTypes.Object;

/**
 * Created by O1e6 <NsN> on 12/20/2015.
 */
public class DeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
  Employees employees = new Employees("M", "A");
        employees.setValue(40000.0);
        employees.addr = new Address("First Street", "San F", "CA", "93702");
        Employees employees2 = (Employees)employees.clone();
        printEmployee(employees);

        printEmployee(employees2);


        employees2.setlN("Smith");

        employees2.addr = new Address("Street", "B", "CA", "93722");


        printEmployee(employees);

        printEmployee(employees2);

    }

    private static void printEmployee(Employees e) {

        System.out.println(e.getfN() + " " + e.getlN());

        System.out.println(e.addr.getAddr());

        System.out.println("Salary: " + e.getValue());
    }
}

class Employees implements Cloneable {
    private String lN;
    private String fN;
    private Double value;
    public Address addr;

    public Employees(String lastName, String firstName) {
        this.lN = lastName;
        this.fN = firstName;
        this.addr = new Address();
    }

    public String getlN() {
        return this.lN;
    }

    public void setlN(String lastName) {
        this.lN = lastName;
    }

    public String getfN() {
        return fN;
    }

    public void setfN(String fN) {
        this.fN = fN;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double selary) {
        this.value = selary;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employees emp;
        try {
            emp = (Employees) super.clone();
            emp.addr = (Address) addr.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
        return emp;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[" + this.fN + " " + this.lN + ", "


                + this.value + "]";
    }
}
class Address implements Cloneable{
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address() {

        this.street = "";

        this.city = "";

        this.state = "";

        this.zipCode = "";
    }

    public Address(String street, String city, String state, String zipCode) {

        this.street = street;

        this.city = city;

        this.state = state;

        this.zipCode = zipCode;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            return super.clone();
        }catch (CloneNotSupportedException e){
            return null;
        }
    }
    public String getAddr(){
        return this.street + "n" + this.city + ", " + this.state + " " + this.zipCode;
    }
}