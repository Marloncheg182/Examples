package com.template;

import com.example.Employee;
import com.template.dao.JDBCEmployeeDAO;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleg Romanenchuk on 9/6/2015.
 */
public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        JDBCEmployeeDAO jdbcEmployeeDAO = (JDBCEmployeeDAO) context.getBean("jdbcEmployeeDAO");

        Employee emplNew1 = new Employee(3, "Kirill", 25);
        Employee emplNew2 = new Employee(4, "Mary", 30);
        List<Employee> employeesN = new ArrayList();
        employeesN.add(emplNew1);
        employeesN.add(emplNew2);
        jdbcEmployeeDAO.insertBatch1(employeesN);
        System.out.println(" inserted rows: " + employeesN);

        System.out.println(" FindAll : " + jdbcEmployeeDAO.findAll());
        jdbcEmployeeDAO.insertBatch2("UPDATE EMPLOYEE SET NAME ='Mary'");

        List<Employee> employees = jdbcEmployeeDAO.findAll();
        System.out.println("Updated column name of table: " + employees);

        System.out.println(" FindAll : " + jdbcEmployeeDAO.findAll());
        context.close();
    }

}

