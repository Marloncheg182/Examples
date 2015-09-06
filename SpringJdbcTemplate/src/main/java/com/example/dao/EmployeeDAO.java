package com.example.dao;

import com.example.Employee;

/**
 * Created by Oleg Romanenchuk on 9/6/2015.
 */
public interface EmployeeDAO {
    public void insert(Employee employee);
    public Employee findById(int id);
}
