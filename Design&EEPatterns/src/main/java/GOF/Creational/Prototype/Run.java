package GOF.Creational.Prototype;

import java.util.List;

/**
 * Created by Oleg Romanenchuk on 7/29/2015.
 */
public class Run {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee emp = new Employee();
        emp.loadData();


        Employee empNew = (Employee) emp.clone();
        Employee empNew1 = (Employee) emp.clone();
        List<String> list = empNew.getEmpList();
        list.add("Eric");
        List<String> list1 = empNew1.getEmpList();
        list1.remove("Oleg");

        System.out.println("emp List: "+emp.getEmpList());
        System.out.println("empNew List: "+list);
        System.out.println("empNew1 List: "+list1);
    }

}