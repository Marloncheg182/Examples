package com;

import com.bean.Employee;
import com.dao.EmployeeDao;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.SQLException;

/**
 * Created by Oleg Romanenchuk on 9/2/2015.
 */

@Repository("EmployeeDaoImpl")
@Transactional(propagation = Propagation.REQUIRED)
public class EmployeeDaoImpl implements EmployeeDao {

    @PersistenceContext
    private EntityManager entityManager;

    public void save(Employee employee) throws SQLException {
       entityManager.persist(employee);
    }

    public Employee findByPrimaryKey(long id) throws SQLException {
        Employee employee = entityManager.find(Employee.class,id);
        return employee;
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
