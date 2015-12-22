package ClassesTypes.Constructors;

/**
 * Created by 1 on 10.11.2015.
 */
public class Employee extends  Person {
    private String job;

    public Employee(){
        super();
        this.job = "Unknown";
    }

    public Employee(String Name){
        super(Name);
        this.job = "Unknown";
    }

    public Employee(String Name, int Age, String Job){
        super(Name, Age);
        this.job = Job;
    }

    public String getJob() {
        return job;
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee("John");
        Employee employee3 = new Employee("John", 25, "Doctor");

        System.out.println(employee1.getName() + employee1.getAge());
        System.out.println(employee2.getName() + employee2.getAge());
        System.out.println(employee3.getName() + employee3.getAge());
    }
}
