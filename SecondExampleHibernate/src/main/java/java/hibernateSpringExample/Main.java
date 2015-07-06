package java.hibernateSpringExample;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Created by Dell on 6/9/2015.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext"}, true);
        StudentDAO studentDAO = (StudentDAO)context.getBean("dataDao");
        Student data1 = new Student("Alex", 20);
        studentDAO.save(data1);
        Student data2 = new Student("Bob", 22);
        studentDAO.save(data2);
        Student data3 = new Student("Alice", 19);
        studentDAO.save(data3);
        System.out.println(studentDAO.find("A%").size());
    }
}
