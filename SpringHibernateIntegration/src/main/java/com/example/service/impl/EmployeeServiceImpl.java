package com.example.service.impl;

import com.example.dao.EmployeeDAO;
import com.example.model.Employee;
import com.example.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Oleg Romanenchuk on 9/6/2015.
 */
@Service("com/example/service/EmployeeService.java")
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDAO employeeDAO;

    @Transactional
    public void persistEmployee(Employee employee) {
        employeeDAO.persistEmployee(employee);
    }

    public Employee findEmployeeById(int id) {
        return employeeDAO.findEmployeeById(id);
    }

    public void updateEmployee(Employee employee) {
        employeeDAO.updateEmployee(employee);
    }

    public void deleteEmployee(Employee employee) {
        employeeDAO.deleteEmployee(employee);
    }
}
