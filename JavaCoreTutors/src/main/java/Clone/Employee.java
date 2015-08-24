package Clone;

/**
 * Created by Oleg Romanenchuk on 8/16/2015.
 */
public class Employee implements Cloneable {
    private int employeeId;
    private String employeeName;
    private Department department;

    public Employee(Department dpt, int employeeId, String employeeName) {
        this.department = dpt;
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
