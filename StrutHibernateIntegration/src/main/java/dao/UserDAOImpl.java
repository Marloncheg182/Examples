package dao;

import model.User;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * @author Oleg Romanenchuk
 */
public class UserDAOImpl implements UserDAO {

    private SessionFactory factory;

    public UserDAOImpl(SessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public User getUserByCredentials(String userId, String password) {
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from User where id=:id and password=:password");
        query.setString("id",userId );query.setString("password", password);
        User user = (User)query.uniqueResult();
        if (user!=null){
            System.out.println("User resolved" + user);
        }
            transaction.commit(); session.close();
        return user;
    }
}
