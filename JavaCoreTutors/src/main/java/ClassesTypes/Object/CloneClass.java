package ClassesTypes.Object;

/**
 * Created by O1e6 <NsN> on 12/18/2015.
 */
public class CloneClass {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1 = new Employee("Mark", "Adams");
        e1.setValue(40000.0);
        Employee e2 = (Employee) e1.clone();
        e1.setLname("Smith");
        System.out.println(e1);
        System.out.println(e2);
    }
}
class Employee {
    private String lname;
    private String fname;
    private Double value;

    public Employee(String lname, String fname, Double value) {
        this.lname = lname;
        this.fname = fname;
        this.value = value;
    }

    public Employee(String lname, String fname) {
        this.lname = lname;
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee emp;
        emp = new Employee(this.lname, this.fname);
        emp.setValue(this.value);
        return emp;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "[" + this.fname + " " + this.lname + ", "
                + this.value + "]";
    }
}