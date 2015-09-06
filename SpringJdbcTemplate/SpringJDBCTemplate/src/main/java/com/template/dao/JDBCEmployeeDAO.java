package com.template.dao;

import com.example.Employee;

import java.util.List;

/**
 * Created by Oleg Romanenchuk on 9/6/2015.
 */
public interface JDBCEmployeeDAO {
    public void insert(Employee employee);
    public Employee findById(int id);
    public List<Employee> findAll();
    public String finNameById(int id);
    public void insertBatch1(final List<Employee> employees);
    public void insertBatch2(final String sql);
}
