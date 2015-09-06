package com;

import com.bean.Employee;
import com.dao.EmployeeDao;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

/**
 * Created by Oleg Romanenchuk on 9/2/2015.
 */
public class Runner {
    public static void main(String[] args) {
        try {
            ApplicationContext context = new ClassPathXmlApplicationContext("resources\\spring-configuration.xml");
            EmployeeDao employeeDao = (EmployeeDao)context.getBean("EmployeeDaoImpl");
            Employee employee = new Employee("Employee1");
            employeeDao.save(employee);
            System.out.println("Saved by id " + employee.getEmployeeId());

            Employee emp = employeeDao.findByPrimaryKey(employee.getEmployeeId());
            System.out.println(emp);

            ((ConfigurableApplicationContext)context).close();
        }catch (BeansException | SQLException e){
            e.printStackTrace();
        }
    }
}
