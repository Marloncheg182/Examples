package com.example;

import com.example.model.Employee;
import com.example.service.EmployeeService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Oleg Romanenchuk on 9/6/2015.
 */
public class Runner {
    public static void main(String[] args) {
        System.out.println("Load context");
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Oleg");
        employee.setAge(25);
        EmployeeService employeeService =(EmployeeService)context.getBean("employeeService");
        employeeService.persistEmployee(employee);
        System.out.println("Uploaded age :" + employeeService.findEmployeeById(1).getAge());
        employee.setAge(26);
        employeeService.updateEmployee(employee);
        System.out.println("Updated age :" + employeeService.findEmployeeById(1).getAge());
        employeeService.deleteEmployee(employee);
        context.close();
    }
}
