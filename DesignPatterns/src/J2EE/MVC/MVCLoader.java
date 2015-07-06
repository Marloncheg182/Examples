package J2EE.MVC;

/**
 * Created by Dell on 6/21/2015.
 */
public class MVCLoader {
    public static void main(String[] args) {

        // fetch student record base on his roll no from the database
        StudentModel model = retrieveStudentFromDataBase();

        // Create a view : to write student details on console
        StudentView view = new StudentView();

        // Create a controller
        StudentController controller = new StudentController(model, view);

        controller.updateView();

        // update model data
        controller.setStudentName("John");
        controller.updateView();
    }
     private static StudentModel retrieveStudentFromDataBase(){
         StudentModel student = new StudentModel();
         student.setName("Robert");
         student.setRollNo("10");
         return student;

     }
}
