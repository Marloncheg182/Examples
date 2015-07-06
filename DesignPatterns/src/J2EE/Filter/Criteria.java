package J2EE.Filter;

import java.util.List;

/**
 * Created by Dell on 6/20/2015.
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
