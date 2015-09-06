package dao;

import java.sql.SQLException;

/**
 * Created by Oleg Romanenchuk on 8/31/2015.
 */
public interface UserDao {
    public boolean isValidUser(String username, String password) throws SQLException;

}
