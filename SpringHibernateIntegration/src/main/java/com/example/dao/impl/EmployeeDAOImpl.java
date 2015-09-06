package com.example.dao.impl;

import com.example.dao.EmployeeDAO;
import com.example.model.Employee;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by Oleg Romanenchuk on 9/6/2015.
 */
@Repository("com/example/dao/EmployeesDAO.java")
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;


    public void persistEmployee(Employee employee) {
        sessionFactory.getCurrentSession().persist(employee);
    }

    public Employee findEmployeeById(int id) {
        return (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
    }

    public void updateEmployee(Employee employee) {
        sessionFactory.getCurrentSession().update(employee);
    }

    public void deleteEmployee(Employee employee) {
        sessionFactory.getCurrentSession().delete(employee);
    }
}
