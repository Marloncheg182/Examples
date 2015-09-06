package com.dao;

import com.bean.Employee;

import java.sql.SQLException;

/**
 * Created by Oleg Romanenchuk on 9/2/2015.
 */
public interface EmployeeDao {
    void save(Employee employee)throws SQLException;
    Employee findByPrimaryKey(long id)throws SQLException;
}
