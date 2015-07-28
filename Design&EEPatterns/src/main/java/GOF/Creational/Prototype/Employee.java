package GOF.Creational.Prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public class Employee implements Cloneable {

    private List<String> empList;

    public Employee() {
        empList = new ArrayList<String>();
    }

    public Employee(List<String> list) {
        this.empList = list;
    }

    public void loadData() {

        empList.add("Oeg");
        empList.add("Vitali");
        empList.add("Maria");
        empList.add("Sergey");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<String>();
        for (String s : this.getEmpList()) {
            temp.add(s);
        }
        return new Employee(temp);
    }
}