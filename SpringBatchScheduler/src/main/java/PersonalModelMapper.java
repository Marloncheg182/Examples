import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Oleg Romanenchuk on 8/30/2015.
 */
public class PersonalModelMapper implements RowMapper
{
    public PersonalModel mapRow(ResultSet resultSet, int i) throws SQLException {
        PersonalModel person  = new PersonalModel();
        person.setFirstName(resultSet.getString("firstName"));
        person.setLastName(resultSet.getString("lastName"));
        person.setSchool(resultSet.getString("school"));
        person.setRollNumber(resultSet.getInt("rollNumber"));

        return person;
    }
}
