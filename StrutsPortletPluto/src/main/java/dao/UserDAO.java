package dao;


import dao.utility.ConnectionUtility;
import model.User;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Oleg Romanenchuk
 */
public class UserDAO {
    // i made a simple singleton class UserDAO
    public static UserDAO userDAO = null;

    private UserDAO() {

    }

    public static UserDAO getInstance() {
        synchronized (UserDAO.class) {
            if (userDAO == null) {
                userDAO = new UserDAO();
            }
        }
        return userDAO;
    }

    public User createUser(User user) throws SQLException, IllegalAccessException, IOException, ClassNotFoundException {
        Connection connection = ConnectionUtility.getInstance().getConnection();
        PreparedStatement query = connection.prepareStatement("INSERT INTO user VALUES (?, ?, ?, ?)");
        query.setString(1, user.getId());
        query.setString(2, user.getName());
        query.setString(3, user.getPassword());
        query.setString(4, user.getEmail());

        try {
            query.execute();
            return user;
        } catch (Exception e) {
            query.close();
            connection.close();
            throw new SQLException(e);
        }
    }

    public boolean deleteUser(User user) {
        return false;
    }

    public boolean updateUser(User user, String userId) {
        return false;
    }
}
