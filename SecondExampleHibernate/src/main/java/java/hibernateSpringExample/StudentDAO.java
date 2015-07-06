package java.hibernateSpringExample;

import java.util.Collection;
/**
 * Created by Dell on 6/9/2015.
 */
public interface StudentDAO {
    Student get(Long id);
    Student save(Student stud);
    Collection<Student> find(String text);
}
