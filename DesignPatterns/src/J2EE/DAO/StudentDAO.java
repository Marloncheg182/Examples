package J2EE.DAO;

import java.util.List;

/**
 * Created by Dell on 6/21/2015.
 */
public interface StudentDAO {
    public List<Student> getAllStudent();
    public Student getStudent(int rollNo);
    public void updateStudent (Student name);
    public void deleteStudent ( Student name);

}
