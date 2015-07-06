package J2EE.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dell on 6/20/2015.
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> famalePersons = new ArrayList<Person>();

        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")){
                famalePersons.add(person);
            }
        }
        return famalePersons;
    }
}
