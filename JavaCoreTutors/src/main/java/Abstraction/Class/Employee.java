package Abstraction.Class;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public class Employee extends Person {

    private  int empId;

    public Employee(String name, String gender, int id) {
        super(name, gender);
        this.empId = id;
    }

    @Override
    public void work() {
        if (empId == 0){
            System.out.println("Error");
        } else {
            System.out.println("Working as employee!");
        }
    }

    public static void main(String[] args) {
        Person ceo = new Employee("Steve", "Male", 0);
        Person employee = new Employee("Oleg", "Male", 1);
        ceo.work();
        employee.work();
        System.out.println(employee.toString());
    }
}
