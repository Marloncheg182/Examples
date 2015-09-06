package com.example.dao;

import com.example.model.Employee;

/**
 * Created by Oleg Romanenchuk on 9/6/2015.
 */
public interface EmployeeDAO {

    void persistEmployee(Employee employee);

    Employee findEmployeeById(int id);

    void updateEmployee(Employee employee);

    void deleteEmployee(Employee employee);
}
