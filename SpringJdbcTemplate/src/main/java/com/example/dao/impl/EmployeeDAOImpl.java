package com.example.dao.impl;

import com.example.Employee;
import com.example.dao.EmployeeDAO;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Oleg Romanenchuk on 9/6/2015.
 */
public class EmployeeDAOImpl implements EmployeeDAO {

    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insert(Employee employee) {
        String sql = "INSERT INTO examples.employees" + "(ID, NAME, AGE) VALUES(?, ?, ?)";
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, employee.getId());
            ps.setString(2, employee.getName());
            ps.setInt(3, employee.getAge());
            ps.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public Employee findById(int id) {
        String sql = "SELECT * FROM EMPLOYEES WHERE ID = ?";
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            Employee employee = null;
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                employee = new Employee(
                        rs.getInt("ID"),
                        rs.getString("NAME"),
                        rs.getInt("AGE"));
            }
            ps.close();
            rs.close();
            return employee;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if (connection !=null){
                try {
                    connection.close();
                }catch (SQLException e){}
            }
        }

    }
}
