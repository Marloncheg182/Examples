package java.hibernateSpringExample;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.Collection;

/**
 * Created by Dell on 6/9/2015.
 */
public class StudentHibernateDAO extends HibernateDaoSupport implements StudentDAO {
    @Override
    public Student get(Long id) {
        return (Student) getSession().get(Student.class, id);
    }

    @Override
    protected HibernateTemplate createHibernateTemplate(SessionFactory sessionFactory) {
        HibernateTemplate result = super.createHibernateTemplate(sessionFactory);
        result.setAllowCreate(false);
        return result;
    }

    public StudentHibernateDAO() {

    }

    @Override
    public Student save(Student objectToSave) {
        getSession().saveOrUpdate(objectToSave);
        return objectToSave;
    }

    @SuppressWarnings("unchacked")
    public Collection<Student> find(String name) {
        return getSession().createQuery("from Student s where s.name like :name").setString("name", name).list();
    }
}
