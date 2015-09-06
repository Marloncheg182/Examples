import com.spring.cassandra.example.entity.Person;
import com.spring.cassandra.example.entity.PersonRepo;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by Oleg Romanenchuk on 8/29/2015.
 */
public class Application {
    public static void main(String[] args) {
        {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new ClassPathResource("resources/spring-config.xml").getPath());
            PersonRepo personRepo = context.getBean(PersonRepo.class);
            Person personAchilles = new Person();
            personAchilles.setpId(1);
            personAchilles.setName("Achilles");
            personRepo.save(personAchilles);
            Person personHektor = new Person();
            personHektor.setpId(2);
            personHektor.setName("Hektor");
            personRepo.save(personHektor);
            Iterable<Person> personList = personRepo.findAll();
            System.out.println("Person List : ");
            for (Person person : personList)
            {
                System.out.println(person);
            }
            System.out.println("Person with Id 1 is "+personRepo.fetchByPId(1));
            context.close();
        }
    }

}
}
