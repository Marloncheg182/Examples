package examples.util;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Oleg Romanenchuk on 9/1/2015.
 */
public class PersonMapper implements RowMapper {
    public Person mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Person person = new Person();
        person.setFirstName(resultSet.getString("firstName"));
        person.setLastName(resultSet.getString("lastName"));
        person.setSchool(resultSet.getString("school"));

        return person;
    }
}
