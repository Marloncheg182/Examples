package com.spring.examples.util;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Oleg Romanenchuk on 8/30/2015.
 */
public class PersonMapper implements RowMapper {
    public Person mapRow(ResultSet resultSet, int i) throws SQLException {
        Person person = new Person();
        person.setFirstName(resultSet.getString("firstName"));
        person.setLastName(resultSet.getString("lastName"));
        person.setSchool(resultSet.getString("school"));
        person.setRollNumber(resultSet.getInt("rollNumber"));

        return person;
    }
}
