package J2EE.DAO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dell on 6/21/2015.
 */
public class StudentDAOImpl implements StudentDAO {
    // list is working as a database
    List<Student> students;

    public StudentDAOImpl() {
        students = new ArrayList<Student>();
        Student student1 = new Student("Rob", 0);
        Student student2 = new Student("John", 1);
    }

    @Override
    public void deleteStudent(Student student) {
    students.remove(student.getRollNo());
        System.out.println("Student : RollNo" + student.getRollNo() + ", deleted from database");
    }

    @Override
    public List<Student> getAllStudent() {
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
   students.get(student.getRollNo());
        System.out.println("Student : RollNo" + + student.getRollNo() + ", updated in the database");
    }
}
