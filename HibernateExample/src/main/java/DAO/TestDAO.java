package DAO;

import java.sql.SQLException;
import java.util.List;

import logic.Test;
/**
 * Created by Dell on 6/8/2015.
 */
public interface TestDAO {
    public void addTest(Test test) throws SQLException;
    public void updateTest(Test test)throws SQLException;
    public Test getTestById(Long tid)throws SQLException;
    public List getAllTest() throws SQLException;
    public void deleteTest(Test test)throws SQLException;
}
