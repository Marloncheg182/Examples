package com.example;

import com.example.dao.EmployeeDAO;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Oleg Romanenchuk on 9/6/2015.
 */
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext();
        EmployeeDAO employeeDAO = (EmployeeDAO)context.getBean("EmployeeDAO");
        Employee employee1 = new Employee(1, "Oleg", 25);
        employeeDAO.insert(employee1);
        Employee employee2 = employeeDAO.findById(1);
        System.out.println(employee2);
        context.close();
    }
}
