package DAO.Impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DAO.TestDAO;
import logic.Test;
import org.hibernate.Session;
import util.HibernateUtil;


import javax.swing.*;

/**
 * Created by Dell on 6/9/2015.
 */
public class TestDAOImpl implements TestDAO {
    @Override
    public void addTest(Test test) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(test);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "?????? I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }

        }


    }

    @Override
    public void updateTest(Test test) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(test);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "?????? I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }

        }


    }

    @Override
    public Test getTestById(Long tid) throws SQLException {
        Session session = null;
        ;
        Test test = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            test = (Test) session.load(Test.class, tid);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "?????? I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return test;
    }


    @Override
    public List<Test> getAllTest() throws SQLException {
        Session session = null;
        List<Test> tests = new ArrayList<>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            tests = session.createCriteria(Test.class).list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "?????? I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return tests;

    }

    @Override
    public void deleteTest(Test test) throws SQLException {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(test);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "?????? I/O", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }

        }
    }
}



