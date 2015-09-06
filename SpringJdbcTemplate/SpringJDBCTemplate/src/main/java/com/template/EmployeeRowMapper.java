package com.template;

import com.example.Employee;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Oleg Romanenchuk on 9/6/2015.
 */
@SuppressWarnings("rawtypes")
public class EmployeeRowMapper implements RowMapper{
    public Object mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Employee employee = new Employee();
        employee.setId(resultSet.getInt("ID"));
        employee.setName(resultSet.getString("NAME"));
        employee.setAge(resultSet.getInt("AGE"));
        return employee;
    }
}
