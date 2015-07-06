package J2EE.DAO;

/**
 * Created by Dell on 6/21/2015.
 */
public class DAOLoader {
    public static void main(String[] args) {

        StudentDAO studentDAO = new StudentDAOImpl();

        // print all students
        for (Student student : studentDAO.getAllStudent()) {
            System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
        }

        // update student
        Student student = studentDAO.getAllStudent().get(0);
        student.setName("Michael");
        studentDAO.updateStudent(student);

        // get the student
        studentDAO.getStudent(0);
        System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
    }
}
