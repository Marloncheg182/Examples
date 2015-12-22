package Object.Clone;

/**
 * Created by Oleg Romanenchuk on 8/16/2015.
 */
public class TestCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department dept = new Department(1, "Human Resource");
        Employee original = new Employee(dept,1, "Admin");
        Employee cloned = (Employee)original.clone();
        System.out.println(cloned.getEmployeeId());

        System.out.println(original!=cloned);
        System.out.println(original.getClass()==cloned.getClass());
        System.out.println(original.equals(cloned));
    }
}
